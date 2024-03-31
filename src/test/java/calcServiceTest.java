import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.services.calcService;

public class calcServiceTest {

    @Test
    void shouldCalculateSchedule() {
        calcService service = new calcService();

        //подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        //вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        //проводим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateScheduleSecond() {
        calcService service = new calcService();

        //подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        //вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        //проводим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}