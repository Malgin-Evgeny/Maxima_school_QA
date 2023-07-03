package calculator.controller;

import calculator.service.RestCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("calculator/v1")
public class RestCalculatorControllerImpl implements RestCalculatorController {
    private final RestCalculatorService calculatorService;

    @Override
    public ResponseEntity<BigDecimal> add(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return ResponseEntity.ok(calculatorService.add(a, b));
    }

    @Override
    public ResponseEntity<BigDecimal> subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return ResponseEntity.ok(calculatorService.subtract(a, b));
    }

    @Override
    public ResponseEntity<BigDecimal> multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return ResponseEntity.ok(calculatorService.multiply(a, b));
    }

    @Override
    public ResponseEntity<BigDecimal> division(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        return ResponseEntity.ok(calculatorService.division(a, b));
    }

    @Override
    public ResponseEntity<BigDecimal> pow(@RequestParam BigDecimal a, @RequestParam int pow) {
        return ResponseEntity.ok(calculatorService.pow(a, pow));
    }

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<String> handleArithmeticException(ArithmeticException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Division by zero.");
    }

    @ExceptionHandler({NumberFormatException.class})
    public ResponseEntity<String> handleNumberFormatException(NumberFormatException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Incorrect input. Please enter the correct numbers.");
    }
}