package cam.sphoorthi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sphoorthi Gaddam
 */
public class CarObject {
    private String carColor;
    private String carMake;
    private String carModel;
    private int carYear;
    
   
    public CarObject(String carColor,String carMake,String carModel,int carYear){
    this.carColor=carColor;
    this.carMake=carMake;
    this.carModel=carModel;
    this.carYear=carYear;
}
    public String getCarColor(){
        return carColor;
    }
    public String getCarMake(){
        return carMake;
    }
    public String getCarModel(){
        return carModel;
    }
    public int getCarYear(){
        return carYear;
    }
    
    @Override
    public String toString(){
        return "Manufacturer of the Car: "+getCarMake()+"\nModel of the Car: "+getCarModel()+"\nYear Manufactured: "
                +getCarYear()+"\nColor of the Car: "+getCarColor();
    }
    
}
