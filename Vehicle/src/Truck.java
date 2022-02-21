
public class Truck extends Vehicles {
  private String Steer;

  public Truck() {}

  public void Truck(String steer) {
    this.Steer = steer;
  }

  public Truck(String steer, String drive, boolean filled) {
    this.Steer = steer;
    setDrive(drive);

  }

  public void setDrive(String drive) {
    // TODO Auto-generated method stub

  }

  public String getSteer() {
    return Steer;

  }

  public void setSteer(String steer) {
    this.Steer = steer;
  }

  protected void Drive() {
    System.out.println("Drive!");
  }

  void stop() {
    System.out.println("Stop !");
  }
}
