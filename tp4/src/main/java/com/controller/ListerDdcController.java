package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListerDdcController {

    @RequestMapping("/listerDdc")
    public String listerDdc() {
        return "listerDdc"; // Vue logique pour la liste des demandes de congés
    }
}