package model;
import gui.Gui;

import java.util.ArrayList;
import java.util.List;

public class House {


	Light lightFront = new Light("Front room");
	Light lightBack = new Light("Back room");
	Light lightBedroom = new Light("Bedroom");
	Light lightBathroom = new Light("Bathroom");

	
	private List<Light> light = new ArrayList<Light>();

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Gui GUI = new Gui();
	}

	public House() {


		light.add(lightFront);
		light.add(lightBack);
		light.add(lightBedroom);
		light.add(lightBathroom);
	}

	public List<Light> getLights() {
		return light;
	}


} 
