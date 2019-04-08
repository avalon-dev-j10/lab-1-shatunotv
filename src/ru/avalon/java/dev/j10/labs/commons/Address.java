package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавьте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявлен в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должны быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

public class Address {
    private String region; // область
    private String city; // город
    private String street; // улица
    private String houseNumber; //дом
    private String housing; //корпус
    private String appartments; //кв

 //главный конструктор класса
    //
    public Address(String appartments, String housing, String houseNumber, String street, String city, String region) {
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.housing = housing;
        this.appartments = appartments;
        
    }
// геттеры возвращающие значение 
    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getHousing() {
        return housing;
    }

    public String getAppartments() {
        return appartments;
    }

   
   

}



