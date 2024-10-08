package ar.edu.info.unlp.oo.ejer14;

import java.time.LocalDate;

public class DateLapseSize implements DateLapseInterface {
    private LocalDate from;
    private int size; // can be final???

    public DateLapseSize(LocalDate from, int size) {
        this.from = from;
        this.size = size;

    }

    @Override
    public LocalDate getFrom() {
        return from;
    }

    @Override
    public LocalDate getTo() {
        return this.from.plusDays(this.size);

    }

    @Override
    public int sizeInDays() {
        return size;
    }

    @Override
    public boolean includesDate(LocalDate other) {

        return getFrom().isAfter(other) && getTo().isBefore(other);
    }
}
