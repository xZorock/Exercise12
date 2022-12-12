package it.develhope.exercise12;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please set the name: ");
        person.setName(scanner.nextLine());

        System.out.println("Please set the surname: ");
        person.setSurname(scanner.nextLine());

        System.out.println("Please set the height: ");
        person.setHeight(scanner.nextDouble());

        System.out.println("Please set the age: ");
        person.setAge(scanner.nextInt());

        System.out.printf("Full name is %s %s \n The height is %.2f \n The age is %d",person.getName(),person.getSurname(),person.getHeight(),person.getAge());
    }
}
