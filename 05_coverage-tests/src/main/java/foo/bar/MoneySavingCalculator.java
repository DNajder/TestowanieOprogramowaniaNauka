package foo.bar;

import java.math.BigDecimal;
import java.time.Period;

import static foo.bar.SavingFrequency.EACH_DAY;

public class MoneySavingCalculator {
    public static void main(String[] args) {
        MoneySavingCalculator m = new MoneySavingCalculator();
        System.out.println(m.calculateSavings(EACH_DAY, new BigDecimal(1),Period.of(0,2,24)));
    }

    public BigDecimal sum;

    public BigDecimal calculateSavings(
            SavingFrequency frequency,
            BigDecimal singleAmmount,
            Period duration
    ) {switch (frequency){
        case EACH_DAY:
            sum = singleAmmount.multiply(BigDecimal.valueOf(duration.getDays()));
            break;
        case EACH_WEEK:
            sum = singleAmmount.multiply(BigDecimal.valueOf(duration.getDays()/7));
            break;
        case EACH_MONTH:
            sum = singleAmmount.multiply(BigDecimal.valueOf(duration.getMonths()));
            break;
        case ONCE_A_YEAR:
            break;
        case EACH_SECOND_DAY:
            break;
        case TWICE_A_WEEK:
            break;
    }




        return sum;
    }
}
