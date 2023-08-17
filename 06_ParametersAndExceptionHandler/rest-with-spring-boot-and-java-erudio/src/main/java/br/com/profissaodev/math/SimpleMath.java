package br.com.profissaodev.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double plus(Double numberOne,Double numberTwo){
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne,Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double mean(Double numberOne,Double numberTwo) {
        return (numberOne + numberTwo) / 2.0;
    }
    
    public String sqrt(Double numberOne) {
        return String.valueOf(Math.sqrt(numberOne));
    }

}
