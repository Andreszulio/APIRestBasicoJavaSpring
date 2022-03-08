package com.example.persona.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@Document
@Builder(toBuilder = true)
public class Persona {

    private String nombre;
    private String apellido;

    @Id
    private String identificacion;

    private String telefono;


}
