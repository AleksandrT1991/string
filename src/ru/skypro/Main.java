package ru.skypro;

public class Main {

    public static void main(String[] args) {
      // ������� 1
        String firstName = "���� ";
        String middleName = "�������� ";
        String lastName = "������ ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
    // ������� 2
        System.out.println();
        String upperName = fullName.toUpperCase();
        System.out.println(upperName);

//    // ������� 3
        System.out.println();
        String s = fullName.replace('�', '�');
        System.out.println(s);

    }
}
