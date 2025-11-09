package org.example.stationski.Services.Impl;

import org.example.stationski.Entities.Piste;
import org.example.stationski.Repositories.PisteRepository;
import org.example.stationski.Services.Interfaces.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PisteServiceImpl implements PisteService {
    @Autowired
    PisteRepository pisteRepository;
    @Override
    public Piste AjouterPiste(Piste piste) {
        return  pisteRepository.save(piste);
    }

    @Override
    public Piste ModifierPiste(Piste piste) {
        return  pisteRepository.save(piste);

    }

    @Override
    public void SupprimerPiste(Long id) {
        pisteRepository.deleteById(id);

    }

    @Override
    public Piste GetPiste(Long id) {
        return pisteRepository.findById(id).orElseThrow();

    }

    @Override
    public List<Piste> GetAllPiste() {
        return pisteRepository.findAll();

    }
}
