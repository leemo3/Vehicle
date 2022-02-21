
public class Cars extends Vehicles {
  private double Steer;

  public Cars() {}

  public void Cars(double steer) {
    this.Steer = steer;
  }

  public Cars(double steer, String drive, boolean filled) {
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


