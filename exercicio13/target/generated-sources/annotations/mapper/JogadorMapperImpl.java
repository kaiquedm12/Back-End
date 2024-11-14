package mapper;

import dto.JogadorRequestDTO;
import javax.annotation.processing.Generated;
import model.Jogador;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-07T19:16:59-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.2 (Oracle Corporation)"
)
public class JogadorMapperImpl implements JogadorMapper {

    @Override
    public Jogador toJogador(JogadorRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Jogador jogador = new Jogador();

        jogador.setNome( dto.getNome() );
        jogador.setApelido( dto.getApelido() );

        return jogador;
    }
}
