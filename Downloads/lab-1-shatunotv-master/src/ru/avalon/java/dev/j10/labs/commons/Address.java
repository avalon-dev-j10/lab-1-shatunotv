package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    String fullAddress;
    String city;
    String street;
    String houseNumber;
    String numberOfApartments;
    Address ivanovAddress;
    Address smithAddress;
    
    /*  TODO (Проверка №1)
        Поля Address  - Address ivanovAddress и Address smithAddress здесь не должно быть!
        Поле String fullAddress; должно быть в классе Person, по условию задачи!
        Не все поля класса описаны - отсутствует № квартиры, Область, № корпуса.
    */
   
    public Address(String numberOfApartments, String houseNumber,
            String street, String city) {

        
        this.numberOfApartments = numberOfApartments;
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        
    }

    /*  TODO (Проверка №1)
        Добавить коментарии к полям и методам класса
        В конструкторе не все инициализируются поля класса!!!
        Создать несколько конструкторов - один с полным набором параметров,
        остальные без возможно остсутствующих параметров, при этом сделать
        прегрузку конструкторов со ссылкой конструктора с меньшим количеством
        параметров на конструктор с большим или полным кол. параметров
    */
   

    public String getFullAddress() {
        return "прописан и проживает:" + " кв." + numberOfApartments + ", дом" + houseNumber + ", ул." + 
                street + ", г." + city;
    }

   public void setFullAddress() {
        
   
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

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(String numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
    
}
  