public class Car {
    private String model;
    private int horsePower;

    public  Car(){}

    public Car(String model, int horsePower){
        this.model = model;
        this.horsePower = horsePower;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public String getInfo(){
        return "Print Car Info: \n" + 
        "----------- \n" +
        "Model = " + this.model + "\n" +
        "Horse Power = " + this.horsePower;
    }
}
