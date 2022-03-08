package com.example.persona.services;

import com.example.persona.domain.Persona;
import com.example.persona.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona createPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public Iterable<Persona> getPersona(){
        return personaRepository.findAll();
    }

    public void deletePersonaById(String id){
        personaRepository.deleteById(id);
    }

}
