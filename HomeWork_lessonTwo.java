package javaone.lesson_two.homework;


import java.util.Arrays;

public class HomeWork_lessonTwo {

    /*1
     *Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    private static void ChengeNumArr(int[] myArray){
        for ( int i = 0; i < myArray.length; i++ ){
           int NumInArr = myArray[i];
            if (NumInArr == 0)
                myArray[i] = 1;
            else
                myArray[i] = 0;
        }
        System.out.println(Arrays.toString(myArray));
    }

    /*2
    Задать пустой целочисленный массив размером 8. Написать метод,
    который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    */
    private static void FillArrValues( int[] arr){
        for ( int i = 0; i < arr.length; i++){
            if ( i!= 0)
                arr[i] = arr[i-1] +3;
            else
                arr[i]  = 1;
        }
        System.out.println(Arrays.toString(arr));
    }


    /*3
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
    принимающий на вход массив и умножающий числа меньше 6 на 2;
     */
    private static void SmallMultiply(int[] arr1) {
        for ( int i = 0; i < arr1.length; i++){
            if ( arr1[i] < 6)
                arr1[i] = arr1[i] *2;
        }
        System.out.println(Arrays.toString(arr1));
    }
    /*4
    Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
     */
    private static void SearchMaximum(int[] arr2){
        int max = 0;
        for ( int i = 0; i < arr2.length; i++){
            if ( i == 0)
                max = arr2[i] ; // присваиваем max первое число в массиве
            else
                if (arr2[i] > max )
                    max = arr2[i];

        }
        System.out.println("Максимальное число: " + max );
    }
    private static void SearchMinimun(int[] arr2){
        int min = 0;
        for ( int i = 0; i < arr2.length; i++){
            if ( i == 0)
                min = arr2[i] ; // присваиваем max первое число в массиве
            else
            if (arr2[i] < min )
                min = arr2[i];
        }
        System.out.println("Минимальное число: " + min );
    }

    /*5
    Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    заполнить его диагональные элементы единицами, используя цикл(ы);
     */
    private static void FillingDiagonal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ( i == j )
                    System.out.print(1 + "\t");
                else if (j == arr.length -1 - i)
                    System.out.print(1 + "\t");

                else System.out.print(0 + "\t");
            }
            System.out.println();
        }
    }
    /*6
    Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
    checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
     */
    private static void checkBalance(int[] arr){
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        if (sum % 2 == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }

    /*7
    Написать метод, которому на вход подаётся одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен
    циклически сместить все элементы массива на n позиций.
     */
    private static void ShiftArray(int n, int[] arr) {

        if ( n > 0)
            for (int i = 1; i <= n; i++){
                int lastMem = arr[arr.length-1];
                for (int j = arr.length-1; j >= 0; j-- ){
                    if (j == 0)
                        arr[j] = lastMem;
                    else
                        arr[j] =arr[j -1];
                }
            }
        System.out.println(Arrays.toString(arr));
        else if ( n < 0 )   // Не могу понять почему выдает ошибку , что else без if, поэтому вторую часть не могу проверить
            for (int i = 1; i <= Math.abs(n); i++){
                int firstMem = arr[0];
                for (int j = 0; j < arr.length; j++ ) {
                    if (j == arr.length - 1)
                        arr[arr.length - 1] = firstMem;
                    else
                        arr[j - 1] = arr[j];
                }
            }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args){
        // Задача 1
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        ChengeNumArr(myArray);

        // Задача 2
        int[] arr = new int[8];
        FillArrValues(arr);

        // Задача 3
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        SmallMultiply(arr1);

        // Задача 4
        int[] arr2 = {12, 35, 83, 22, 101, -4, 45, 21, 84, 38, 49, -111 };
        SearchMaximum (arr2);
        SearchMinimun (arr2);

        // Задача 5
        int[][] a = new int[10][10];
        FillingDiagonal(a);

        // Задача 6
        //int[] arr3 ={1, 1, 1, 2, 1};
        //int[] arr3 ={2, 1, 1, 2, 1};
        int[] arr3 ={10, 1, 2, 3, 4};
        checkBalance(arr3);

        // Задача 7
        int[] arr4 ={1, 2, 3, 4, 5};
        int n = -2;
        ShiftArray(n, arr4);

    }
}
