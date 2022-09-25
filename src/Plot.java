import java.util.Scanner;

public class Plot {
    private Person owner;
    private String plot_type;
    private double length, width;
    private float price;
    private float slope_angle;
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

    public String getPlot_type() {
        return plot_type;
    }

    public void setPlot_type(String plot_type) {
        this.plot_type = plot_type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSlope_angle() {
        return slope_angle;
    }

    public void setSlope_angle(float slope_angle) {
        this.slope_angle = slope_angle;
    }

    public String getSoil_type() {
        return soil_type;
    }

    public void setSoil_type(String soil_type) {
        this.soil_type = soil_type;
    }

    public String getVegetation() {
        return vegetation;
    }

    public void setVegetation(String vegetation) {
        this.vegetation = vegetation;
    }

    public String getRainfall() {
        return rainfall;
    }
    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void print(){
        System.out.printf(
                "%nLAND ATTRIBUTES%nPlot Type:%s%nLength:%.2fm%nWidth:%.2fm%nPrice:$%.2f%nSlope Angle:%.1f Degree%nSoil Type:%s%nVegetation:%s%nRainfall:%s%n",
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

    public void instance_Setter(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Plot Type: ");
        setPlot_type(input.nextLine());
        System.out.print("Enter Plot Length: ");
        setLength(input.nextDouble());
        System.out.print("Enter Plot Width: ");
        setWidth(input.nextDouble());
        System.out.print("Enter Plot Price: ");
        setPrice(input.nextFloat());
        System.out.print("Enter Slope Angle: ");
        setSlope_angle(input.nextFloat());
        System.out.print("Enter Soil Type: ");
        setSoil_type(input.nextLine());
        System.out.print("Enter Vegetation Length: ");
        setVegetation(input.nextLine());
        System.out.print("Enter Rainfall: ");
        setRainfall(input.nextLine());

    }

}