package ua.epam.Lesson_6;

import org.junit.jupiter.api.Test;
import ua.epam.lesson_6.Company;
import ua.epam.lesson_6.Employee;
import ua.epam.lesson_6.Manager;
import ua.epam.lesson_6.SalesPerson;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {

    @Test
    void giveEverybodyBonus() {
        SalesPerson person1 = new SalesPerson("Pohil", new BigDecimal(15000), 100);
        SalesPerson person2 = new SalesPerson("Voloshyn", new BigDecimal(17000), 100);
        Manager person3 = new Manager("Sydorova", new BigDecimal(25000), 100);
        Manager person4 = new Manager("Konoval", new BigDecimal(24000), 100);

        Company company = new Company(
                person1,
                person2,
                person3,
                person4
        );

        company.giveEverybodyBonus(new BigDecimal(3000));
        assertEquals(new BigDecimal(3000), person1.getBonus());
        assertEquals(new BigDecimal(3000), person2.getBonus());
        assertEquals(new BigDecimal(3000), person3.getBonus());
        assertEquals(new BigDecimal(3000), person4.getBonus());
    }

    @Test
    void totalToPay() {
        SalesPerson person1 = new SalesPerson("Pohil", new BigDecimal(15000), 220);
        SalesPerson person2 = new SalesPerson("Voloshyn", new BigDecimal(17000), 180);
        Manager person3 = new Manager("Sydorova", new BigDecimal(25000), 130);
        Manager person4 = new Manager("Konoval", new BigDecimal(24000), 160);

        Company company = new Company(
                person1,
                person2,
                person3,
                person4
        );

        assertEquals(person1.toPay().add(person2.toPay()).add(person3.toPay()).add(person4.toPay()),
                company.totalToPay());

        company.giveEverybodyBonus(new BigDecimal(5000));

        assertEquals(person1.toPay().add(person2.toPay()).add(person3.toPay()).add(person4.toPay()),
                company.totalToPay());
    }

    @Test
    void nameMaxSalary() {
        SalesPerson person1 = new SalesPerson("Pohil", new BigDecimal(15000), 220);
        SalesPerson person2 = new SalesPerson("Voloshyn", new BigDecimal(17000), 180);
        Manager person3 = new Manager("Sydorova", new BigDecimal(25000), 130);
        Manager person4 = new Manager("Konoval", new BigDecimal(24000), 160);

        Company company = new Company(
                person1,
                person2,
                person3,
                person4
        );

        assertEquals(person3.getName(), company.nameMaxSalary());
    }
}