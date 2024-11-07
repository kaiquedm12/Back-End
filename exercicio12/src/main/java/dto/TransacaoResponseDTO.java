package dto;

public record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, double valor) {}