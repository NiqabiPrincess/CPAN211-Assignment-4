package assignment4;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelSorter {

    // Sort by natural order (stars → name)
    public static void sortByStarsAndName(List<Hotel> hotels) {
        Collections.sort(hotels);
        System.out.println("\n--- Sorted by Star Rating & Name ---");
        hotels.forEach(System.out::println);
    }

    // Sort by lowest price using Comparator
    public static void sortByLowestPrice(List<Hotel> hotels) {
        Comparator<Hotel> priceComparator =
                Comparator.comparingDouble(Hotel::getPrice);

        Collections.sort(hotels, priceComparator);

        System.out.println("\n--- Sorted by Lowest Price ---");
        hotels.forEach(System.out::println);
    }
}
