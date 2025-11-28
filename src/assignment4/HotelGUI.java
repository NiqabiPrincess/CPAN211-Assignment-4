package assignment4;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



public class HotelGUI extends Application{
	
	private ListView<String> hotelListView;
	private List<Hotel> hotels;
	
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hotel Sorter");
		
		hotels = HotelReader.readHotels("Hotels.txt");
		
		hotelListView = new ListView<>();
		updateListView(hotels);
		
		Button sortStarsButton = new Button("Sort by Stars");
        Button sortPriceButton = new Button("Sort by Price");
        Button saveButton = new Button("Save to File");

        sortStarsButton.setOnAction(e -> sortByStars());
        sortPriceButton.setOnAction(e -> sortByPrice());
        
        VBox layout = new VBox(10);
		layout.getChildren().addAll(hotelListView, sortStarsButton, sortPriceButton, saveButton);
        
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
		
		
		
	}
	
	 private void updateListView(List<Hotel> hotelList) {
	        hotelListView.getItems().clear();
	        for (Hotel hotel : hotelList) {
	            hotelListView.getItems().add(hotel.toString());
	        }
	    }
	    
	    private void sortByStars() {
	        Collections.sort(hotels);
	        updateListView(hotels);
	    }
	    
	    private void sortByPrice() {
	        hotels.sort(Comparator.comparingDouble(Hotel::getPrice));
	        updateListView(hotels);
	    }

}
