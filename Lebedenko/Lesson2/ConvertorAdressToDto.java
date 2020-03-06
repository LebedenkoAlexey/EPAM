package src.main.java.Lebedenko.Lesson2;

public class ConvertorAdressToDto {
    public AdressDTO convertor (Human.Adress adress){
        AdressDTO adressDTO = new AdressDTO ();
        adressDTO.setCountry        (adress.getCountry ());
        adressDTO.setRegion         (adress.getRegion ());
        adressDTO.setCity           (adress.getCity ());
        adressDTO.setStreet         (adress.getStreet ());
        adressDTO.setHouseNumber    (adress.getHouseNumber ());
        adressDTO.setApartmentNumber(adress.getApartmentNumber ());

        return adressDTO;
    }
}
