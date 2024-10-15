package pl.roklimovich.chapter_5;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class HashTableImplementation {
    private static Hashtable<String, String> phoneBook = new Hashtable<>();

    public static void main(String[] args) {
        phoneBook.put(generateUniqueId(), generatePhoneNumber());
        phoneBook.put(generateUniqueId(), generatePhoneNumber());
        phoneBook.put(generateUniqueId(), generatePhoneNumber());

        while (true) {
            System.out.println("1. Show generated phone book");
            System.out.println("2. Get phone number using id");
            System.out.println("3. Add user to phone book");
            System.out.println("4. Remove user from the book using id");
            System.out.println("5. Get HashCodes from PhoneBook");
            System.out.println("6. Stop the program");

            Scanner scanner0 = new Scanner(System.in);
            int enteredValue = scanner0.nextInt();

            if (enteredValue == 6) {
                break;
            }

            switch (enteredValue) {
                case 1:
                    showGeneratedTable();
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter id:");
                    String enteredId = scanner2.nextLine();
                    getNumberById(enteredId);
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Enter new id:");
                    String newId = scanner3.nextLine();
                    System.out.println("Enter new number: ");
                    String number = scanner3.nextLine();
                    addUserToPhoneBook(newId, number);
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Enter id to delete:");
                    String deletedId = scanner4.nextLine();
                    deleteUserFromPhoneBook(deletedId);
                    break;
                case 5:
                    getHashCodes();
                    break;
                default:
                    System.out.println("Entered value doesn't exist");
                    break;
            }

        }
    }

    private static void deleteUserFromPhoneBook(String deletedId) {
        try {
            phoneBook.remove(deletedId);
        } catch (Exception e) {
            System.out.println("Can not delete this user with that id " + deletedId);
        }
    }

    private static void addUserToPhoneBook(String newId, String number) {

        if (!phoneBook.containsKey(newId)) {
            try {
                phoneBook.put(newId, number);
            } catch (Exception e) {
                System.out.println("Can not add this user id: " + newId + " number: " + number + " to hash table");
            }
        } else {
            System.out.println("User with this id " + newId + " already exist");
        }

    }

    private static void showGeneratedTable() {
        System.out.println(phoneBook);
    }

    private static void getNumberById(String id) {
        if (phoneBook.get(id) == null) {
            System.out.println("This id " + id + " doesn't exist");
        } else {
            System.out.println(phoneBook.get(id));
        }
    }

    private static void getHashCodes() {

        for (String value : phoneBook.keySet()) {
            System.out.print(phoneBook.get(value).hashCode() + " ");
        }

        System.out.println("\n");

    }

    public static String generateUniqueId() {
        Random random = new Random();
        int number = random.nextInt(1000, 99999);

        return "id" + number;
    }


    public static String generatePhoneNumber() {
        Random random = new Random();
        int generatedNumber = random.nextInt(100000, 999999);

        return "+48" + generatedNumber;
    }
}