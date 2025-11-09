package org.example.stationski.Services.Impl;

import org.example.stationski.Entities.Skieur;
import org.example.stationski.Repositories.SkieurRepository;
import org.example.stationski.Services.Interfaces.SkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkieurServiceImpl implements SkieurService {
    @Autowired
    SkieurRepository skieurRepository;

    @Override
    public Skieur AjouterSkieur(Skieur skieur) {
        return  skieurRepository.save(skieur);

    }

    @Override
    public Skieur ModifierSkieur(Skieur skieur) {
        return  skieurRepository.save(skieur);

    }

    @Override
    public void SupprimerSkieur(Long id) {
        skieurRepository.deleteById(id);


    }

    @Override
    public Skieur GetSkieur(Long id) {
        return skieurRepository.findById(id).orElseThrow();

    }

    @Override
    public List<Skieur> GetAllSkieur() {
        return skieurRepository.findAll();
    }
}
