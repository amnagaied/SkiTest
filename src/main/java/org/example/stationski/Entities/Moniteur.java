package org.example.stationski.Entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;

    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
    @OneToMany(mappedBy = "moniteur")
    private List<Cours>cours;

}
