package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;


public class Main {

    public static void main(String[] args) {

//инициализация в статическом методе
//
        Person ivanov = null;
        Person smith = null;
        Address smithAddress = new Address("квартира", "корпус", "дом", 
                "улица", "город", "край/область");
        
        Address ivanovAddress = new Address("квартира", "корпус", "дом", 
                "улица", "город", "край/область");
        //присваивание значений
        Passport smithPassport = new Passport("John", "Smith", null, "Edvard", "11.11.1111",
                "*можно больше не переделывать?*", "11.11.2011", " Монреальским РУВД", new Address("11", "1", "111",
                        "Первая", "Москва", "Московская область"));
       
        
        
        smith = new Person(smithPassport, smithAddress);

        Passport ivanovPassport = new Passport("Иван", "Иванов", "Иванович", null,
                "22.22.2222", "Х1ВС 222222", "22.22.2022", "Лондонским РУВД",  
                new Address("22", "2", "222", "Вторая", "Чебоксары",
                        "Чебоксарская область") );

        ivanov = new Person(ivanovPassport, ivanovAddress);

//вывод в консоль

        String ivanovFullName = ivanov.getFullName();
        System.out.println( ivanovFullName );
        
        String ivanovFullAddress = ivanov.getAddress();
        System.out.println(ivanovFullAddress);

        String smithFullName =smith.getFullName();
        System.out.println(smithFullName);

        String smithFullAddress = smith.getAddress();
        System.out.println(smithFullAddress);

    }
}