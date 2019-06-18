package data;

import org.apache.log4j.Logger;


import java.io.*;
import java.util.ArrayList;


public class ProcessData {
    private static final Logger logger = Logger.getLogger(ProcessData.class);

    public static ArrayList<String> readPlanesFromFile() throws IOException {

        File file = new File("C:\\D\\Task4\\src\\main\\resources\\planes.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> planes = new ArrayList<>();
        String currLine = br.readLine();

        while (currLine != null) {
            planes.add(currLine);
            currLine = br.readLine();
        }
        return planes;
    }
}
