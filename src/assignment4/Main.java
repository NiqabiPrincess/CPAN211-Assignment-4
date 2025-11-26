package assignment4;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Hotel> hotels = HotelReader.readHotels("Hotels.txt");

        Collections.sort(hotels);

        System.out.println("=== Hotels Sorted by Stars → Name ===");
        for (Hotel h : hotels) {
            System.out.println(h);
        }
    }
}

