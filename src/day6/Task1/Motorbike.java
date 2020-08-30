package day6.Task1;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
        System.out.println("moto: " + year + " " + color + " "  + model);
    }

    void dasMoto(){
        System.out.println("Это мотоцикл");
    }

    int difYears(int year1){
        int dif = year-year1;
        return dif;
    }
/*
    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;*/
    }

