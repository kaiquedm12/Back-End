package mapper;


import model.Conta;
import dto.ContaDTO;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getNome());
    }
}