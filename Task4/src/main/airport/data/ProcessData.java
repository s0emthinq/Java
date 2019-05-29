package main.airport.data;

import main.airport.entity.CargoPlane;
import main.airport.entity.PassangerPlane;
import main.airport.logic.Logic;

import java.io.*;
import java.util.ArrayList;


public class ProcessData {
    public static void main(String[] args) throws IOException {
        ProcessData pdo = new ProcessData();
        Logic lo = new Logic();
        ArrayList<PassangerPlane> passangerPlanes = pdo.readAllPassangerPlanesFromFile();
        ArrayList<CargoPlane> cargoPlanes = pdo.readAllCargoPlanesFromFile();
        System.out.println("Whole aircompany capacity: " + lo.getAllCapacity(passangerPlanes) + " people.");
        System.out.println("Whole aircompany load capacity: " + lo.getAllLoadCapacity(cargoPlanes) + " tons.");
    }

    public ArrayList<PassangerPlane> readAllPassangerPlanesFromFile() throws IOException {
        File file = new File("C:\\D\\JavaIntroduction\\Task4\\src\\main\\resources\\PassangerPlanes.txt");
        ArrayList<PassangerPlane> passangerPlanes = new ArrayList<>();


        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String currLine = br.readLine();
        String[] splittedLine; /* Массив для хранения полей одного объекта.*/

        while (currLine != null) {
            splittedLine = currLine.split(",");
            PassangerPlane currPlane = new PassangerPlane();
            currPlane.setConsumption(Float.valueOf(splittedLine[0]));
            currPlane.setSpeed(Float.valueOf(splittedLine[1]));
            currPlane.setWeight(Float.valueOf(splittedLine[2]));
            currPlane.setModel(splittedLine[3]);
            currPlane.setCapacity(Integer.valueOf(splittedLine[4]));
            switch (splittedLine[5]) {
                case "local":
                    currPlane.setRangeType(PassangerPlane.RangeType.local);
                    break;
                case "lowRange":
                    currPlane.setRangeType(PassangerPlane.RangeType.lowRange);
                    break;
                case "middleRange":
                    currPlane.setRangeType(PassangerPlane.RangeType.middleRange);
                    break;
                case "highRange":
                    currPlane.setRangeType(PassangerPlane.RangeType.highRange);
                    break;
                case "ultraHighRange":
                    currPlane.setRangeType(PassangerPlane.RangeType.ultraHighRange);
                    break;
                default:
                    System.out.println("Error during reading PassangerPlanes.txt.Wrong range type.");
            }
            passangerPlanes.add(currPlane);
            currLine = br.readLine();
        }

        return passangerPlanes;
    }

    public ArrayList<CargoPlane> readAllCargoPlanesFromFile() throws IOException {
        ArrayList<CargoPlane> cargoPlanes = new ArrayList<>();
        File file = new File("C:\\D\\JavaIntroduction\\Task4\\src\\main\\resources\\CargoPlanes.txt");

        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String currLine = br.readLine();
        String[] splittedLine; /* Массив для хранения полей одного объекта.*/

        while (currLine != null) {
            splittedLine = currLine.split(",");
            CargoPlane currPlane = new CargoPlane();
            currPlane.setConsumption(Float.valueOf(splittedLine[0]));
            currPlane.setSpeed(Float.valueOf(splittedLine[1]));
            currPlane.setWeight(Float.valueOf(splittedLine[2]));
            currPlane.setModel(splittedLine[3]);
            currPlane.setLoadCapacity(Float.valueOf(splittedLine[4]));
            currPlane.setStorageVolume(Float.valueOf(splittedLine[5]));
            cargoPlanes.add(currPlane);
            currLine = br.readLine();
        }

        return cargoPlanes;
    }

}
