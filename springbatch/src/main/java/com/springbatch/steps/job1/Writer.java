package com.springbatch.steps.job1;

import com.springbatch.dto.DadosBaseDTO;
import com.springbatch.service.ServiceBase2;
import com.springbatch.service.impl.ServiceBase2Impl;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class Writer implements ItemWriter<DadosBaseDTO> {

    private ServiceBase2 serviceBase2;

    @Override
    public void write(List<? extends DadosBaseDTO> list) throws Exception {
        for(DadosBaseDTO item : list){
            consomeApiSave(item);
        }
    }

    private void consomeApiSave(DadosBaseDTO item){
        serviceBase2 = new ServiceBase2Impl();
        serviceBase2.save(item);
    }

}
