package SWE;


class TravelAgency{
	String bus;
	String car;
}

class Trip{
	TravelAgency ta = new TravelAgency();
}

public class Travel {
     public static void main(String[] args) {
    	 Trip trip = new Trip();
    	 trip.ta.bus="travel";
    	 System.out.println(trip.ta.bus);
     }
}
