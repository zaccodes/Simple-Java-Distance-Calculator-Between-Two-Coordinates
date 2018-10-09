package distancecalculator;

public class HaversineDistance {
    public double haversineDistance(double latitudeOne,
                                    double longitudeOne,
                                    double latitudeTwo,
                                    double longitudeTwo,
                                    double elevationOne,
                                    double elevationTwo){
        //Shit's never changing
        final double radiusOfTheEarth = 6371;

        //Convert Degrees to Radians
        double convertedLatitudeOne = Math.toRadians(latitudeOne);
        double convertedLatitudeTwo = Math.toRadians(latitudeTwo);
        double deltaLatitude = Math.toRadians(latitudeTwo - latitudeOne);
        double deltaLongtitude = Math.toRadians(longitudeTwo - longitudeOne);

        // Harversine Formula
        double a = (Math.sin(deltaLatitude/2) * Math.sin(deltaLatitude/2))
                + ( Math.cos(convertedLatitudeOne) * Math.cos(convertedLatitudeTwo) )
                * (Math.sin(deltaLongtitude/2) * Math.sin(deltaLongtitude/2) );
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distance = radiusOfTheEarth * c * 1000; //convert to meters

        double height = elevationOne - elevationTwo;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);
        //Return the distance obviously
        return Math.sqrt(distance);
    }
}
