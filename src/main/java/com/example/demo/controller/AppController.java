package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value={"/","/index"})
public class AppController {

    @RequestMapping(value="")
    public ResponseEntity<String> Listen(){
        return  ResponseEntity.status(HttpStatus.OK).body("Escuchando");
    }
}
