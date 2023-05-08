package com.Alura.forum.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCompleted;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String titulo;
    private String mensaje;

    private String autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;
    private DateTimeAtCompleted fecha;
    private String status;



    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
        this.fecha = datosRegistroTopico.fecha();
        this.status = datosRegistroTopico.status();
        this.status = datosRegistroTopico.status() != null ? datosRegistroTopico.status() : "";
    }
}
