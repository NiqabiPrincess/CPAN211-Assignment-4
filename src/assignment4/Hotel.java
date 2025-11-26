package assignment4;

public class Hotel implements Comparable<Hotel> {
    private String name;
    private int stars;
    private double price;

    public Hotel(String name, int stars, double price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Hotel other) {
        int starCompare = Integer.compare(other.stars, this.stars);
        if (starCompare != 0) {
            return starCompare;
        }
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return stars + " Star - " + name + " ($" + price + ")";
    }
}
