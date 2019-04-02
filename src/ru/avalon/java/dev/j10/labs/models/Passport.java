package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;


//

public class Passport {

    private String serialNumber; //серия номер паспорта
    private String name;//имя
    private String surName; //фамилия
    private String fatherName; //отчество
    private String secondName; //второе имя
    private String birth; //дата рождения
    private String issue; //дата выдачи паспорта
    private String org; //организация выдающая паспорт
    private Address address; //
 
// главный конструктор класса
    //
    public Passport(String name, String surName, String fatherName, String secondName, String birth,
            String serialNumber, String issue, String org, Address address) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.secondName = secondName;
        this.birth = birth;
        this.issue = issue;
        this.org = org;
        this.address = address;
    }
    
// геттеры возвращающие значение 
    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirth() {
        return birth;
    }

    public String getIssue() {
        return issue;
    }

    public String getOrg() {
        return org;
    }

    public Address getAddress() {
        return address;
    }



} 