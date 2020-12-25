package com.exercise.TravelAgencyConsoleApplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TourService {
    private final List<Tour> tourList;

    public TourService() {
        this.tourList = new ArrayList<>();

        Tour tuLan2 = new Tour("Tu Lan Cave Encounter","Phong Nha - Quang Binh","Oxalis Adventure",2, BigDecimal.valueOf(213.54));
        Tour sonDoong4 = new Tour("Son Doong Expedition","Phong Nha - Quang Binh","Oxalis Adventure",4,BigDecimal.valueOf(2510.75));
        Tour hangEn2 = new Tour("Hang En Cave Adventure","Phong Nha - Quang Binh","Oxalis Adventure",2,BigDecimal.valueOf(295.08));

        this.tourList.add(tuLan2);
        this.tourList.add(sonDoong4);
        this.tourList.add(hangEn2);
    }

    public List<Tour> getListOfAllTours(){
        return tourList;
    }

    public List<Tour>  getListOfAllToursOrderByPrice(){
        Comparator<Tour> byPrice = Comparator.comparing(Tour::getPrice);
        return tourList
                .stream()
                .sorted(byPrice)
                .collect(Collectors.toList());
    }

    public List<Tour> filterTourByName(String name) throws TourNotFoundException {
        List<Tour> tourListMatchedName =
                tourList
                    .stream()
                    .filter(tour -> tour.getName().contains(name))
                    .collect(Collectors.toList());

        if(tourListMatchedName.isEmpty()){
            throw new TourNotFoundException("Sorry, there is no tour that match your search");
        }

        return tourListMatchedName;
    }
}
