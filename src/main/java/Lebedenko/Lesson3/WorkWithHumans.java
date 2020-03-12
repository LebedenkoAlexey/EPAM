package main.Java.Lebedenko.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WorkWithHumans {
    private Human globalhuman;
    private Human.Adress adress;
    private Set<Integer> duplicatesHumansTemp = new TreeSet<Integer> ();
    private List<Human> humans = new ArrayList<Human> ();
    private List<Human> sortedHumans = new ArrayList<Human> ();
    List<Integer> duplicatesHumans = new ArrayList<Integer> ();

    public void doHumans() {
        humans.add (new Human ("Абрамов Илья Валерьевич", 29, new Human.Adress ("Россия", "Самарская область", "Тольятти", "ул. Ленина", 8, 25)));
        humans.add (new Human ("Абрамов Илья Валерьевич", 29, new Human.Adress ("Россия", "Самарская область", "Тольятти", "ул. Ленина", 8, 25)));
        humans.add (new Human ("Петров Игорь Савельевич", 68, new Human.Adress ("Россия", "Самарская область", "Тольятти", "ул. Правды", 18, 125)));
        humans.add (new Human ("Водкин Аркадий Савельевич", 43, new Human.Adress ("Россия", "Самарская область", "Тольятти", "ул. Ленина", 2, 2)));
        humans.add (new Human ("Водкин Аркадий Савельевич", 43, new Human.Adress ("Россия", "Самарская область", "Тольятти", "ул. Ленина", 2, 2)));
        humans.add (new Human ("Смиренко Вадим Павлович", 31, new Human.Adress ("Россия", "Самарская область", "Самара", "ул. Ленина", 12, 125)));
        humans.add (new Human ("Иванов Иван Иванович", 50, new Human.Adress ("Россия", "Самарская область", "Самара", "ул. Фрунзе", 17, 10)));
        humans.add (new Human ("Иванов Иван Иванович", 50, new Human.Adress ("Россия", "Самарская область", "Самара", "ул. Фрунзе", 17, 10)));
        humans.add (new Human ("Петров Петр Петрович", 60, new Human.Adress ("Россия", "Самарская область", "Тольятти", "ул. Орджаникидзе", 77, 100)));
        humans.add (new Human ("Сидоров Владимир Петрович", 18, new Human.Adress ("Россия", "Самарская область", "Тольятти", "ул. Юбилейная", 57, 7)));
    }
    public void  searchForDuplicateHumans (){
        Human human;
        Human human2;

        for (int i = 0; i < humans.size (); i++) {
            human = humans.get (i);
            for (int j = i; j < humans.size (); j++) {
                if (i != j) {
                    human2 = humans.get (j);
                    if (human.getFio ().equals (human2.getFio ())&human.getAge ()== (human2.getAge ())) {
                        duplicatesHumansTemp.add (j);
                    }
                }
            }
        }

    }

    public void printHumans(List<Human> h) {
        Human human;
        for (int i=0; i<h.size ();i++){
            human = h.get (i);
            System.out.println (human);//human.getFio()+" "+human.getAge ());
        }
    }

    public void printAllHumans() {
        this.printHumans(humans);
        }

    public void printSortedHumans() {
        System.out.println ("");
        System.out.println ("Отсортированный список:");
        sortedHumans();
        this.printHumans(sortedHumans);
    }

    public void deleteAndPrintDuplicatesHumans(){
        Human human;
        List<Integer> duplicatesHumans = new ArrayList<Integer> ();
        for (Object o : duplicatesHumansTemp) {
            duplicatesHumans.add (Integer.parseInt (o.toString ()));
        }

        System.out.println ("Удаляемые дубли:");
        for (int i =0; i < duplicatesHumans.size (); i++){
            human = humans.get (duplicatesHumans.get (i));
            System.out.println (human);//human.getFio()+" "+human.getAge ());
        }

        for (int i = duplicatesHumans.size () -1; i >= 0; i--){
            humans.remove (duplicatesHumans.get (i).intValue ());
        }


    }

    public void sortedHumans(){//List<Human> srt){
        for (int i=0; i<humans.size ();i++){
            sortedHumans.add (humans.get (i));
        }
    }


}
