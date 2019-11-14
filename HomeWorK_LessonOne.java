package alexey.javaone.lesson_one.homework;



public class HomeWorK_LessonOne {


/*
* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с
* плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
*/
    private static float add(int a, int b, int c, int d) {
        return (float)(a * (b + (c / d)));
    }
/*
* Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит
* в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
*/
    private static boolean comparsions(int a, int b){
        int s = a + b;
        return (boolean)  (s >= 10 ) && (s <= 20);

}

    /* Написать метод, которому в качестве параметра передается целое число, метод должен
     * проверить положительное ли число передали, или отрицательное.
     * Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
     */
    private static void checkPositiveOrNegative (int x) {

        if (x < 0) {
            System.out.println("x is negative");
        } else  {
            System.out.println("x is positive");
        }
    }


        /* Написать метод, которому в качестве параметра передается строка, обозначающая имя,
            * метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести
            * приветствие в консоль.
        */
     private static String printMyName (String txtMyName){
         return "Привет, " + txtMyName + " !";
     }

     /* Написать метод, который определяет является ли год високосным. Каждый 4-й год
        * является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        * Для проверки работы вывести результаты работы метода в консоль
      */

     private static void leapYear (int a){

         if (a %100==0 && a %400 ==0 )
             System.out.println(a + " высокосный год");

         else if (a % 4 == 0 && a % 100 > 0)
             System.out.println(a + " высокосный год");

         else if (a % 100 == 0)
             System.out.println(a + " не высокосный год");

         else
             System.out.println(a + " не высокосный год");
     }



    public static void main (String [] args){
        int a = 5;
        int b = 10;
        int c = 7;
        int d = 2;
        float i = add(a, b,  c,  d);
        System.out.println(i);

        a = 3;
        b = 15;

        boolean z = comparsions(  a, b  );
        System.out.println(z);

        checkPositiveOrNegative(5);

        String txtMyName = "Алексей";
        printMyName (txtMyName);
        System.out.println("Привет, " + txtMyName + " !");

        a = 2000;
        leapYear(a);

    }
}





