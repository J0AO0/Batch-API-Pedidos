package com.springbatch.config;


import com.springbatch.dto.DadosBaseDTO;
import com.springbatch.steps.job1.Processor;
import com.springbatch.steps.job1.Reader;
import com.springbatch.steps.job1.Writer;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job processJobBase1(){
        return jobBuilderFactory.get("processJobBase1")
                .incrementer(new RunIdIncrementer()).listener(listener())
                .flow(orderStepBase1()).end().build();
    }

    @Bean
    public Step orderStepBase1(){
        return stepBuilderFactory.get("orderStepBase1").<DadosBaseDTO, DadosBaseDTO> chunk(2)
                .reader(new Reader())
                .processor(new Processor())
                .writer(new Writer())
                .build();
    }

    public JobExecutionListener listener(){
        return new JobCompletionListener();
    }
}
