package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;

class Main  {

//Person ivanov = null;
//Person smith = null;
  String ivanovFullName;  
    
    
public static void main(String args[]) {
    
          Person ivanov = new Person ("Иван", "Иванов");
          Person smith = new Person("John", "Smith");
          ivanov.setFatherName("Иванович");
          smith.setSecondName("Edvard");
          
    /*
          Класс Person должен состоять из вдух классов - Passport и Address!!!
          Переделать объявление ivanov и smith!
          */

    
    Passport ivanovPassport = new Passport("11.11.2011", "1111 111111", 
            "11.11.2019г.", "РУВД города Санкт-Петербурга");
    Passport smithPassport = new Passport("22.02.2012", "2222 222222", 
            "22.02.2019г.", "РУВД города Москва");
    
    Address ivanovAddress = new Address(" 111", " 11",
            " Первая", " Санкт-Петербург");
    Address smithAddress = new Address(" 222", " 22",
            " Вторая", " Москва");
   

   System.out.println(ivanov.getFullName());
   
   System.out.println(ivanovPassport.getBirthday() + " года рождения, паспорт"
           + " " + ivanovPassport.getSerialNumber()  + 
           ", выдан " + ivanovPassport.getIssueDate() + " " + 
           ivanovPassport.getOrg());
    
   System.out.println(ivanovAddress.getFullAddress());
   
   System.out.println(smith.getFullName());
      
   System.out.println(smithPassport.getBirthday() + " года рождения, паспорт " 
           + smithPassport.getSerialNumber()  + 
           ", выдан " + smithPassport.getIssueDate() + " " + 
           smithPassport.getOrg());
   
   
   System.out.println(smithAddress.getFullAddress());
   /* TODO (Проверка №1)
        Методы getFullName и getFullAddress должны быть описаны в классе Person
        здесь не должно быть из реализации!!!!
        Смотри первоначальные условия!!!
   
   */
   
    }   
 
}
