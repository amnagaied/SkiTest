package org.example.stationski.Services.Impl;

import org.example.stationski.Entities.Inscription;
import org.example.stationski.Repositories.InscriptionRepository;
import org.example.stationski.Services.Interfaces.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InscriptionSereviceImpl implements InscriptionService {
    @Autowired

    InscriptionRepository inscriptionRepository;
    @Override

    public Inscription AjouterInscription(Inscription inscription) {

        return  inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription ModifierInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void SupprimerInscription(Long id) {
        inscriptionRepository.deleteById(id);

    }

    @Override
    public Inscription GetInscription(Long id) {
        return inscriptionRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Inscription> GetAllInscription() {
        return inscriptionRepository.findAll();
    }
}
