package sda_scheduler.trainers;

import sda_scheduler.dategenerator.DateGenerator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trainers {
    private DateGenerator dateOfBirth = new DateGenerator();

    private Trainer trainer1 = new Trainer("Edvinas","Prokofijovas", LocalDate.parse("1991-06-15"),
                                           true);

    private Trainer trainer2 = new Trainer("Ignas","Ignovič",dateOfBirth.randomDateGenerator(),
                                           false);

    private Trainer trainer3 = new Trainer("Tadas","Tadulinis",dateOfBirth.randomDateGenerator(),
                                           true);


    public List<Trainer> createTrainersList() {

        List<Trainer> trainerList = new ArrayList<>();
        trainerList.add(trainer1);
        trainerList.add(trainer2);
        trainerList.add(trainer3);

        return trainerList;
    }

    public Trainer getRandomTrainer() {
        Random random = new Random();
        return createTrainersList().get(random.nextInt(3));
    }

    public Trainer getTrainer1() {
        return trainer1;
    }

    public Trainer getTrainer2() {
        return trainer2;
    }

    public Trainer getTrainer3() {
        return trainer3;
    }
}
