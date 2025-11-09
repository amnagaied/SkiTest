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

public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;

    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    private int longueur;
    private int pente;
    private Couleur couleurs;
    @ManyToMany(mappedBy = "Pistes")
    private List<Skieur>Skieurs;

}
