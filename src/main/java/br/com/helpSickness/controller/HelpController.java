package br.com.helpSickness.controller;

import br.com.helpSickness.mapper.MapperConsulta;
import br.com.helpSickness.model.domain.ConsultaResponse;
import br.com.helpSickness.model.domain.DoencasProbabilidade;
import br.com.helpSickness.model.entity.DoencasEntity;
import br.com.helpSickness.model.entity.SintomasEntity;
import br.com.helpSickness.model.service.ConsultaService;
import br.com.helpSickness.model.service.DoencasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//controlllers - fazem a chamada dos end-points para salvar, listar...

@Controller
@RequestMapping("/api/help-sickness")
public class HelpController {

    @Autowired
    private MapperConsulta mapperConsulta;

    @Autowired
    private DoencasService doencasService;

    @Autowired
    private ConsultaService consultaService;

    @PostMapping("/doencas/salvar")
    public ResponseEntity<DoencasEntity>salva(@RequestBody DoencasEntity entity){

    DoencasEntity doencasEntity = doencasService.salvarDoenca(entity);

        return new ResponseEntity<>(doencasEntity, HttpStatus.OK);

    }

    @GetMapping("/listar")
    public ResponseEntity<List<DoencasEntity>>listarDoencas(){

        List<DoencasEntity> doencasEntities = doencasService.listarDoencas();

        return new ResponseEntity<>(doencasEntities, HttpStatus.OK);

    }

    @PostMapping("/doencas/consultar")
    public ResponseEntity<ConsultaResponse> consultar(@RequestBody List<SintomasEntity> sintomasEntity){

        List<DoencasProbabilidade> list = consultaService.verficarSintomas(sintomasEntity);

        ConsultaResponse response = mapperConsulta.mapResponse(list);

        return new ResponseEntity<ConsultaResponse>(response, HttpStatus.OK);

    }

    @DeleteMapping("/doencas/deletar")
    public String deletar(@PathVariable int id){

         doencasService.deletar(id);

        return "Deletado com sucesso";

    }


}
