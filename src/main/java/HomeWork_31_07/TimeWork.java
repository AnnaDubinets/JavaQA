package HomeWork_31_07;

import java.time.Duration;
import java.time.LocalTime;

public class TimeWork {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime workStartTime = LocalTime.of(9, 0);

        if (currentTime.isBefore(workStartTime)) {
            Duration timeLeft = Duration.between(currentTime, workStartTime);
            System.out.println("Время до начала работы: " + timeLeft.toHours() + " часов и " + timeLeft.toMinutesPart() + " минут.");
        } else {
            Duration timeLate = Duration.between(workStartTime, currentTime);
            System.out.println("Вы проспали на: " + timeLate.toHours() + " часов и " + timeLate.toMinutesPart() + " минут.");
        }
    }
}
