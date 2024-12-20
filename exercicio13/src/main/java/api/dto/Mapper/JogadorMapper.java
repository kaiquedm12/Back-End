package api.dto.mapper;

import api.dto.JogadorDTO;
import model.entity.Jogador;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class JogadorMapper {
    public Jogador toEntity(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        jogador.setHabilidade(new Random().nextInt(101)); // Gera uma habilidade aleatória entre 0 e 100
        return jogador;
    }

    public JogadorDTO toDTO(Jogador jogador) {
        return new JogadorDTO(jogador.getNome(), jogador.getApelido(), jogador.getHabilidade());
    }
}