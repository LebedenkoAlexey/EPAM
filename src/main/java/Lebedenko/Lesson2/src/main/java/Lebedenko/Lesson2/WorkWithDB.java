package main.Java.Lebedenko.lesson2;


import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class WorkWithDB {

    private String[] familiaImia = new String[] {"Лебеденко Алексей","Абрамов Иван","Еостенкова Юлия", "Дервюнин Айрат", "Симонов Юрий"};
    private Random rndId  = new Random ();
    private Random rndFamiliaImia = new Random ();
    private Random rndDay = new Random ();
    private Random rndMonth = new Random ();
    private Random rndYear = new Random ();
    private String[][][] countryRegionCity = new String[][][] {{{"Россия","Московская обл.","Москва"},{"Россия","Московская обл.","Балашиха"}},{{"Россия","Самарская обл.","Тольятти"},{"Россия","Самарская обл.","Самара"}},{{"Украина","Одесская обл.","Одесса"},{"Украина","Одесская обл.","Килия"}},{{"Украина","Полтавская обл.","Полтава"},{"Украина","Полтавская обл.","Гребёнка"}},{{"Казахстан","Уральская обл.","Уральск"},{"Казахстан","Уральская обл.","Темир"}},{{"Казахстан","Закаспийская Обл.","Асхабат"},{"Казахстан","Закаспийская Обл.","Красноводск"}}};
    private String[]  street = new String[] {"ул. Центральная","ул. Мира","ул. Ленина","ул. Жукова"};
    private Random rndStreet = new Random ();
    private Random rndHouseNumber = new Random ();
    private Random rndApartmentNumber= new Random ();
    private Random rnd1 = new Random ();
    private Random rnd2 = new Random ();
    private int p1=rnd1.nextInt (2);
    private int p2=rnd2.nextInt (2);

    public Human generateHumanEntity () throws UnresolvedIDException{
        log.info ("Сформированны данные из Базы Даных");
        Human human = new Human ();

        int i;
            i=rndId.nextInt (100);
            human.setId (i);
            human.setName (familiaImia[rndFamiliaImia.nextInt (4)]);
            human.setBirthDate (Integer.toString (rndDay.nextInt (27) + 1) + "." + (rndMonth.nextInt (11) + 1) + "." + (rndYear.nextInt (30) + 1980));
            Human.Adress humanAdress = new Human.Adress ();// ("11","11","11","11",11,11);
            humanAdress.setCountry (countryRegionCity[p1][p2][0]);
            humanAdress.setRegion (countryRegionCity[p1][p2][1]);
            humanAdress.setCity (countryRegionCity[p1][p2][2]);
            humanAdress.setStreet (street[rndStreet.nextInt (3)]);
            humanAdress.setHouseNumber (rndHouseNumber.nextInt (100));
            humanAdress.setApartmentNumber (rndApartmentNumber.nextInt (50));
            human.setAdress (humanAdress);
            if (i < 20){
                throw new UnresolvedIDException ("Неразрешенный Идентификатор (ID < 20): " + (i+1));}
            return human;
    }
}
