package ru.skypro;

public class Main {

    public static void main(String[] args) {
      // задание 1
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
    // задание 2
        System.out.println();
        String upperName = fullName.toUpperCase();
        System.out.println(upperName);

//    // задание 3
        System.out.println();
        String s = fullName.replace('ё', 'е');
        System.out.println(s);

    }
}
