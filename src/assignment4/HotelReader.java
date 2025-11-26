package assignment4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HotelReader {

    public static List<Hotel> readHotels(String filename) {
        List<Hotel> hotels = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String name = parts[0].trim();
                int stars = Integer.parseInt(parts[1].trim());
                double price = Double.parseDouble(parts[2].trim());

                hotels.add(new Hotel(name, stars, price));
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return hotels;
    }
}
