package javaone.lesson_four;

public class Wokers {
    public String FIO;
    public String position;
    public String phone;
    public String salary;
    public String age;

    // конструктор класса
    public Wokers(String FIO, String position, String phone, String salary, String age) {
        this.FIO = FIO;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }



    //методы возвращающие  значение каждого поля
    void nameWoker(){System.out.println( "Фамилия Имя Отчество:  " + FIO); }
    void namePosition(){System.out.println( "Должность:  " + position); }
    void numberPhone(){System.out.println( "Номер тедлефона:  " + phone); }
    void volSalary(){System.out.println( "Оклад:  " + salary); }
    void whatAge(){System.out.println( "Возраст:  " + age); }


    // вывести информацию только о сотрудниках старше 40 лет;
    static void findAge(String[][] arr) {
        for (int i =0 ; i< arr.length; i++){
            if (Integer.parseInt(arr[i][4]) > 40)
                System.out.println("Сотрудник: " + arr[i][0] + " - " + Integer.parseInt(arr[i][4]) + " лет");
            }
    }

    public static void growthSalary(String[][] arr) {
        for (int i =0 ; i< arr.length; i++){
            if (Integer.parseInt(arr[i][4]) > 40)
                System.out.println("Сотрудник: " + arr[i][0] + " - " + "Зарплата увеличина до: " + (Integer.parseInt(arr[i][3]) + 5000) + " руб");
        }
    }

}
