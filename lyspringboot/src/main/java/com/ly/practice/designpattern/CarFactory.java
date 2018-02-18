package com.ly.practice.designpattern;

public class CarFactory {

   public static Car chooseCar(String type){


       if(type.equals("benz")){
         return new Benz();
       }
       if(type.equals("baom")){
           return new Baom();
       }
       return null;

   }

    public static void main(String[] args) {

      Car car = CarFactory.chooseCar("baom");
      car.run();
    }
}
