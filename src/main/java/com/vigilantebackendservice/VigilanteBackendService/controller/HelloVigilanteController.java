package com.vigilantebackendservice.VigilanteBackendService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloVigilanteController {
    @GetMapping("/")
    public String getDefaultPage() {
        return "Hello! This is the Vigilante Backend Service";
    }
    
    @GetMapping("/home")
    public String getHomePage() {
        return "Hello! Welcome to Vigilante.";
    }
    
}
