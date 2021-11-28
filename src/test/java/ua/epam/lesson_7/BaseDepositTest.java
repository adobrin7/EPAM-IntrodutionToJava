package ua.epam.lesson_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BaseDepositTest {

    @Test
    void income() {
        BaseDeposit deposit = new BaseDeposit(1000.0, 8);
        double income = deposit.income();
        assertEquals(477.46, income, 0.01);
    }
}