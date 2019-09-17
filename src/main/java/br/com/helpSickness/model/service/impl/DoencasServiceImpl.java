package br.com.helpSickness.model.service.impl;

import br.com.helpSickness.model.entity.DoencasEntity;
import br.com.helpSickness.model.repositoy.DoencasRepository;
import br.com.helpSickness.model.service.DoencasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DoencasServiceImpl implements DoencasService {

    @Autowired
    private DoencasRepository doencasRepository;

    public List<DoencasEntity> listarDoencas() {

        return doencasRepository.findAll();
    }

    public DoencasEntity salvarDoenca(DoencasEntity entity) {

       return doencasRepository.save(entity);
    }

    @Override
    public void deletar(int id) {

        this.doencasRepository.deleteById(id);
    }


}
