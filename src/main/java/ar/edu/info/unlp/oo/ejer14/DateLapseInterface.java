package ar.edu.info.unlp.oo.ejer14;

import java.time.LocalDate;

public interface DateLapseInterface {
    LocalDate getFrom();

    int sizeInDays();

    LocalDate getTo();

    boolean includesDate(LocalDate other);

}
