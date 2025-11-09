package org.example.stationski.Services.Impl;

import org.example.stationski.Entities.Abonnement;
import org.example.stationski.Repositories.AbonnementRepository;
import org.example.stationski.Services.Interfaces.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementServiceImpl implements AbonnementService {
    @Autowired
    AbonnementRepository AbonnementRepository;

    @Override
    public Abonnement AjouterAbonnement(Abonnement abonnement) {
        return  AbonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement ModifierAbonnement(Abonnement abonnement) {
        return AbonnementRepository.save(abonnement);
    }

    @Override
    public void SupprimerAbonnement(Long id) {
        AbonnementRepository.deleteById(id);

    }

    @Override
    public Abonnement GetAbonnement(Long id) {
        return AbonnementRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Abonnement> GetAllAbonnement() {
        return AbonnementRepository.findAll();
    }

}
