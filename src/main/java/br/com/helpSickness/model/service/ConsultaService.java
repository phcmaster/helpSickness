package br.com.helpSickness.model.service;


import br.com.helpSickness.model.domain.DoencasProbabilidade;
import br.com.helpSickness.model.entity.SintomasEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConsultaService {

     List<DoencasProbabilidade> verficarSintomas(List<SintomasEntity> sintomas);


}
