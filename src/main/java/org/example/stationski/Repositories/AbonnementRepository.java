package org.example.stationski.Repositories;

import org.example.stationski.Entities.Abonnement;
import org.example.stationski.Entities.Skieur;
import org.example.stationski.Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    List<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);
    List<Abonnement> findByTypeAbonOrderByDateDebutAsc(TypeAbonnement type );

}
