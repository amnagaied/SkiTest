package org.example.stationski.Services.Interfaces;

import org.example.stationski.Entities.Abonnement;
import org.example.stationski.Entities.Cours;

import java.util.List;

public interface CourService {
    Cours AjouterCours(Cours cours);
    Cours ModifierCours(Cours cours);
    void SupprimerCours(Long id);
    Cours GetCours(Long id);
    List<Cours> GetAllCours();

}
