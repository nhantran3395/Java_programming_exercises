package com.exercise.TravelAgencyConsoleApplication;

public class Main {
    public static void main(String[] args) {
	// write your code here
        TourService tourService = new TourService();
        Util util = new Util();

        System.out.println("Travel agency application");
        util.printAllToursInList(tourService.getListOfAllTours());

        System.out.println("Below are list of all tours that we are currently operating");
        util.printAllToursInList(tourService.getListOfAllToursOrderByPrice());

        System.out.println("List of tours ordered by price");

        System.out.println("Let try to find all Tu Lan tours");
        try{
            util.printAllToursInList(tourService.filterTourByName("Tu Lan"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
