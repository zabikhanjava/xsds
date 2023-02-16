package com.example.xsd;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class Boo {


  public static void main(String[] args) throws JAXBException, IOException {

    String vinPrefix = "BAUCRDGEZ";
    //int vinStartSufixx = 22082601;  //ib upload
    //int vinSuffix = 22082601;       //ib upload
    int vinStartSuffix = 22090601;    //construction State
    int vinSuffix = 22090601;          //construction State
    int numberOfVehicles = 3;
    ArrayList<String> vinList = new ArrayList<>();
    for (int i = vinSuffix; vinSuffix <= vinStartSuffix + (numberOfVehicles - 1); vinSuffix++) {
      vinList.add(vinPrefix + vinSuffix);
    }

    try {
      FileWriter myWriter = new FileWriter(
          "approval.csv");
      myWriter.write("vin;brand;country;checksum\n");
      for (String vin : vinList) {
        myWriter.write(vin + ";Audi;DE;" + UUID.randomUUID() + "\n");
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

}
