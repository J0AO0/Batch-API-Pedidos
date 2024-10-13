package com.springbatch.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbatch.config.RestTemplateConfig;
import com.springbatch.dto.DadosBaseDTO;
import com.springbatch.service.ServiceBase;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceBaseImpl implements ServiceBase {

    private ObjectMapper objectMapper = new ObjectMapper();
    private RestTemplateConfig restTemplateConfig;

    @Override
    public List<DadosBaseDTO> getAll() {
        try{
            restTemplateConfig = new RestTemplateConfig();
            RestTemplate restTemplate = restTemplateConfig.restTemplateBase("http://localhost:8081");
            String json = restTemplate.getForObject("dados-1/get-all", String.class);

            return Arrays.asList(objectMapper.readValue(json, DadosBaseDTO[].class));
        } catch (Exception ex){
            ex.printStackTrace();
        }

        return null;
    }
}
