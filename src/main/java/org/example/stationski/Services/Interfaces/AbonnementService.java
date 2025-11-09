package org.example.stationski.Services.Interfaces;

import org.example.stationski.Entities.Abonnement;

import java.util.List;

public interface AbonnementService {
    Abonnement AjouterAbonnement(Abonnement abonnement);
    Abonnement ModifierAbonnement(Abonnement abonnement);
    void SupprimerAbonnement(Long id);
    Abonnement GetAbonnement(Long id);
    List<Abonnement> GetAllAbonnement();


}
