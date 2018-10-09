package distancecalculator;

public class Main {
    public static void main(String[] args) {

        // I think it's called instantiating an object of the Harvesine Distance Class
        HaversineDistance distance = new HaversineDistance();


        double anotherRandomDistance = distance.haversineDistance(-33.918861,18.423300,-26.195246,28.034088, 22, 1742);


        System.out.println("In m " + anotherRandomDistance);
        System.out.println("In km " + anotherRandomDistance / 1000);
    }
}
