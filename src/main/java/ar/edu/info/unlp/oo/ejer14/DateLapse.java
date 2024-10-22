package ar.edu.info.unlp.oo.ejer14;

import java.time.LocalDate;

public class DateLapse implements DateLapseInterface {
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
    }

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

    public int sizebetweenDates(LocalDate from, LocalDate to, LocalDate from1, LocalDate to1) {
        if (from.isBefore(from1) && to.isAfter(to1)) {
            return from.until(to).getDays();
        }

        return from.until(to).getDays();
    }

}
