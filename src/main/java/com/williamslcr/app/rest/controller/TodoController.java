package com.williamslcr.app.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping(value = "/")
    public String holaMundo() {
        return "Hola mundo";
    }

}
