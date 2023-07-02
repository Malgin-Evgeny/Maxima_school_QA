package calculatorTests.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class RestCalculatorServiceImpl implements RestCalculatorService{

    @Override
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    @Override
    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    @Override
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    @Override
    public BigDecimal division(BigDecimal a, BigDecimal b) {
        return a.divide(b, 5, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal pow(BigDecimal a, int pow) {
        return a.pow( pow);
    }
}