import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Noten übersetzen

        //Schreibe ein Programm, dass eine Schulnote in numerischer Form (1-5) in seine textuelle Form übersetzt:

        //Bei einer 1 wird "Sehr gut" auf die Konsole geschrieben
        //Bei einer 2 wird "Gut" auf die Konsole geschrieben
        //Bei einer 3 wird "Befriedigend" auf die Konsole geschrieben
        //Bei einer 4 wird "Genügend" auf die Konsole geschrieben
        //Bei einer 5 wird "Nicht Gengügend" auf die Konsole geschrieben



        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number);

        String[] grades = {"Sehr gut", "Gut", "Befriedigend", "Genügend", "Nicht genügend"};

        System.out.println("Meine Note in textueller Form: " + grades[number - 1] + ".");

    }
}