import java.io.StringBufferInputStream;

public class Television {

  private String brand;
  int volume;

  public void turnOn() {
    System.out.println("The " + " television is on, with a volume of " + volume);
  }

  void turnOff() {
    System.out.println("The " + brand + " television is off");}

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public void setBrand() {

  }

    public String toString(){
    return "Television: Brand=" +brand + ",volume" + volume;

    }

  public void setVolume() {
  }
}

