package src.main.java.Lebedenko.Lesson2;

import java.lang.reflect.Array;
import java.util.Random;

public class WorkWithDB implements IDBInterface <Human> {
    @Override
    public Human getSingleRecordFromDB() {
        String[] familiaImia = new String[] {"Лебеденко Алексей","Абрамов Иван","Еостенкова Юлия", "Дервюнин Айрат", "Симонов Юрий"};
        Random rndId  = new Random ();
        Random rndFamiliaImia = new Random ();
        Random rndDay = new Random ();
        Random rndMonth = new Random ();
        Random rndYear = new Random ();

        Human human = new Human ();
        human.setId (rndId.nextInt (1000000000));
        human.setName (familiaImia[rndFamiliaImia.nextInt (4)]);
        human.setBirthDate (Integer.toString (rndDay.nextInt (27)+1)+"."+Integer.toString (rndMonth.nextInt (11)+1)+"."+Integer.toString (rndMonth.nextInt (30)+1980));

        return human;
    }

    @Override
    public Human getAllRecordFromDB() {
        String[] familiaImia = new String[] {"Лебеденко Алексей","Абрамов Иван","Еостенкова Юлия", "Дервюнин Айрат", "Симонов Юрий"};
        Random rndId  = new Random ();
        Random rndFamiliaImia = new Random ();
        Random rndDay = new Random ();
        Random rndMonth = new Random ();
        Random rndYear = new Random ();

        String[][][] countryRegionCity = new String[][][] {{{"Россия","Московская обл.","Москва"},{"Россия","Московская обл.","Балашиха"}},{{"Россия","Самарская обл.","Тольятти"},{"Россия","Самарская обл.","Самара"}},{{"Украина","Одесская обл.","Одесса"},{"Украина","Одесская обл.","Килия"}},{{"Украина","Полтавская обл.","Полтава"},{"Украина","Полтавская обл.","Гребёнка"}},{{"Казахстан","Уральская обл.","Уральск"},{"Казахстан","Уральская обл.","Темир"}},{{"Казахстан","Закаспийская Обл.","Асхабат"},{"Казахстан","Закаспийская Обл.","Красноводск"}}};
        String[]  street = new String[] {"ул. Центральная","ул. Мира","ул. Ленина","ул. Жукова"};
        Random rndStreet = new Random ();
        Random rndHouseNumber = new Random ();
        Random rndApartmentNumber= new Random ();
        Random rnd1 = new Random ();
        Random rnd2 = new Random ();
        int p1=rnd1.nextInt (2);
        int p2=rnd2.nextInt (2);
        Human human = new Human ();

        human.setId (rndId.nextInt (1000000000));
        human.setName (familiaImia[rndFamiliaImia.nextInt (4)]);
        human.setBirthDate (Integer.toString (rndDay.nextInt (27)+1)+"."+Integer.toString (rndMonth.nextInt (11)+1)+"."+Integer.toString (rndMonth.nextInt (30)+1980));

        Human.Adress humanAdress = new Human.Adress();// ("11","11","11","11",11,11);
        humanAdress.setCountry (countryRegionCity[p1][p2][0]);
        humanAdress.setRegion (countryRegionCity[p1][p2][1]);
        humanAdress.setCity (countryRegionCity[p1][p2][2]);
        humanAdress.setStreet (street[rndStreet.nextInt (3)]);
        humanAdress.setHouseNumber (rndHouseNumber.nextInt (100));
        humanAdress.setApartmentNumber (rndApartmentNumber.nextInt (50));
        human.setAdress (humanAdress);
        return human;
    }

    @Override
    public void saveSingleRecordToDB(Human human) {
        System.out.println ("ID: "+human.getId ()+", ФИО:"+human.getName ()+", Дата рождения:"+human.getBirthDate ());
        System.out.println("--------------------------------------------------------------------------------------");
    }

    @Override
    public void saveAllRecordToDB(Human human) {
        System.out.println ("ID: "+human.getId ()+", ФИО:"+human.getName ()+", Дата рождения:"+human.getBirthDate ());
        System.out.println ("Страна: "+human.getAdress ().getCountry ()+", Область:"+human.getAdress ().getRegion ()+", Город:"+human.getAdress ().getCity ()+
                ", Улица:"+human.getAdress ().getStreet ()+", Дом:"+human.getAdress ().getHouseNumber ()+", Номер квартиры:"+human.getAdress ().getApartmentNumber ());
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
