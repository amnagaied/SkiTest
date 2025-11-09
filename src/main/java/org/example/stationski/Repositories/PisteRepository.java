package org.example.stationski.Repositories;

import org.example.stationski.Entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
}
