package com.ewtm.whitelabel.service;


import com.ewtm.whitelabel.entity.Paciente;
import com.ewtm.whitelabel.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;


    public Paciente insert(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> findAll() {
        return  pacienteRepository.findAll();
    }



}
