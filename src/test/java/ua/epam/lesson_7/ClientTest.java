package ua.epam.lesson_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    void addDeposit() {
        Client client = new Client();
        assertTrue(client.addDeposit(new BaseDeposit(3000, 24)));
        for (int i = 0; i < 9; i++) {
            client.addDeposit(new LongDeposit(5000.0, 10));
        }

        assertFalse(client.addDeposit(new BaseDeposit(10000, 18)));
    }

    @Test
    void totalIncome() {
        Client client = new Client();
        client.addDeposit(new BaseDeposit(1000, 6));
        client.addDeposit(new SpecialDeposit(1000, 6));
        client.addDeposit(new LongDeposit(1000, 8));
        double total = client.totalIncome();

        assertEquals(890.86, total, 0.01);
    }

    @Test
    void maxIncome() {
        Client client = new Client();
        client.addDeposit(new BaseDeposit(1000, 6));
        client.addDeposit(new SpecialDeposit(1000, 10));
        client.addDeposit(new LongDeposit(1000, 8));
        double max = client.maxIncome();

        assertEquals(701.83, max, 0.01);
    }

    @Test
    void getIncomeByNumber() {
        Client client = new Client();
        client.addDeposit(new BaseDeposit(1000, 16));
        client.addDeposit(new SpecialDeposit(1000, 8));
        client.addDeposit(new LongDeposit(1000, 8));

        assertEquals(0, client.getIncomeByNumber(0));
        assertEquals(419.37, client.getIncomeByNumber(2), 0.01);
        assertEquals(0, client.getIncomeByNumber(8));
    }
}
