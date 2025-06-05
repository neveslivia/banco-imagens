package com.atividade.banco_imagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.banco_imagens.model.ImagemModel;

public interface ImagemRepository extends JpaRepository<ImagemModel, Long>{

}
