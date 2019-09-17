package br.com.helpSickness.model.service;

import br.com.helpSickness.model.entity.DoencasEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoencasService {

   List<DoencasEntity> listarDoencas();

   DoencasEntity salvarDoenca(DoencasEntity entity);

   void deletar(int id);
}

