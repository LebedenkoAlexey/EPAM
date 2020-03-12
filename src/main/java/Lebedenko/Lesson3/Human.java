package main.Java.Lebedenko.lesson3;

public class Human {
    private String fio;
    private int age;
    private Adress adress;//= new Address ();

    public Human() {
    }

    public Human(String fio, int age, Adress adress) {
        this.fio = fio;
        this.age = age;
        this.adress = adress;
    }

    public static class Adress {
        private String country;
        private String region;
        private String city;
        private String street;
        private Integer houseNumber;
        private Integer apartmentNumber;

        public Adress() {
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return ("Human{ ФИО: "+this.getFio ()+"; Возраст: "+ this.getAge () +
                "; Адрес:{ Страна: "+this.getAdress ().getCountry ()+"; Область:"+this.getAdress ().getRegion ()+
                "; Город:"+this.getAdress ().getCity ()+"; Улица:"+this.getAdress ().getStreet ()+
                "; Номер дома:"+this.getAdress ().getHouseNumber ()+"; Квартира:"+this.getAdress ().getHouseNumber ());
    }
}

class HumansSortedByAge extends Human implements Comparable <Human> {
    @Override
    public int compareTo(Human h){
        return this.getAge ()-h.getAge ();
    }


}
