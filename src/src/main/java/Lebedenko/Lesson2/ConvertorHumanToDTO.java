package EPAM_Lessons.Lesson2;

import java.util.Date;

public class ConvertorHumanToDTO {
    public HumanDTO convertor (Human human){
        HumanDTO humanDTO = new HumanDTO ();
        AdressDTO adressDTO = new ConvertorAdressToDto().convertor (human.getAdress ());

        humanDTO.setId          (human.getId ());
        humanDTO.setName        (human.getName ());
        humanDTO.setBirthDate   (human.getBirthDate ());
        humanDTO.setAdress      (adressDTO);

        return humanDTO;
    }
}
