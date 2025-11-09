package org.example.stationski.Repositories;

import org.example.stationski.Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {


    }

