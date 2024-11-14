package com.kaique.exercicio12.mapper;

import com.kaique.exercicio12.dto.ContaDTO;
import com.kaique.exercicio12.model.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getNome());
    }
}
