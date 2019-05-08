import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg;
        int choice;
        Scanner so = new Scanner(System.in);
        Dinosaur dinosaur = new Dinosaur();

        System.out.println("Input the dinosaurs weight(in kilos):");
        kg = so.nextDouble();
        dinosaur.setWeight(kg);
        System.out.println("Please,choose the units to convert to:\n1.Milligrams\n2.Grams\n3.Tons");
        choice = so.nextInt();

        switch (choice) {
            case 1:
                System.out.println(kg + " kilos are " + dinosaur.toMilligrams(dinosaur.getWeight()) + " milligram()s");
                break;
            case 2:
                System.out.println(kg + " kilos are " + dinosaur.toGrams(dinosaur.getWeight()) + " gram(s)");
                break;
            case 3:
                System.out.println(kg + " kilos are " + dinosaur.toTons(dinosaur.getWeight()) + " ton(s)");
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }

    }

}
