package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * 
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 *     - именем;
 *     - паспортными данными;
 *     - пропиской по месту жительства.
 *
 */

public class Person {
    
    //экземпляры класса
    private Passport passport;
    private Address address;
    
    //главный конструктор класса
    public Person(Passport passport, Address address) {
        this.passport = passport;
        this.address = address;
    }
    
    /**
     * Возвращает полное имя человека.
     * 
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращает Имя, Фамилию и Отчество, разделённые пробелом.
     * 
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * 
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    
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
        
        /*  TODO (Проверка №2 ЛР№1)
            - Поставленные условия не выполняются! Читай условия вывода метода
            getFullName. Исправить!
            - Возвращать значение null не рекомендуется!  Исправить!
        */
    }
    
    /**
     * Возвращает адрес, по которому проживает человек.
     * 
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    
    //присваивание адресных значений
    public String getAddress() {
     


        Address address = passport.getAddress();

        return "проживает и прописан: " + address.getAppartments() + " квартира, корпус " + address.getHousing() + ", дом " +
                address.getHouseNumber() + ", улица " + address.getStreet() + ", город "
                + address.getCity() + ", " + address.getRegion();
    }


}