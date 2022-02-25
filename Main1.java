package JavaCore;

public class Main1 extends Calculator  {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);//деление на ноль.
        //Можно исправить devide в Calculator
        calc.println.accept(c);
    }

}
//https://github.com/Alena-Naumova/HomeWork_Lymbda-1_Culculator.git
