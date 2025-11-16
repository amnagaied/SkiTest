package org.example.stationski.Repositories;

import org.example.stationski.Entities.Skieur;
import org.example.stationski.Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
    List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement type);
}
