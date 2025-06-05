package com.atividade.banco_imagens.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.banco_imagens.model.ImagemModel;
import com.atividade.banco_imagens.repository.ImagemRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class ImagemService {

    @Autowired 
    ImagemRepository imagemRepository;

    public List<ImagemModel> listarImagens(){
         return imagemRepository.findAll();
    }

    public ImagemModel salvarImagem(ImagemModel imagem){
        return imagemRepository.save(imagem);
    }

    public ImagemModel buscarImagemPorId(Long id){
        return imagemRepository.findById(id).orElse(null);
    }

    public void deletarImagem(Long id){
        imagemRepository.deleteById(id);
    }
    public ImagemModel atualizarImagem(Long id, ImagemModel imagemModel){
        ImagemModel imagemExistente = buscarImagemPorId(id);
        if (imagemExistente != null) {
            imagemExistente.setNome(imagemModel.getNome());
            imagemExistente.setUrl(imagemModel.getUrl());
            return imagemRepository.save(imagemExistente);
        }
        return null;

    }


}
