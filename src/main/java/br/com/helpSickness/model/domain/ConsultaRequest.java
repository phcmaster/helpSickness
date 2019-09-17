package br.com.helpSickness.model.domain;

import br.com.helpSickness.model.entity.SintomasEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

//requisicao de sintomas

@Getter
public class ConsultaRequest {

    @JsonProperty("sintomas")
    List<SintomasEntity> sintomas;

}
