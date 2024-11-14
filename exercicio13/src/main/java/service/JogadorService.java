package service;

import api.dto.JogadorDTO;
import api.dto.mapper.JogadorMapper;
import model.entity.Jogador;
import model.entity.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toEntity(jogadorDTO);
        jogador = jogadorRepository.save(jogador);
        return jogadorMapper.toDTO(jogador);
    }

    public List<JogadorDTO> listarJogadores() {
        List<JogadorDTO> lista = jogadorRepository
                .findAll()
                .stream()
                .map(jogador -> jogadorMapper.toDTO(jogador))
                .collect(Collectors.toList());
        return lista;
    }
}
