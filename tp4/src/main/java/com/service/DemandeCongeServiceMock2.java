package com.service;

import org.springframework.stereotype.Service;

import com.model.DemandeConge;

@Service
public class DemandeCongeServiceMock2 {

    public DemandeConge getDemande(int ddcId) {
        return new DemandeConge(ddcId, "John Doe", "2024-12-15", "2024-12-20");
    }
}