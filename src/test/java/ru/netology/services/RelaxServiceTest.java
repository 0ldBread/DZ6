package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RelaxService;

public class RelaxServiceTest {

    @Test

    public void restDaysСalculationFirstOption() {
        RelaxService service = new RelaxService ();

        int expected = 3;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void restDaysСalculationSecondOption() {
        RelaxService service = new RelaxService ();

        int expected = 2;
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
