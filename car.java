class Car{
    
    private int year;
    private String make;
    private double speed;

    Car (int year,String make, double speed){
        this.year=year;
        this.make=make;
        this.speed=speed;

    }
    int getYear(){
        return year;
    }
    String getMake(){
        return this.make;
    }
    double getSpeed(){
        return speed;
    }
    void accelarate(){
        speed=speed+1;
    }
}