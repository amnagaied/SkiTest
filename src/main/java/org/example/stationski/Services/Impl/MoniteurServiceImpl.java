package org.example.stationski.Services.Impl;

import org.example.stationski.Entities.Moniteur;
import org.example.stationski.Repositories.MoniteurRepository;
import org.example.stationski.Services.Interfaces.MoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MoniteurServiceImpl implements MoniteurService {
    @Autowired

   MoniteurRepository moniteurRepository;


    @Override
    public Moniteur AjouterMoniteur(Moniteur moniteur) {
        return  moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur ModifierMoniteur(Moniteur moniteur) {
        return  moniteurRepository.save(moniteur);
    }

    @Override
    public void SupprimerMoniteur(Long id) {
        moniteurRepository.deleteById(id);

    }

    @Override
    public Moniteur GetMoniteur(Long id) {
        return moniteurRepository.findById(id).orElseThrow();    }

    @Override
    public List<Moniteur> GetAllMoniteur() {
        return moniteurRepository.findAll();    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        return null;
    }
}
