
public class Truck extends Vehicles {
  private double Steer;

  public Truck() {}

  public void Truck(double steer) {
    this.Steer = steer;
  }

  public Truck(double steer, String drive, boolean filled) {
    this.Steer = steer;
    setDrive(drive);

  }

  public void setDrive(String drive) {
    // TODO Auto-generated method stub

  }

  public double getSteer() {
    return Steer;

  }

  public void setSteer(double steer) {
    this.Steer = steer;
  }

  protected void Drive() {
    System.out.println("Drive!");
  }

  void stop() {
    System.out.println("Stop !");
  }
}
