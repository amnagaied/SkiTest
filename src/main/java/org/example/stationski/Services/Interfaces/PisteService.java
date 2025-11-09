package org.example.stationski.Services.Interfaces;

import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Piste;

import java.util.List;

public interface PisteService {
    Piste AjouterPiste(Piste piste);
    Piste ModifierPiste(Piste piste);
    void SupprimerPiste(Long id);
    Piste GetPiste(Long id);
    List<Piste> GetAllPiste();
}
