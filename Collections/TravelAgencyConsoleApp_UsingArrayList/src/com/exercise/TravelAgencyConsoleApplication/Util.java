package com.exercise.TravelAgencyConsoleApplication;

import java.util.List;

public class Util {
    public Util() {
    }

    public void printAllToursInList(List<Tour> tourList){
        tourList.forEach(System.out::println);
    }
}
