package br.com.helpSickness.controller;

import br.com.helpSickness.model.entity.DoencasEntity;
import br.com.helpSickness.model.entity.TratamentosEntity;
import br.com.helpSickness.model.service.DoencasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/help-sickness")
public class HelpController {

    @Autowired
    private DoencasService doencasService;

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



}
