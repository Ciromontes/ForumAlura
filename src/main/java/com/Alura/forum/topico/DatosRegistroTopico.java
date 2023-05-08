package com.Alura.forum.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import javax.print.attribute.standard.DateTimeAtCompleted;

public record DatosRegistroTopico(
        @NotNull
        String titulo,
        @NotNull
        String mensaje,
        @NotNull
        String autor,
        @NotNull
        Curso curso,
        @NotNull
        DateTimeAtCompleted fecha,
        @NotNull
        String status)
{
}
