package controller;


import dto.TransacaoRequestDTO;
import dto.TransacaoResponseDTO;
import mapper.ContaMapper;
import model.Conta;
import service.TransacoesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TransController {

    private final TransacoesService transacoesService;

    public TransController(TransacoesService transacoesService) {
        this.transacoesService = transacoesService;
    }

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        Conta contaOrigem = transacoesService.getContaByCodigo(request.origem());
        Conta contaDestino = transacoesService.getContaByCodigo(request.destino());

        if (contaOrigem == null || contaDestino == null) {
            return ResponseEntity.badRequest().build();
        }

        TransacaoResponseDTO response = new TransacaoResponseDTO(
                ContaMapper.toDTO(contaOrigem),
                ContaMapper.toDTO(contaDestino),
                request.valor()
        );

        return ResponseEntity.ok(response);

    }


}