public class Plot_Test {
    public static void main(String[] args) {

      Person owner = new Person("Ahmed", 12, "12/04/2002",  null);
//        Person owner = new Person();
        Plot newPlot = new Plot();

        newPlot.setOwner(owner);


        newPlot.getOwner().print();
    }



}
