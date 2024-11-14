package mapper;

import dto.ContaDTO;
import model.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getNome());
    }
}
