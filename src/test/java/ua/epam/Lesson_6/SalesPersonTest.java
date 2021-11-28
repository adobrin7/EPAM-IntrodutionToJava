package ua.epam.Lesson_6;

import org.junit.jupiter.api.Test;
import ua.epam.lesson_6.SalesPerson;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesPersonTest {

    @Test
    void setBonus() {
    }

    @Test
    void setBonusLess100() {
        SalesPerson person = new SalesPerson("Pohil", new BigDecimal(15000), 60);
        person.setBonus(new BigDecimal(800));
        assertEquals(new BigDecimal(800), person.getBonus());
    }

    @Test
    void setBonusBigger100() {
        SalesPerson person = new SalesPerson("Heilenko", new BigDecimal(16000), 120);
        person.setBonus(new BigDecimal(1600));
        assertEquals(new BigDecimal(3200), person.getBonus());
    }

    @Test
    void setBonusBigger200() {
        SalesPerson person = new SalesPerson("Bespalko", new BigDecimal(17000), 240);
        person.setBonus(new BigDecimal(3200));
        assertEquals(new BigDecimal(9600), person.getBonus());
    }
}