package lk.myproject.springbootslf4jexample.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class CalculatorService {

    public Integer add(int number1,int number2){
        int result = number1+number2;
        log.debug("add operation {} + {} = {}" ,number1,number2,result);
        return result;
    }
}
