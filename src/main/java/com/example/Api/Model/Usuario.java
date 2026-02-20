package com.example.Api.Model;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "usuarios")
@Data

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private  String nombre;

    private String apellido;

    private String contraseña;

}