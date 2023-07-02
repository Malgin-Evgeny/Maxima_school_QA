package calculatorTests.service;

import java.math.BigDecimal;

public interface RestCalculatorService {

    BigDecimal add(BigDecimal a, BigDecimal b);

    BigDecimal subtract(BigDecimal a, BigDecimal b);

    BigDecimal multiply(BigDecimal a, BigDecimal b);

    BigDecimal division(BigDecimal a, BigDecimal b);

    BigDecimal pow(BigDecimal a, int pow);
}
