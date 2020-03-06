package src.main.java.Lebedenko.Lesson2;

import java.util.Date;

public class HumanDTO {
    private Integer id;
    private String name;
    private String birthDate;
    private AdressDTO adress; //= new Address ();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public AdressDTO getAdress() {
        return adress;
    }

    public void setAdress(AdressDTO adress) {
        this.adress = adress;
    }
}

