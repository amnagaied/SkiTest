package org.example.stationski.Services.Interfaces;

import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Inscription;

import java.util.List;

public interface InscriptionService {
    Inscription AjouterInscription(Inscription inscription);
    Inscription ModifierInscription(Inscription inscription);
    void SupprimerInscription(Long id);
    Inscription GetInscription(Long id);
    List<Inscription> GetAllInscription();
}
