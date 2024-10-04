package com.example.fipe.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/carros")
public class VeiculoController extends FipeResponse {
    // Método POST para receber os dados do carro

    @PostMapping("/fipe")

    public Mono<ResponseEntity<?>> obterValorFipe(@RequestBody CarroRequest carro) {
        // Constrói a URL da API FIPE com os parâmetros de marca, modelo e ano
        String urlFipe = String.format("https://api.fipe.com.br/v1/carros/marcas/%s/modelos/%s/anos/%d",
                carro.getMarca(), carro.getModelo(), carro.getAno());

        // Cria um WebClient para fazer a requisição à API da FIPE
        WebClient client = WebClient.create();

        // Faz a requisição GET para a API e espera o resultado
        return client.get()
                .uri(urlFipe)
                .retrieve()
                .bodyToMono(FipeResponse.class)
                .map(FipeResponse -> ResponseEntity.ok(new FipeValorResponse(FipeResponse.getValor(), "Setembro de 2024")))
                .onErrorResume(e -> Mono.just(ResponseEntity.badRequest().body("Erro ao buscar valor FIPE: " + e.getMessage())));
    }
}


