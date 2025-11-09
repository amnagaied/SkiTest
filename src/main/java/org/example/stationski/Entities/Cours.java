package org.example.stationski.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;

    private int niveau;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    private Support support;

    private Float prix;
    private int creneau;
    private TypeCours typec;
    private Support suport;
    @OneToMany(mappedBy = "cours")
    private List<Inscription>Inscriptions;
    @ManyToOne
    private Moniteur moniteur;
}
