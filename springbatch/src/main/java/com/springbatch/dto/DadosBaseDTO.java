package com.springbatch.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadosBaseDTO {

    private int Id;
    private String Nome;
    private String descricao;
    private String email;
    private String senha;


}
