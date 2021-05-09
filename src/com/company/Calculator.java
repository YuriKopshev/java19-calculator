package com.company;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> y == 0 ? printArithmeticException(y) : x / y;
    BinaryOperator<Integer> divide1 = (x, y) -> {
        if (y==0){
            return -1;
        }
        return x/y;
    };

    BinaryOperator<Integer> divide2 = (x, y) -> {
        if (y==0){
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        return x/y;
    };



    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

    public Integer printArithmeticException(Integer integer){
        System.out.print("На ноль делить нельзя! " + "Делитель равен: ");
        return integer;
    }


}
