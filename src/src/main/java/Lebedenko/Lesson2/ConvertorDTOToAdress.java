package EPAM_Lessons.Lesson2;

public class ConvertorDTOToAdress {
    public Human.Adress convertor (AdressDTO adressDTO) {
        Human.Adress adress = new Human.Adress ();
        adress.setCountry (adressDTO.getCountry ());
        adress.setRegion (adressDTO.getRegion ());
        adress.setCity (adressDTO.getCity ());
        adress.setStreet (adressDTO.getStreet ());
        adress.setHouseNumber (adressDTO.getHouseNumber ());
        adress.setApartmentNumber (adressDTO.getApartmentNumber ());

        return adress;
    }
}
