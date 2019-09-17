package br.com.helpSickness.model.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
//requisicao de probabilidade

@Getter
@Setter
public class ConsultaResponse {

    @JsonProperty("listProbabilidades")
    List<DoencasProbabilidade> listProbabilidades;

}
