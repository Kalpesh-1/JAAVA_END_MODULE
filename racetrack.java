class racetrack{
    public static void main(String[] args) {
        Car c = new Car (2015,"nano",50);
        
        System.out.println("Year model is  "+c.getYear());
        System.out.println("speed is" + c.getSpeed()); 
        System.out.println("model is  " + c.getMake());
       
       
        c.accelarate();



        System.out.println("Current Speed is "+c.getSpeed());
    }
}