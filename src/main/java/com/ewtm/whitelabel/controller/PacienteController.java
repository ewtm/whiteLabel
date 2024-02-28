package com.ewtm.whitelabel.controller;


import com.ewtm.whitelabel.entity.Paciente;
import com.ewtm.whitelabel.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("paciente")
public class PacienteController {


    @Autowired
    PacienteService pacienteService;


    @PostMapping
    public ResponseEntity<?> insert(Paciente paciente){
        return ResponseEntity.ok(pacienteService.insert(paciente));
    }

    @GetMapping
    public List<Paciente> findAll(){
        return pacienteService.findAll();
    }



}
