package com.greatlearning.driver;
import com.greatlearning.service.SkyScraper;

public class SkyscraperDriver {

	public static void main(String[] args) {
		SkyScraper ss = new SkyScraper();
        int no_of_floors = ss.inputFloors();
        ss.assemblyPlan(no_of_floors);

	}
}