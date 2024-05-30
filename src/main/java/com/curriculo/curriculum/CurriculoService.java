package com.curriculo.curriculum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CurriculoService {
    private final CurriculoRepository curriculoRepository;

    @Autowired
    public CurriculoService(CurriculoRepository curriculoRepository) {
        this.curriculoRepository = curriculoRepository;
    }

    public CurriculoModel createCurriculo(CurriculoModel curriculoModel) {
        return curriculoRepository.save(curriculoModel);
    }

    public List<CurriculoModel> readCurriculos(){
        return curriculoRepository.findAll();
    }

    public Optional<CurriculoModel> readCurriculoById(UUID id){
        return curriculoRepository.findById(id);
    }

    public void deleteCurriculo(UUID id){
        curriculoRepository.deleteById(id);
    }

    public Optional<CurriculoModel> updateCurriculo(UUID id, CurriculoModel updatedCurriculo) {
        return curriculoRepository.findById(id)
                .map(curriculo -> {
                    curriculo.setNome((updatedCurriculo.getNome() == null) ? curriculo.getNome() : updatedCurriculo.getNome());
                    curriculo.setIdade((updatedCurriculo.getIdade() == 0) ? curriculo.getIdade() : updatedCurriculo.getIdade());
                    curriculo.setTelefone((updatedCurriculo.getTelefone() == null) ? curriculo.getTelefone() : updatedCurriculo.getTelefone());
                    curriculo.setEndereco((updatedCurriculo.getEndereco() == null) ? curriculo.getEndereco() : updatedCurriculo.getEndereco());
                    curriculo.setEmail((updatedCurriculo.getEmail() == null) ? curriculo.getEmail() : updatedCurriculo.getEmail());
                    curriculo.setObjetivo((updatedCurriculo.getObjetivo() == null) ? curriculo.getObjetivo() : updatedCurriculo.getObjetivo());
                    curriculo.setFormacao((updatedCurriculo.getFormacao() == null) ? curriculo.getFormacao() : updatedCurriculo.getFormacao());
                    curriculo.setCurso((updatedCurriculo.getCurso() == null) ? curriculo.getCurso() : updatedCurriculo.getCurso());
                    curriculo.setExperiencias((updatedCurriculo.getExperiencias() == null) ? curriculo.getExperiencias() : updatedCurriculo.getExperiencias());
                    return curriculoRepository.save(curriculo);
                });
    }

}
