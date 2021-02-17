import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Noten übersetzen
        //Schreibe ein Programm, dass eine Schulnote in numerischer Form (1-5) in seine textuelle Form übersetzt:

        /*Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number);

        String[] grades = {"Sehr gut", "Gut", "Befriedigend", "Genügend", "Nicht genügend"};

        System.out.println("Meine Note in textueller Form: " + grades[number - 1] + ".");
        */

        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        System.out.println(grade);


        switch (grade) {
            case 1 -> System.out.println(grade + ": " + "Sehr gut");
            case 2 -> System.out.println(grade + ": " + "Gut");
            case 3 -> System.out.println(grade + ": " + "Befriedigend");
            case 4 -> System.out.println(grade + ": " + "Genügend");
            case 5 -> System.out.println(grade + ": " + "Nicht genügend");
            default -> System.out.println("Keine gültige Eingabe.");
        }
    }
}