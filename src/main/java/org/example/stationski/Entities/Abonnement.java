package org.example.stationski.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float prixAbon;
    private TypeAbonnement typeAbonnement;

    @OneToOne
    private Skieur skieur;

}
