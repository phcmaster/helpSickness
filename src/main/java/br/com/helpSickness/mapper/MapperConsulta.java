package br.com.helpSickness.mapper;

import br.com.helpSickness.model.domain.ConsultaResponse;
import br.com.helpSickness.model.domain.DoencasProbabilidade;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


//maapper - > fazer o mapeamento entre as classes

@Component
public class MapperConsulta {

    public ConsultaResponse mapResponse(List<DoencasProbabilidade> listDoencas){
        ConsultaResponse consultaResponse = new ConsultaResponse();
        List<DoencasProbabilidade> listResponse = new ArrayList<>();

        listResponse.forEach(response -> {
            listDoencas.forEach(doenca ->
            {
            response.setProbabilidade(doenca.getProbabilidade());
            response.setDoenca(doenca.getDoenca());
            response.setContador(doenca.getContador());
            }
            );
        });
        consultaResponse.setListProbabilidades(listResponse);
        return consultaResponse;
    }
}
