package src.main.java.Lebedenko.Lesson2;

import java.util.Date;

public class Lesson2 {
    public static void main(String[] args) {
        //HumanDTO humanDTO=new HumanDTO ();
        //Human.Address humanAddress = new Human.Address ("Россия","Самарская область","Тольятти","Ул. Ленина",7,25);


        Human human= new Human ();
        ConvertorAdressToDto convertorAdressToDto =new ConvertorAdressToDto();
        ConvertorHumanToDTO convertorHumanToDTO = new ConvertorHumanToDTO ();
        ConvertorDTOToAdress convertorDTOToAdress = new ConvertorDTOToAdress();
        ConverttorDTOToHuman converttorDTOToHuman = new ConverttorDTOToHuman ();
        WorkWithDB workWithDB = new WorkWithDB ();
        workWithDB.saveSingleRecordToDB (converttorDTOToHuman.convertor (convertorHumanToDTO.convertor (workWithDB.getAllRecordFromDB())));
        workWithDB.saveAllRecordToDB (converttorDTOToHuman.convertor (convertorHumanToDTO.convertor (workWithDB.getAllRecordFromDB())));





//        Human.Adress humanAdress = new Human.Adress ("ksakhgck","kdagcuigiudc","kqwgdigiqudgiuqg","KAHGDKGAKD",8,9);
//       Human human = new Human (7,"kgiygf",humanAdress);
//        System.out.println (human.getId ()+" "+human.getName ()+" A"+human.getAdress().getCountry ()+" ");
//
//        System.out.println (new ConvertorHumanToDTO ().Convertor (human).getName ());
//        System.out.println (new ConvertorHumanToDTO ().Convertor (human).getAdress ().getCity ());
//        System.out.println (" ");
//        System.out.println (new ConverttorDTOToHuman ().convertor (new ConvertorHumanToDTO ().Convertor (human)).getName ());
//        System.out.println (new ConverttorDTOToHuman ().convertor (new ConvertorHumanToDTO ().Convertor (human)).getAdress ().getCity ());


        // WorkWithDB workWithDB = new WorkWithDB ();

        //workWithDB.getSingleRecordFromDB ();
    }
}

