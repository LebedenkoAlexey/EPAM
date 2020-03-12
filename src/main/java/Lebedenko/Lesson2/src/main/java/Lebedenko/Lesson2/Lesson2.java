package main.Java.Lebedenko.lesson2;


import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Lesson2 {
    public static void main(String[] args) {
        Service service = new Service ();
        HumanDTO[] humansDTO;
        HumanDTO humanDTO;

        humanDTO = service.getSingleRecordFromDB ();
        System.out.println ("Одна Сущностей преобразован в DTO");
        System.out.println ("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        service.saveSingleEntityToDB (humanDTO);

        try {
            Scanner in = new Scanner (System.in);
            humansDTO = service.getAllRecordFromDB ();
            System.out.println ("Список Сущностей преобразован в DTO");
            System.out.println ("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            service.saveAllEntitiesToDB (humansDTO, Integer.parseInt (in.nextLine ()));
        } catch (NumberFormatException e) {
            log.warn ("Ошибка! "+"!!! "+e.getMessage ());
            //System.out.println ("!!! "+e.getMessage ());
        }

    }
}
