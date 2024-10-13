package com.springbatch.steps.job1;

import com.springbatch.dto.DadosBaseDTO;
import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<DadosBaseDTO, DadosBaseDTO> {

    @Override
    public DadosBaseDTO process(DadosBaseDTO dadosBaseDTO) throws Exception {
        return aplicaRegras(dadosBaseDTO);
    }

    private DadosBaseDTO aplicaRegras(DadosBaseDTO dadosBaseDTO) {
        return dadosBaseDTO;
    }
}
