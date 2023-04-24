package collections.list;

import java.util.ArrayList;
import java.util.Random;

/*Задана натуральная степень k. Сформировать случайным
        образом список коэффициентов (значения от 0 до 100)
        многочлена многочлен степени k.
        *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0*/
public class DegreeRandomNumbers {
    public static void main(String[] args) {
        int k = 2; // заданная степень многочлена
        ArrayList<Integer> coefficients = generateCoefficients(k); // генерируем коэффициенты
        String polynomial = buildPolynomial(coefficients); // строим многочлен из коэффициентов
        System.out.println(polynomial);
    }


     // Генерирует список случайных коэффициентов многочлена заданной степени

    public static ArrayList<Integer> generateCoefficients(int k) {
        ArrayList<Integer> coefficients = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= k; i++) {
            coefficients.add(random.nextInt(101)); // случайное число от 0 до 100
        }
        return coefficients;
    }


      // Строит многочлен из списка коэффициентов

    public static String buildPolynomial(ArrayList<Integer> coefficients) {
        StringBuilder polynomial = new StringBuilder();
        int k = coefficients.size() - 1; // степень многочлена
        for (int i = k; i >= 0; i--) {
            int coefficient = coefficients.get(i);
            if (coefficient == 0) continue; // не выводим нулевые коэффициенты
            if (i != k) {
                polynomial.append(coefficient > 0 ? " + " : " - "); // знак перед коэффициентом
                coefficient = Math.abs(coefficient); // модуль коэффициента
            }
            if (i == 0) {
                polynomial.append(coefficient); // свободный член
            } else {
                polynomial.append(coefficient).append("x");
                if (i > 1) polynomial.append("^").append(i); // степень x
            }
        }
        return polynomial.toString();
    }
}
