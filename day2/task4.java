package day2;

public class task4 {
    String name;
    double saler;
    double hireyare;

    public task4 (String n, double s, double h) {
        name = n;
        saler = s;
        hireyare = h;

    }

    public double getHireyare() {
        return 2024 - hireyare;
    }
    public double getSaler (){
        return  saler *12;

    }
}

