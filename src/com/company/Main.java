package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);
        int z = calc.divide1.apply(a,b);


        calc.println.accept(c);
        calc.println.accept(z);


        //Причина онибки это ArithmeticException: / деление на ноль запрещено!
        // Сделал два метода для решения вышеуказанной проблемы, методы divide() и divide1().
        //Создал также метод divide2, как вариант решения...
    }
}
