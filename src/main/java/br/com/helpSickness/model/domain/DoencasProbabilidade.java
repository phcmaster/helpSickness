package br.com.helpSickness.model.domain;

import br.com.helpSickness.model.entity.DoencasEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoencasProbabilidade {

    private DoencasEntity doenca;

    private Integer contador = 0;

    private Double probabilidade;
}
