package org.example.stationski.Services.Interfaces;

import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Moniteur;

import java.util.List;

public interface MoniteurService {
    Moniteur AjouterMoniteur(Moniteur moniteur);
    Moniteur ModifierMoniteur(Moniteur moniteur);
    void SupprimerMoniteur(Long id);
    Moniteur GetMoniteur(Long id);
    List<Moniteur> GetAllMoniteur();
}
