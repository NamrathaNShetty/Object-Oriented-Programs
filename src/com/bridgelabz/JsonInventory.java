package com.bridgelabz;


import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonInventory {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader("C:\\Users\\Thispc\\IdeaProjects\\Object Oriented Programs\\src\\Resources\\InventoryData.json"));
            JSONObject inventoryObj = (JSONObject) obj;

            JSONArray riceArray = (JSONArray) inventoryObj.get("Rice");
            JSONArray wheatArray = (JSONArray) inventoryObj.get("Wheat");
            JSONArray pulseArray = (JSONArray) inventoryObj.get("Pulses");

            /* Getting Rice details */
            System.out.println("Details of Rice are : ");
            for (Object item1 : riceArray) {
                JSONObject riceDetails = (JSONObject) item1;
                System.out.println(riceDetails);
                String name1 = (String) riceDetails.get("name");
                Long weight1 = (long) riceDetails.get("weight");
                Long price1 = (long) riceDetails.get("price");

                System.out.println("\nName : " + name1);
                System.out.println("\nWeight : " + weight1);
                System.out.println("\nPrice per kg. : " + price1);

                Long ricePrice = weight1 * price1;
                System.out.println("\nTotal Price of " + riceDetails.get("name") + " is : " + ricePrice);
            }
            /* Getting Wheat details */
            System.out.println("Details of Wheat are : ");
            for (Object item2 : wheatArray) {
                JSONObject wheatDetails = (JSONObject) item2;
                System.out.println(wheatDetails);
                String name1 = (String) wheatDetails.get("name");
                Long weight1 = (long) wheatDetails.get("weight");
                Long price1 = (long) wheatDetails.get("price");

                System.out.println("\nName : " + name1);
                System.out.println("\nWeight : " + weight1);
                System.out.println("\nPrice per kg. : " + price1);

                Long ricePrice = weight1 * price1;
                System.out.println("\nTotal Price of " + wheatDetails.get("name") + " is : " + ricePrice);
            }
            /* Getting Pulses details */
            System.out.println("Details of Pulses are : ");
            for (Object item1 : pulseArray) {
                JSONObject pulseDetails = (JSONObject) item1;
                System.out.println(pulseDetails);
                String name1 = (String) pulseDetails.get("name");
                Long weight1 = (long) pulseDetails.get("weight");
                Long price1 = (long) pulseDetails.get("price");

                System.out.println("\nName : " + name1);
                System.out.println("\nWeight : " + weight1);
                System.out.println("\nPrice per kg. : " + price1);

                Long ricePrice = weight1 * price1;
                System.out.println("\nTotal Price of " + pulseDetails.get("name") + " is : " + ricePrice);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}