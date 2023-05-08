package com.Alura.forum.controller;


import com.Alura.forum.topico.DatosRegistroTopico;
import com.Alura.forum.topico.Topico;
import com.Alura.forum.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public void registrarMedico(@RequestBody DatosRegistroTopico datosRegistroTopico){
        System.out.println("el request lega correctamente");
        System.out.println(datosRegistroTopico);
        topicoRepository.save(new Topico(datosRegistroTopico));
    }


}
