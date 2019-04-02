package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

//
public class Person {
//экземпляры класса
    private Passport passport;
    private Address address;
//главный конструктор класса
    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }
//присваивание значений в зависимости от налачия имени\отчества
    public String getFullName() {
   
        if (passport.getFatherName() != null && passport.getSecondName() == null)
            
            return passport.getSurName() + " " + passport.getName() + " " + 
                    passport.getFatherName()+ " " + passport.getBirth() +
                    " года рождения, " + "паспорт " + passport.getSerialNumber() 
                            + ", выдан " + passport.getIssue() + "г. " + 
                    passport.getOrg();

        if (passport.getFatherName() == null && passport.getSecondName() != null)

            return passport.getName() + "  " + passport.getSecondName().charAt(0)
                    + ".  " + passport.getSurName()+ " " + passport.getBirth() +
                    " года рождения, " + "паспорт " + passport.getSerialNumber() 
                            + ", выдан " + passport.getIssue() + "г. " + 
                    passport.getOrg();


        if (passport.getFatherName() == null && passport.getSecondName() == null)

            return passport.getName() + " " + passport.getSurName() + " " 
                    + passport.getBirth() + " года рождения, " + "паспорт "
                    + passport.getSerialNumber() + ", выдан " + 
                    passport.getIssue() + "г. " + passport.getOrg();


        return null;
        

     
    }
//присваивание адресных значений

    public String getAddress() {
     


        Address address = passport.getAddress();

        return "проживает и прописан: " + address.getAppartments() + " квартира, корпус " + address.getHousing() + ", дом " +
                address.getHouseNumber() + ", улица " + address.getStreet() + ", город "
                + address.getCity() + ", " + address.getRegion();
    }


}