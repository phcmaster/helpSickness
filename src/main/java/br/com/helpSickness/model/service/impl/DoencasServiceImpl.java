package br.com.helpSickness.model.service.impl;

import br.com.helpSickness.model.entity.DoencasEntity;
import br.com.helpSickness.model.repositoy.DoencasRepository;
import br.com.helpSickness.model.service.DoencasService;

import java.util.List;

public class DoencasServiceImpl implements DoencasService {

    private DoencasRepository doencasRepository;

    public List<DoencasEntity> listarDoencas() {

        return doencasRepository.findAll();
    }

    public DoencasEntity salvarDoenca(DoencasEntity entity) {

       return doencasRepository.save(entity);
    }



}
