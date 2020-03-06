package src.main.java.Lebedenko.Lesson2;

public class ConverttorDTOToHuman {
    public Human convertor (HumanDTO humanDTO) {
        Human human = new Human ();
        Human.Adress adress = new ConvertorDTOToAdress().convertor(humanDTO.getAdress ());

        human.setId         (humanDTO.getId ());
        human.setName       (humanDTO.getName ());
        human.setBirthDate  (humanDTO.getBirthDate());
        human.setAdress     (adress);
        return human;
    }
}
