package com.cardocs.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {

    @GetMapping("/home")
    public String index(){
        return "Hello world";

    }
}
