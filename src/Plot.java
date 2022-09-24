public class Plot {
    private Person owner;
    private String plot_type;
    private double length, width;
    private float price;
    private int slope_angle;
    private String soil_type;
    private String vegetation;
    private String rainfall;

    public Person getOwner() { return owner; }
    public void setOwner(Person owner) {
            this.owner = owner;
    }


}