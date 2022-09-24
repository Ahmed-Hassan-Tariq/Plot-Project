public class Plot {
    private Person owner;
    private String plot_type;
    private double length, width;
    private float price;
    private int slope_angle;
    private String soil_type;
    private String vegetation;
    private String rainfall;

    public Plot(String plot_type, double length, double width, float price, int slope_angle, String soil_type,
                String vegetation, String rainfall){
        this.plot_type = plot_type;
        this.length = length;
        this.width = width;
        this.price = price;
        this.slope_angle = slope_angle;
        this.soil_type = soil_type;
        this.vegetation = vegetation;
        this.rainfall = rainfall;
    }
    public Plot(){}


    public Person getOwner() { return owner; }
    public void setOwner(Person owner) {
            this.owner = owner;
    }
    public void print(){
        System.out.printf(
                "%nLAND ATTRIBUTES%nPlot Type:%s%nLength:%.2fm%nWidth:%.2fm%nPrice:$%.2f%nSlope Angle:%d Degree%nSoil Type:%s%nVegetation:%s%nRainfall:%s%n",
                plot_type,
                length,
                width,
                price,
                slope_angle,
                soil_type,
                vegetation,
                rainfall
        );
    }

}