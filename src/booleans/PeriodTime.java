package booleans;

import java.time.LocalDate;

/*В этом ката мы создадим функцию для проверки задержки периода.
        Наша функция будет принимать три параметра:
        last - Объект Date с датой последнего периода
        сегодня - Объект Date с датой проверки
        CycleLength — целое число, представляющее продолжительность цикла в днях.
        Возвращает true, если количество дней, прошедших от последнего до сегодняшнего дня, больше, чем cycleLength. В противном случае вернуть ложь.*/
public class PeriodTime {
    public static void main(String[] args) {

    }
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return today.toEpochDay() - last.toEpochDay() > cycleLength;
    }
}
