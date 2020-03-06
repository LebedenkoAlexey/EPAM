package src.main.java.Lebedenko.Lesson2;

import java.util.Date;

public class Human {
    private Integer id;
    private String name;
    private String birthDate;
    private Adress adress; //= new Address ();

    public Human() {
    }

    public Human(Integer id, String name, Adress adress) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
    }

    public static class Adress{
        private String country;
        private String region;
        private String city;
        private String street;
        private Integer houseNumber;
        private Integer apartmentNumber;

        public Adress(){
        }

        public Adress(String country, String region, String city, String street, Integer houseNumber, Integer apartmentNumber) {
            this.country = country;
            this.region = region;
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
            this.apartmentNumber = apartmentNumber;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public Integer getHouseNumber() {
            return houseNumber;
        }

        public void setHouseNumber(Integer houseNumber) {
            this.houseNumber = houseNumber;
        }

        public Integer getApartmentNumber() {
            return apartmentNumber;
        }

        public void setApartmentNumber(Integer apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
        }
    }

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
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
