package com.mycompany.app;
import java.util.function.BiFunction;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class Bifunction {

/*  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    String result = calculator.calc((a, b) -> ": " + (a * b),3,  5);
       String result = calculator.calc((c, d) -> ": " + (c * d),4,  5);
    System.out.println(result);

  }
}

class Calculator {
  public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
      return bi.apply(i1, i2);
  }
  Public String calc1(BiFunction)*/

  
 


  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Function<Integer, Integer> lambda = value -> value * 2;
    List<Integer> doubled = numbers.stream()
            .map(lambda)
           .collect(java.util.stream.Collectors.toList());
    
    System.out.println(doubled);
  }
}


