package Relationship;

/**
 * @author Rajendhiran Easu
 * @date 27, October-2019
 */
public class Aggregation {
    public static void main(String[] args) {

        LocationInfo locationInfo = new LocationInfo(15.8139, 12.4521);

        UberCab uberCab = new UberCab("1242", "Ragavan", locationInfo);
        UberEats uberEats = new UberEats("1342", locationInfo);

        System.out.println("Uber Position: " + uberCab.bookingLocationDetails.lat + "," + uberCab.bookingLocationDetails.lng);
        System.out.println("Relationship.UberEats Order Id: " + uberEats.orderId);
    }
}

class UberEats {
    public String orderId;
    public LocationInfo orderLocationDetails;

    public UberEats(String orderId, LocationInfo orderLocationDetails) {
        this.orderId = orderId;
        this.orderLocationDetails = orderLocationDetails;
    }
}

class UberCab {
    public String driverId, driverName;
    public LocationInfo bookingLocationDetails;

    public UberCab(String driverId, String driverName, LocationInfo bookingLocationDetails) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.bookingLocationDetails = bookingLocationDetails;
    }
}

class LocationInfo {
    public double lat, lng;

    public LocationInfo(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
