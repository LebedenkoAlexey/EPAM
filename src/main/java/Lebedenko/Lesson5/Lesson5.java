package src.main.java.Lebedenko.Lesson5;


public class Lesson5 {
    public static void main(String[] args) throws Exception{
        String rst = Color.RESET.toString ();
        System.out.println (Color.BLACK_BOLD+"Black_Bold"+rst);
        System.out.println ("Black");
        System.out.print (Color.YELLOW);
        System.out.print (Color.BLUE_BACKGROUND);
        System.out.println ("YELLOW & BLUE");
        System.out.print (Color.RESET);

        System.out.print (Color.YELLOW);
        System.out.println ("YELLOW");
        System.out.print (Color.RESET);
//    Menu menu = new Menu ();
//    menu.menu ();
        Print print = new Print ("D:\\Projects\\Java\\5DZ\\src\\main\\java\\qwerty.txt",0);
        print.printText ();
//        YYY yyy = new YYY ();
//        Class clss =yyy.getClass ();
//        Method method =clss.getDeclaredMethod ("uuuuu");
//        method.invoke (yyy);
//        Commands.add.doIt ();
        }
    }

