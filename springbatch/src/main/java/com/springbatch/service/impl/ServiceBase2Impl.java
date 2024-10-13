package com.springbatch.service.impl;

import com.springbatch.config.RestTemplateConfig;
import com.springbatch.dto.DadosBaseDTO;
import com.springbatch.service.ServiceBase2;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceBase2Impl implements ServiceBase2 {

    private RestTemplateConfig restTemplateConfig;

    @Override
    public void save(DadosBaseDTO dto) {
        try{
            restTemplateConfig = new RestTemplateConfig();

            RestTemplate restTemplate = restTemplateConfig.restTemplateBase("http://localhost:8082");
            restTemplate.postForObject("dados-2/save", dto, String.class);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
