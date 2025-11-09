package org.example.stationski.Services.Impl;

import org.example.stationski.Entities.Cours;
import org.example.stationski.Repositories.CoursRepository;
import org.example.stationski.Services.Interfaces.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursServiceImpl implements CourService {
    @Autowired
    CoursRepository coursRepo;
    @Override
    public Cours AjouterCours(Cours cours) {
        return  coursRepo.save(cours);    }

    @Override
    public Cours ModifierCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public void SupprimerCours(Long id) {
        coursRepo.deleteById(id);

    }

    @Override
    public Cours GetCours(Long id) {
        return coursRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Cours> GetAllCours() {
        return coursRepo.findAll();
    }

}
