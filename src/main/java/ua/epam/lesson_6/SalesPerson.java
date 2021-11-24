package ua.epam.lesson_6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private int percent;

    protected SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (percent > 100) {
            if (percent > 200) {
                this.bonus = bonus.multiply(new BigDecimal(3));
            } else {
                this.bonus = bonus.multiply(new BigDecimal(2));
            }
        } else {
            this.bonus = bonus;
        }
    }
}