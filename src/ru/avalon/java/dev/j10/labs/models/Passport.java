package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о паспортных данных человека.
 * 
 * Паспортные данные должны включать:
 *  - серию и номер документа;
 *  - имя;
 *  - фамилию;
 *  - отчество;
 *  - второе имя;
 *  - день рождения;
 *  - дату выдачи;
 *  - орган, выдавший документ.
 * 
 */

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
    
        /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечьте возможность использования класса за
     *    пределами пакета.
     */
 
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