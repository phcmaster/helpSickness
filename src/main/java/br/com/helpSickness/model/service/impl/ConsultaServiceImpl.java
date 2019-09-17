package br.com.helpSickness.model.service.impl;


import br.com.helpSickness.model.domain.ConsultaRequest;
import br.com.helpSickness.model.domain.DoencasProbabilidade;
import br.com.helpSickness.model.entity.DoencasEntity;
import br.com.helpSickness.model.entity.SintomasEntity;
import br.com.helpSickness.model.service.ConsultaService;
import br.com.helpSickness.model.service.DoencasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ConsultaServiceImpl implements ConsultaService {

    @Autowired
    private DoencasService doencasService;

    private List<DoencasProbabilidade> listaDoencasProb = new ArrayList<>();

  @Override
  public List<DoencasProbabilidade> verficarSintomas(List<SintomasEntity> listSintomas){

      listSintomas.forEach(sintoma -> {
          verificaProbabilidade(sintoma);
      });

      return listaDoencasProb;
    }

    public void verificaProbabilidade(SintomasEntity sintoma){

        List<DoencasEntity> listaDoencas =  doencasService.listarDoencas();
        DoencasProbabilidade prob = new DoencasProbabilidade();

        listaDoencas.forEach(doenca -> {
            doenca.getSintomas().forEach(s -> {
                if(s.getIdSintoma() == sintoma.getIdSintoma()){
                    prob.setContador(prob.getContador() + 1);
                    prob.setDoenca(doenca);
                    calculaProbabilidade(prob, doenca);
                }

                });
            listaDoencasProb.add(prob);
        });
    }

    public void calculaProbabilidade(DoencasProbabilidade doencaProb, DoencasEntity doencas){
      Integer totalDoencas = doencas.getSintomas().size();
      Integer matchSintomas = doencaProb.getContador();
      Double probabilidade = (matchSintomas * 100.00) / totalDoencas;
      doencaProb.setProbabilidade(probabilidade);
    }



}
