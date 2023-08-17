package br.com.profissaodev;

import br.com.profissaodev.converters.NumberConverter;
import br.com.profissaodev.exceptions.UnsupportedMathOperationException;
import br.com.profissaodev.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    private SimpleMath math = new SimpleMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value= "numberOne") String numberOne,
                      @PathVariable(value= "numberTwo") String numberTwo) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.sum(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(@PathVariable(value= "numberOne") String numberOne,
                      @PathVariable(value= "numberTwo") String numberTwo) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.sub(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/plus/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double plus(@PathVariable(value= "numberOne") String numberOne,
                      @PathVariable(value= "numberTwo") String numberTwo) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.plus(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(@PathVariable(value= "numberOne") String numberOne,
                      @PathVariable(value= "numberTwo") String numberTwo) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        if(numberTwo.equals("0")) {
            throw new UnsupportedMathOperationException("Second number cannot be Zero");
        }

        return math.div(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable(value= "numberOne") String numberOne,
                      @PathVariable(value= "numberTwo") String numberTwo) throws Exception{

        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return math.mean(NumberConverter.convertToDouble(numberOne),
                NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value="/sqrt/{numberOne}", method = RequestMethod.GET)
    public String sum(@PathVariable(value= "numberOne") String numberOne) throws Exception{

        if(!NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        if(Double.parseDouble(numberOne) < 0) {
            double number = Math.abs(NumberConverter.convertToDouble(numberOne));
            return math.sqrt(number) + " i";
        }

        return math.sqrt(NumberConverter.convertToDouble(numberOne));
    }


}
