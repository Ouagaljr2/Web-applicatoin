package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.DemandeCongeServiceMock2;

@Controller
public class DetailDdcController {

    @Autowired
    private DemandeCongeServiceMock2 demandeCongeService;

    @RequestMapping("/detailDdc")
    public String detailDdc(@RequestParam("ddcId") int ddcId, Model model) {
        model.addAttribute("demande", demandeCongeService.getDemande(ddcId));
        return "detailDdc"; // Vue logique pour le détail
    }
}