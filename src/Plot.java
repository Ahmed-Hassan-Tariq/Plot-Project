public class Plot {
    private String owner;
    private String plot_type;
    private double length, width;
    private float price;
    private int slope_angle;
    private String soil_type;
    private String vegetation;
    private String rainfall;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPlot_type() {
        return plot_type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPlot_type(String plot_type) {
        this.plot_type = plot_type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSlope_angle() {
        return slope_angle;
    }

    public void setSlope_angle(int slope_angle) {
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

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }

    public void setVegetation(String vegetation) {
        this.vegetation = vegetation;
    }
}