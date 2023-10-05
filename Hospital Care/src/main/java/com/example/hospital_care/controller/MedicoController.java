package com.example.hospital_care.controller;

import com.example.hospital_care.model.Paciente;
import com.example.hospital_care.repository.MedicoRepository;
import com.example.hospital_care.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public List<Paciente> getPacientes(){
        return pacienteRepository.findAll();
    }
}

