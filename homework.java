package javaone.lesson_six.online.homework;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework {

//Задание 3
    private static void checkPhraseInFile(File pathFile, File file) {
        //ВВод  слова (или словосочетания, или предложения)
        Scanner inLine = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String inPhrase = inLine.nextLine();

        //Чтение файла и преобразование его в строку
        try(FileInputStream fileThreeOut=new FileInputStream(pathFile+"//"+file)) {
            byte[] history = new byte[fileThreeOut.available()];
            fileThreeOut.read(history, 0, history.length);
            String strHistory = new String(history);
            //Сравнение
            Pattern pattern = Pattern.compile(inPhrase);
            Matcher matcher = pattern.matcher(strHistory);
            boolean result = matcher.find();
            System.out.println(result);
        }
        catch (IOException e) {
            e.getMessage();
        }
    }
// Задание 4
        private static void checksfiles() {

            String pathFile = "C://text";

           //int countFiles = new File(pathFile).list().length;
            File dir = new File(pathFile);
            File[] nameFile = new File(pathFile).listFiles();

            for (int i = 0; i < nameFile.length; i++) {
                //к заданию 3
                checkPhraseInFile(dir, nameFile[i]);
            }
        }



    public static <e> void main(String[] args) throws IOException {

       /* 1.	Создать 2 текстовых файла, примерно по 50-100
        символов в каждом(особого значения не имеет);
        2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст
        из первого файла, потом текст из второго.*/

       /* Извините , это не совсем по материалам урока, но другой алгоритм что то придумать не смог*/

        // Создание из файлов двух массивов , их объединение и запись в третий файл
        try (FileInputStream fileOnein = new FileInputStream("C://text//text1.txt");
             FileInputStream fileTwoin = new FileInputStream("C://text//text2.txt");
             FileOutputStream fileThreeOut=new FileOutputStream("C://text//text3.txt")) {

            byte[] arrFileOne = new byte[fileOnein.available()];
            byte[] arrFileTwo = new byte[fileTwoin.available()];


            fileOnein.read(arrFileOne,0,arrFileOne.length);
            fileTwoin.read(arrFileTwo,0,arrFileTwo.length);

            byte[] arrThree = new byte[arrFileOne.length + arrFileTwo.length];
            System.arraycopy(arrFileOne, 0, arrThree, 0, arrFileOne.length);
            System.arraycopy(arrFileTwo, 0, arrThree, arrFileOne.length, arrFileTwo.length);

            fileThreeOut.write(arrThree,0,arrThree.length);

        } catch (IOException e) {
            e.getMessage();
        }


        //////////////////////// ЗАДАНИЕ 3 и 4 объденены
        //////////////////////// из задания 4 вызываеться метод  checkPhraseInFile(File file); который являеться заланием 3
  /*
            3.	* Написать программу, которая проверяет присутствует ли указанное
            пользователем слово (или словосочетание, или предложение) в файле.
            (Работаем только с латиницей)
        */
  /*
               /*4.  ** Написать метод, проверяющий, есть ли указанное слово в файлах папки
                * */
        checksfiles();
    }




}

