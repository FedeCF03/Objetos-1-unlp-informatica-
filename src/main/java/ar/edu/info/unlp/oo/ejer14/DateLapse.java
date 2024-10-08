package ar.edu.info.unlp.oo.ejer14;

import java.time.LocalDate;

public class DateLapse implements DateLapseInterface {
    private LocalDate from;
    private LocalDate to;

    @Override
    public LocalDate getFrom() {
        return from;
    }

    @Override
    public LocalDate getTo() {
        return to;
    }

    @Override
    public int sizeInDays() {
        return from.until(to).getDays();
    }

    @Override
    public boolean includesDate(LocalDate other) {
        return from.isBefore(other) && to.isAfter(other);
    }

}
