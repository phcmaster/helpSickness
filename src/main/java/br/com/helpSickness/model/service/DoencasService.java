package br.com.helpSickness.model.service;

import br.com.helpSickness.model.entity.DoencasEntity;

import java.util.List;

public interface DoencasService {

   List<DoencasEntity> listarDoencas();

   DoencasEntity salvarDoenca(DoencasEntity entity);
}

