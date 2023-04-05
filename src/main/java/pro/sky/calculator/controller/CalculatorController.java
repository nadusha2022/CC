package pro.sky.calculator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;}
    @GetMapping(path="calculator", produces = MediaType. TEXT_HTML_VALUE)
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("plus")
    public String plus (@RequestParam(value = "num1", required = false) Integer n,
                      @RequestParam(value = "num2", required = false) Integer g) {
        if (n == null || g == null) {
            return "Не передан один из параметров";
        }
        return n + "+" + g + "=" + calculatorService.plus(n,g);
    }
    @GetMapping("minus")
    public String minus (@RequestParam(value = "num1", required = false) Integer n,
                      @RequestParam(value = "num2", required = false) Integer g) {
        if (n == null || g == null) {
            return "Не передан один из параметров";
        }
        return n + "-" + g + "=" + calculatorService.minus(n, g);
    }
    @GetMapping("multiply")
    public String multiply (@RequestParam(value = "num1", required = false) Integer n,
                      @RequestParam(value = "num2", required = false) Integer g) {
        if (n == null || g == null) {
            return "Не передан один из параметров";
        }
        return n + "*" + g + "=" + calculatorService.multiply(n, g);
    }
    @GetMapping("divide")
    public String divide (@RequestParam(value = "num1", required = false) Integer n,
                      @RequestParam(value = "num2", required = false) Integer g) {
        if (n == null || g == null) {
            return "Не передан один из параметров";
        }
        if (g==0){
            return "На 0 делить нельзя";
        }
        return n + "/" + g + "=" + calculatorService.devide(n, g);
    }
}

