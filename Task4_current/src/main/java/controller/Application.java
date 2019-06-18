package controller;

import data.AirplanesFactory;
import data.ProcessData;
import entity.Airplane;

import exceptions.IllegalParametersException;
import exceptions.WrongParametresNumberException;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;

public class Application {
    private static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws IOException, WrongParametresNumberException, IllegalParametersException {
        logger.info("Application started...");
        ArrayList<Airplane> airplanes = AirplanesFactory.getPlanesAsObjects(ProcessData.readPlanesFromFile());
        for (Airplane airplane :
                airplanes) {
            System.out.println(airplane);
        }
        logger.info("Application stopped.");
    }
}