package calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public interface RestCalculatorController {
    @GetMapping(value = "/add")
    ResponseEntity<BigDecimal> add(@RequestParam BigDecimal a, @RequestParam BigDecimal b) throws EmptyStringException;

    @GetMapping("/subtract")
    ResponseEntity<BigDecimal> subtract(@RequestParam BigDecimal a, @RequestParam BigDecimal b);

    @GetMapping("/multiply")
    ResponseEntity<BigDecimal> multiply(@RequestParam BigDecimal a, @RequestParam BigDecimal b);

    @GetMapping("/division")
    ResponseEntity<BigDecimal> division(@RequestParam BigDecimal a, @RequestParam BigDecimal b);

    @GetMapping("/pow")
    ResponseEntity<BigDecimal> pow(@RequestParam BigDecimal a, @RequestParam int pow);
}
