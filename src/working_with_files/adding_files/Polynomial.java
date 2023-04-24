package working_with_files.adding_files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*Задача:
        Даны два файла, в каждом из которых находится запись
        многочлена. Сформировать файл содержащий сумму
        многочленов.*/

/*      Для решения этой задачи нужно выполнить следующие шаги:
        1. Создать класс Polynomial, который будет представлять многочлен.
        В этом классе нужно определить методы для чтения и записи многочлена из файла,
        а также метод для сложения двух многочленов.
        Пример реализации класса Polynomial:*/
public class Polynomial {
    public static void main(String[] args) throws IOException {
        Polynomial polynomial1 = Polynomial.readFromFile("polynomial1.txt");
        Polynomial polynomial2 = Polynomial.readFromFile("polynomial2.txt");
        Polynomial sum = polynomial1.add(polynomial2);
        sum.writeToFile("sum.txt");
    }
    private int[] coefficients;
    public Polynomial(int degree) {
        this.coefficients = new int[degree + 1];
    }
    public int getDegree() {
        return coefficients.length - 1;
    }
    public int getCoefficient(int degree) {
        return coefficients[degree];
    }
    public void setCoefficient(int degree, int coefficient) {
        coefficients[degree] = coefficient;
    }
    public static Polynomial readFromFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        int degree = scanner.nextInt();
        Polynomial polynomial = new Polynomial(degree);
        for (int i = 0; i <= degree; i++) {
            polynomial.setCoefficient(i, scanner.nextInt());
        }
        scanner.close();
        return polynomial;
    }
    public void writeToFile(String fileName) throws IOException {
        java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.File(fileName));
        writer.println(getDegree());
        for (int i = 0; i <= getDegree(); i++) {
            writer.println(getCoefficient(i));
        }
        writer.close();
    }
    public Polynomial add(Polynomial other) {
        int degree = Math.max(getDegree(), other.getDegree());
        Polynomial result = new Polynomial(degree);
        for (int i = 0; i <= degree; i++) {
            result.setCoefficient(i, getCoefficient(i) + other.getCoefficient(i));
        }
        return result;
    }

}
