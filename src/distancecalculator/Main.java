package distancecalculator;

public class Main {
    public static void main(String[] args) {

        // I think it's called instantiating an object of the Havesine Distance Class or some shit like that
        HaversineDistance distance = new HaversineDistance();

        // This is actually the distance between Cape Town and Johannesburg
        double someRandomDistance = distance.haversineDistance(-33.918861,18.423300,-26.195246,28.034088, 22, 1742);


        System.out.println("In m " + someRandomDistance);
        System.out.println("In km " + someRandomDistance / 1000);
    }
}
