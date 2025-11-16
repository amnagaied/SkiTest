package org.example.stationski.Services.Interfaces;

import org.example.stationski.Entities.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IServiceAvance {
    Inscription addRegistrationAndAssignToSkier(Inscription registration, Long numSkier);
    Inscription assignRegistrationToCourse(Long numRegistration, Long numCourse);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
    Skieur addSkierAndAssignToCourse(Skieur skier, Long numCourse);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);
    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);



}
