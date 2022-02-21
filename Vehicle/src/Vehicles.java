
public class Vehicles {

  String drive = "yes";
  String s = new String();
  String steer = s;
  boolean filled;
  java.util.Date dateCreated;

  public Vehicles() {
    dateCreated = new java.util.Date();
  }

  public Vehicles(String drive, boolean filled) {
    dateCreated = new java.util.Date();
    this.drive = drive;
    this.filled = filled;
  }

  public String getDrive() {
    return drive;
  }

  public void setDrive(String drive) {
    this.drive = drive;
  }

  public String getSteer() {
    return steer;
  }

  public void setSteer(String steer) {
    this.steer = steer;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  public String toString() {
    return "craeted on" + dateCreated + "\nDrive:" + drive + " and Steer:" + filled;
  }

}


