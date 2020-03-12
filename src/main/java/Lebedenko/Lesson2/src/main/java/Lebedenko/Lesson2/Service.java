package main.Java.Lebedenko.lesson2;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Service implements IDBInterface<HumanDTO>{

    private WorkWithDB workWithDB = new WorkWithDB ();
    private ConvertorHumanToDTO convertorHumanToDTO =new ConvertorHumanToDTO ();
    ConverttorDTOToHuman converttorDTOToHuman = new ConverttorDTOToHuman ();

    @Override
    public  HumanDTO getSingleRecordFromDB() {
        log.info("Запрос одной сущности из Базы Данных");
        HumanDTO humanDTO = new HumanDTO();
        try {

            humanDTO = convertorHumanToDTO.convertor (workWithDB.generateHumanEntity ());
            System.out.println ("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println ("Одна Сущность получена из Базы Данных");
            System.out.println ("......................................................................................");
            return humanDTO;
        } catch (UnresolvedIDException e) {
            log.warn("Внимание! "+e.getMessage ());
            //System.out.println ("!!! "+e.getMessage ());

            return humanDTO;
        }
    }

    @Override
    public HumanDTO[] getAllRecordFromDB() {
        HumanDTO[] humansDTO = new HumanDTO[10];
        Integer i=0;
        log.info ("Запрос списка сущностей из Базы данных");
        try {
            for (i = 0; i < 10; i++) {
                humansDTO[i] = convertorHumanToDTO.convertor (workWithDB.generateHumanEntity ());
            }
            System.out.println ("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println ("Список Сущностей из Базы Данных получен");
            System.out.println ("......................................................................................");
            return humansDTO;
        }catch (UnresolvedIDException e){
            log.warn("Внимание! "+(i+1)+") !!! "+e.getMessage ());
            //System.out.println ((i+1)+") !!! "+e.getMessage ());
            return humansDTO;
        }
    }

    @Override
    public void saveSingleEntityToDB(HumanDTO human) {
        log.info ("Сохранение одной записи в Базу Данных");
        try{
        System.out.println ("=====================================================================================");
        System.out.println ("Сохранение одной сущности в Базу Данных");
        Human h =new Human ();
        System.out.println (h=converttorDTOToHuman.convertor (human));
        System.out.println("======================================================================================");
        }catch (NullPointerException e){
            log.error ("Ошибка! "+ e.getMessage ());
            //System.out.println ("!!! " + e.getMessage ());
        }
    }

    @Override
    public void saveAllEntitiesToDB(HumanDTO[] humanDTOS, int quantity) {
        log.info ("Сохранение списка записей в Базу Данных");
        try {
            System.out.println ("======================================================================================");
            System.out.println ("Сохранение Списка сущностей в Базу Данных");
            for (Integer j = 0; j < quantity; j++) {
                //ConverttorDTOToHuman converttorDTOToHuman = new ConverttorDTOToHuman ();
                Human h = new Human ();
                System.out.print (j + 1 + ") ");
                System.out.println (h = converttorDTOToHuman.convertor (humanDTOS[j]));
                if (j != quantity - 1)
                    System.out.println ("--------------------------------------------------------------------------------------");
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            log.error ("Ошибка! " + e1.getMessage ());
            //System.out.println ("!!! " + e1.getMessage ());
        }catch (NullPointerException e2){
            log.error ("Ошибка! " + e2.getMessage ());
            //System.out.println ("!!! " + e2.getMessage ());
        }finally {
            System.out.println ("======================================================================================");
        }
    }
}
