package org.example.stationski.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;

    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription>Inscriptions;

    @ManyToMany
    private List<Piste>Pistes;
    @OneToOne
    private Abonnement Abonnement;

}
