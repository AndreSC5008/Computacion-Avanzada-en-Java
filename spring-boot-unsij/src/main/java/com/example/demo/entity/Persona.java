/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

import com.example.demo.dto.PersonaDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author jajimenez
 */
@Entity
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column()
    private String nombre;

    @Column()
    private String apellido;
    
    @Column()
    private String edad; 
    @Column()
    private String sexo; 
    @Column()
    private Double estatura;
    @Column()
    private Double peso;
    @Column()
    private Double IMC;
    @Column()
    private String fecha;

    public Persona() {

    }

    public Persona(PersonaDTO personaDTO) {
        this.nombre = personaDTO.getNombre();
        this.apellido = personaDTO.getApellido();
        this.edad=personaDTO.getEdad();
        this.sexo=personaDTO.getSexo();
        this.estatura=personaDTO.getEstatura();
        this.peso=personaDTO.getPeso();
        this.IMC=peso/(estatura*estatura);
        this.fecha=personaDTO.getFecha();

    }
}
