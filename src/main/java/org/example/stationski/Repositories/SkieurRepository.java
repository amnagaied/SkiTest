package org.example.stationski.Repositories;

import org.example.stationski.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
