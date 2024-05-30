package com.curriculo.curriculum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("curriculo")
public class CurriculoController {

    private final CurriculoService curriculoService;

    @Autowired
    public CurriculoController(CurriculoService curriculoService) {
        this.curriculoService = curriculoService;
    }

    @PostMapping
    public CurriculoModel createCurriculo(@RequestBody CurriculoModel curriculoModel){
        return curriculoService.createCurriculo(curriculoModel);
    }

    @GetMapping
    public List<CurriculoModel> buscarCurriculo(){
        return curriculoService.readCurriculos();
    }

    @GetMapping("/{id}")
    public Optional<CurriculoModel> buscarCurriculoPorId(@PathVariable UUID id){
        return curriculoService.readCurriculoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCurriculo(@PathVariable UUID id){
    curriculoService.deleteCurriculo(id);
    }

    @PutMapping ("/{id}")
    public Optional<CurriculoModel> updateCurriculo(@PathVariable UUID id, @RequestBody CurriculoModel curriculoModel){
        return curriculoService.updateCurriculo(id, curriculoModel);
    }
}
