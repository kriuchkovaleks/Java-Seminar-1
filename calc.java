/*
Написать консольный калькулятор принимающий два числа и операто(умножение, деление, сложение, вычитание) и завершающий процесс по решению пользователя. 
Завершающее слово должно быть не регистрочувствительным
ч(Пример: поданные слова в разном регистре "Да", "да", "дА", "ДА" - должны быть однозначно трактованны, как "Да").
Введите первое число:
5
Введите второе число:
10
Введите желаемую операцию
*
Результат: 50
Хотите продолжить?
Нет
*/

import java.util.Scanner;

public class calc {
    
    public static int get_calc(int num1, int num2, String oper) {
        String sum_oper = "+";
        String sub_oper = "-";
        String mul_oper = "*";
        String dev_oper = "/";
        if (oper.equals(sum_oper)) {
            return num1 + num2;
        }
        if (oper.equals(sub_oper)) {
            return num1 - num2;
        }
        if (oper.equals(mul_oper)) {
            return num1 * num2;
        }
        if (oper.equals(dev_oper)) {
            return num1 / num2;
        }
        else {
            return 111;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        String decision_to_compare = "да";
        String decision = "да";
        while (decision_to_compare.equals(decision)){
            System.out.println("Введите первое число:");
            int number_1 = in.nextInt();
            System.out.println("Введите второе число:");
            int number_2 = in.nextInt();
            System.out.println("Введите желаемую операцию");
            String operation = in.next();
            System.out.println(get_calc(number_1, number_2, operation));
            System.out.println("Хотите продолжить?");
            decision = in.next();
            decision = decision.toLowerCase();
        }
           
    }
}
