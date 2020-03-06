package src.main.java.Lebedenko.Lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    private String firstText;
    private String secondText;
    private Scanner in = new Scanner (System.in);
    boolean notExit = true;

    void isFirstOrSecondText () {
        if ((this.getFirstText()=="") || (this.getSecondText()=="") || (this.getFirstText() == null) || (this.getSecondText() == null)){
//            String str1 = in.nextLine ();
//            this.setFirstText (str1);
//            String str2 = in.nextLine ();
//            this.setSecondText (str2);
            isFirstText();
            isSecondText ();

        }
    }

    void isFirstText () {
        if ((this.getFirstText () == "") || (this.getFirstText () == null)){
            System.out.println ("Текст должен содержать что-нибудь. Введите:");
            String str1 = in.nextLine();
            System.out.println (str1);
            this.setFirstText (str1);
        }
    }

    void isSecondText () {
        if ((this.getSecondText () == "") || (this.getSecondText () == null)){
            System.out.println ("Второй фрагмент текста тоже должен содержать что-нибудь. Введите:");
            String str2 = in.nextLine();
            System.out.println (str2);
            this.setSecondText(str2);
        }
    }

    void setFirstText(String text) {
        this.firstText = text;
    }

    void setSecondText(String text) {
        this.secondText = text;
    }

    String getFirstText() {
        return this.firstText;
    }

    String getSecondText() {
        return this.secondText;
    }

    void printMenu() {
        System.out.println ("---------------------------");
        System.out.println ("1. Ввести первую строку");
        System.out.println ("2. Ввести вторую строку");
        System.out.println ("3. Просмотреть строки");
        System.out.println ("4. Получить длину строк");
        System.out.println ("5. Сравнить 2 строки без учета регистра");
        System.out.println ("6. Создать новую строку с помощью конструктора и занести ее в пул литералов");
        System.out.println ("7. Получить из строки массив символов");
        System.out.println ("8. Получить из строки массив байтов");
        System.out.println ("9. Привести строку к верхнему регистру");
        System.out.println ("10. Найти первую позицию символа \"а\" в строке");
        System.out.println ("11. Найти последнюю позицию символа \"а\" в строке");
        System.out.println ("12. Проверить содержит-ли строка слово \"Sun\"");
        System.out.println ("13. Проверить оканчивается-ли строка на \"Oracle\"");
        System.out.println ("14. Проверить начинается-ли строка на \"Java\"");
        System.out.println ("15. Заменить все символы \"а\" в строке на символ \"о\"");
        System.out.println ("16. Получить подстроку с 44 символа по 90 символ");
        System.out.println ("17. Разбить строку по символу пробел (т.е. чтобы каждое слово было отдельным элементом массива)");
        System.out.println ("18. Поменять последовательность символов в строке на обратную.");
    }

    public void selectFromMenu() {
        String first;// = this.getFirstText ();
        String second;// = this.getSecondText();
//        boolean isFirst = this.isFirstText();
//        boolean isSecond = this.isSecondText ();
//        boolean isFirstAndSecond = this.isFirstOrSecondText ();


        this.printMenu ();
        System.out.println ("Выберите: ");
        while (notExit) {
            String str = in.nextLine ();
            switch (str) {
                case "1": {
                    isFirstText ();
                    this.printMenu ();
                }
                break;
                case "2": {
                    isSecondText ();
                    this.printMenu ();
                }
                break;
                case "3": {
                    isFirstOrSecondText();
                    System.out.println ("1-ая строка: ");
                    System.out.print (this.getFirstText ());
                    System.out.println ("2-ая строка:");
                    System.out.print (this.getSecondText ());
                    this.printMenu ();
                }
                break;
                case "4":{
                    isFirstOrSecondText();
                    System.out.println ("Длина первой строки = " + this.getFirstText ().length ());
                    System.out.println ("Длина второй строки = " + this.getSecondText ().length ());
                    this.printMenu ();
                }
                break;
                case "5":{
                    isFirstText();
                    System.out.println ("Первая строка равна Второй без учета регистра ? " + this.getFirstText ().equalsIgnoreCase (this.getSecondText ()));
                    this.printMenu ();
                }
                break;
                case "6":{
                    String ThirdStr = new String ("Sun Oracle Java");
                    ThirdStr = ThirdStr.intern();
                    System.out.println (ThirdStr);
                    this.printMenu ();
                }
                break;
                case "7":{
                    isFirstText ();
                    char[] arr1 = this.getFirstText ().toCharArray ();
                    System.out.println (Arrays.toString (arr1));
                    this.printMenu ();
                }
                break;
                case "8":{
                    isFirstText ();
                    byte[] arr2 = this.getFirstText ().getBytes ();
                    System.out.println (Arrays.toString (arr2));
                    this.printMenu ();
                }
                break;
                case "9":{
                    isFirstText ();
                    String ThirdStr = this.getFirstText ().toUpperCase ();
                    System.out.println ("верхний регистр первой строки: "+ThirdStr);
                    this.printMenu ();
                }
                break;
                case "10":{
                    isFirstText ();
                    System.out.println ("Первая позиция символа \"а\" в строке = " + this.getFirstText ().indexOf ('a'));
                    this.printMenu ();
                }
                break;
                case "11":{
                    isFirstText ();
                    System.out.println ("Первая позиция символа \"а\" в строке = " + this.getFirstText ().lastIndexOf ('a'));
                    this.printMenu ();
                }
                break;
                case "12":{
                    isFirstText ();
                    System.out.println ("Содержит первая строка слово\"Sun\"? "+ this.getFirstText ().contains ("Sun"));
                    this.printMenu ();
                }
                break;
                case "13":{
                    isFirstText ();
                    System.out.println ("Оканчивается-ли первая строка на \"Oracle\""+ this.getFirstText ().endsWith  ("Oracle"));
                    this.printMenu ();
                }
                break;
                case "14":{
                    isFirstText ();
                    System.out.println ("Начинается-ли первая строка на \"Java\""+ this.getFirstText ().startsWith  ("Java"));
                    this.printMenu ();
                }
                break;
                case "15":{
                    isFirstText ();
                    System.out.println (this.getFirstText ().replace ('a', 'o'));
                    this.printMenu ();
                }
                break;
                case "16":{
                    isFirstText ();
                    System.out.println (this.getFirstText ().subSequence (43, 89));
                    this.printMenu ();
                }
                break;
                case "17":{
                    isFirstText ();
                    System.out.println (Arrays.toString (this.getFirstText ().split (" ")));
                    this.printMenu ();
                }
                break;
                case "18":{
                    isFirstText ();
                    System.out.println (new StringBuffer (this.getFirstText ()).reverse ());
                    this.printMenu ();
                }

                case "0": notExit = false; break;
                default:
                    System.out.println ("Неправильно! Еще раз:");
                    break;
            }
        }
    }
}
