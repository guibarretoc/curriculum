package com.curriculo.curriculum;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CurriculoRepository extends JpaRepository<CurriculoModel, UUID> {


}
