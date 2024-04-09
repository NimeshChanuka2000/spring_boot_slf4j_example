package lk.myproject.springbootslf4jexample.controller;

import lk.myproject.springbootslf4jexample.controller.dto.AddNumberReqDTO;
import lk.myproject.springbootslf4jexample.service.CalculatorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @PostMapping("/addition")
    public void add(@RequestBody AddNumberReqDTO addNumberReqDTO){

        log.info("request received add two numbers {}", addNumberReqDTO.toString());
        calculatorService.add(addNumberReqDTO.getNumber1(),addNumberReqDTO.getNumber2());

        String loggerImplementation = log.getClass().getName();
        System.out.println("Logger implementation" + loggerImplementation );
    }

}
