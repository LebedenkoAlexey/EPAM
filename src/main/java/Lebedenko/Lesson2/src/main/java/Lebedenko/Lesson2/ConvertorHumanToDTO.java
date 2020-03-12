package main.Java.Lebedenko.lesson2;

public class ConvertorHumanToDTO {
    public HumanDTO convertor (Human human){
        HumanDTO humanDTO = new HumanDTO ();
        AdressDTO adressDTO = new ConvertorAdressToDto ().convertor (human.getAdress ());

        humanDTO.setId          (human.getId ());
        humanDTO.setName        (human.getName ());
        humanDTO.setBirthDate   (human.getBirthDate ());
        humanDTO.setAdress      (adressDTO);

        return humanDTO;
    }
}
