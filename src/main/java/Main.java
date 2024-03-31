import ru.netology.javaqa.services.calcService;

public class Main {
    public static void main(String[] args) {


        calcService service = new calcService();

        int expected = 3;
        long actual = service.calculate(10_000, 3_000, 20_000);
        System.out.println(expected + " ===?=== " + actual);

    }
}