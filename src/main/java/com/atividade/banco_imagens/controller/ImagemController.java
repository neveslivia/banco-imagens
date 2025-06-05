package com.atividade.banco_imagens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.banco_imagens.model.ImagemModel;
import com.atividade.banco_imagens.service.ImagemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/imagens")
public class ImagemController {

   @Autowired
    ImagemService imagemService;



    
    @PostMapping
    public ImagemModel salvar(@RequestBody ImagemModel imagemModel) {        
        return imagemService.salvarImagem(imagemModel);
    }

    @GetMapping
    public List<ImagemModel> listar(){
        return imagemService.listarImagens();
    }

    @GetMapping("/{id}")
    public ImagemModel buscarPorId(@PathVariable Long id) {
        return imagemService.buscarImagemPorId(id);
    }


    @PutMapping("/{id}")
    public ImagemModel atualizar(@PathVariable Long id, @RequestBody ImagemModel imagemModel) {
        
        return imagemService.atualizarImagem(id, imagemModel);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        imagemService.deletarImagem(id);
    }

    
    
    

}
