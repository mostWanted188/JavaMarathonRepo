package day6.Task1;

public class Car {
    private int year;
    private String color;
    private String model;

    Car(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    void dasAuto(){
        System.out.println("Это автомобиль");
    }

    int difYears(int year1){
        int dif = year-year1;
        return dif;
    }

/*    void getInfo(){
        System.out.println(year);
        System.out.println(color);
        System.out.println(model);
    }*/

    /*public void setYear(int yeaR) {
        if(yeaR <= 0) {
            System.out.println("Задайте корректный номер модели ");
        } else year = yeaR;
    }
    public int getYear(){
        return year;
    }

    public void setColor(String coloR){
        if(coloR.isEmpty()){
            System.out.println("Задайте цвет ");
        }else color = coloR;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String modeL){
        if(modeL.isEmpty()){
            System.out.println("Задайте модель ");
        }else model = modeL;
    }
    public String getModel(){
        return model;
    }*/
}

