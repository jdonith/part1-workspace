package com.entertainment;

public class Television {

  private String brand;
  private int volume;

  public void turnOn() {
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() { System.out.println("The " + brand + "television is off"); }



  public String getBrand() { return brand; }



  public void setBrand(String brand) { this.brand = brand; }



  public int getVolume() { return volume; }



  public void setVolume(int volume) { this.volume; }
}






@Override
public String toString() {
  return "com.entertainment.Television{" + "brand='" + brand + '\'' +
      ", volume =" + volume +
      '}';

}