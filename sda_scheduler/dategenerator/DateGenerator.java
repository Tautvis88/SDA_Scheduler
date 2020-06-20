package sda_scheduler.dategenerator;

import java.time.LocalDate;
import java.util.Random;

public class DateGenerator {

    public LocalDate randomDateGenerator() {

        Random random = new Random();
        int minDay = (int) LocalDate.of(1970,1,1).toEpochDay();
        int maxDay = (int) LocalDate.of(2000,1,1).toEpochDay();

        int randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

        return randomDate;

    }
}
