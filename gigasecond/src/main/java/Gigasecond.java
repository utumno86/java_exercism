import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private long GIGASECOND = (long)(Math.pow(10, 9));

    private LocalDateTime moment;

    Gigasecond(LocalDate moment) {
        this.moment = moment.atTime(0, 0);
    }

    Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    LocalDateTime getDateTime() {
        return moment.plusSeconds(GIGASECOND);
    }

}
