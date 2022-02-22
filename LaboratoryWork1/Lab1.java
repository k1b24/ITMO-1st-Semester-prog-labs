/*
    *Лабораторная работа № 1 по предмету "Программирование"
    *Выполнил Лазеев Сергей, группа P3115 
    *Вариант - 21512
*/

import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;

public class Lab1 {


    /**
     * 
     * @param min Минимальное число диапазона типа short
     * @param max Максимальное число диапазона типа short
     * @return Возвращает массив чисел типа short заполненных четными числами от max до min
     */
    public static short[] fillArrayWithEvenNumbersFromMaxToMin(short min, short max){
        short[] arrayOfEvenNums = new short[0];
        for (int i = max % 2 == 0 ? max : max-1 ; i >= min; i -= 2){
            arrayOfEvenNums = Arrays.copyOf(arrayOfEvenNums, arrayOfEvenNums.length+1);
            arrayOfEvenNums[arrayOfEvenNums.length-1] = (short) i;
        } 
        return arrayOfEvenNums;
    }
    

    /**
     * 
     * @param min (ОТ) Нижний порог диапазона значений
     * @param max (ДО) Верхний порог диапазона значений
     * @return Случайное число типа float в диапозоне от min до max 
     */
    public static float getRandomNumber(int min, int max){
        int diff = max - min;
        Random random = new Random();
        return random.nextInt(diff) + random.nextFloat() + min;
        // max = 5 min = 1 diff = 4 nextInt = 0, 1, 2, 3; nextInt + min = 1 2 3 4  
        //nextInt + min + nextFloat = (1 2 3 4) + (0..1) --> значение < 5, выхода за границы диапазона нет
    }


    /**
     * Метод, выводящий на экран двумерный массив типа double произвольного размера c точностью до n знаков после запятой 
     * @param m Двумерный массив типа double, который будет выведен на экран
     * @param n количество символов после запятой, которое будет выведено на экран
     */
    public static void printAnswer(double[][] m, int n){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.printf("% 6." + Integer.toString(n) + "f", m[i][j]);
            }
            System.out.println();
        }
    }   



    public static void main(String[] args){
        //Код, выполняющий условия первого задания
        final short MIN_FIRST_TASK = 6;  // минимальное число по условию задачи
        final short MAX_FIRST_TASK = 18; // максимальное число по условию задачи
        short[] a = fillArrayWithEvenNumbersFromMaxToMin(MIN_FIRST_TASK, MAX_FIRST_TASK);
        

        //Код, выполняющий условия второго задания
        final int LENGTH_SECOND_TASK = 12; // Длина массива x по условию
        final int MIN_RANDOM = -9, MAX_RANDOM = 8; // Диапазон для генератора случайных чисел по условию
        float[] x = new float[LENGTH_SECOND_TASK];
        for (int i = 0; i < x.length; i++){
            x[i] = getRandomNumber(MIN_RANDOM, MAX_RANDOM);
        }   

        //Код, выполняющий условия третьего задания
        final int HEIGHT_THIRD_TASK = 7; //Количество строк в двумерном массиве c по условию
        final int WIDTH_THIRD_TASK = 12; //Количество столбцов в двумерном массиве c по условию
        double[][] c = new double[HEIGHT_THIRD_TASK][WIDTH_THIRD_TASK];
        for (int i = 0; i < c.length; i ++) {
            for (int j = 0; j < c[i].length; j ++) {
                if (a[i] == 16){
                    c[i][j] = atan(sin(atan(cos(x[j]))));
                }
                else if (a[i] == 6 || a[i] == 8 || a[i] == 10){
                    c[i][j] = (2 / 3d) * asin(1 / (pow(E, abs(x[j]))));
                }   
                else {
                    c[i][j] = atan(sin(log(acos((x[j] - 0.5d) / 17))));
                }
            }
        }

        //Код, выполняющий условия четвертого задания
        printAnswer(c, 2);
    }
}
