package org.example.stationski.Services.Interfaces;

import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Skieur;

import java.util.List;

public interface SkieurService {
    Skieur AjouterSkieur(Skieur skieur);
    Skieur ModifierSkieur(Skieur skieur);
    void SupprimerSkieur(Long id);
    Skieur GetSkieur(Long id);
    List<Skieur> GetAllSkieur();
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCourse);

}
