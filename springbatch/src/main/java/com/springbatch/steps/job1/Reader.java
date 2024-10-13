package com.springbatch.steps.job1;

import com.springbatch.dto.DadosBaseDTO;
import com.springbatch.service.ServiceBase;
import com.springbatch.service.impl.ServiceBaseImpl;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.List;

public class Reader implements ItemReader<DadosBaseDTO> {

    private int count = 0;
    private ServiceBase serviceBase;

    @Override
    public DadosBaseDTO read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        return consomeApi();
    }

    private DadosBaseDTO consomeApi() {
        serviceBase = new ServiceBaseImpl();

        var dados = serviceBase.getAll();

        if(count < dados.size())
            return dados.get(count++);

        count = 0;
        return null;
    }

}
