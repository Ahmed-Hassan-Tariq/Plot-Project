import java.util.Scanner;

public class Plot_Test {
    public static void main(String[] args) {

        Person owner = new Person(
                "Ahmed",
                12,
                "12/04/2002",
                "+92-012-3456789");



        Plot dhaPlot = new Plot(
                "Residential",
                10,
                10,
                25000,
                23,
                "Clay",
                "Grassland",
                "33mm" );

        dhaPlot.setOwner(owner);

//        dhaPlot.instance_Setter();

        if(dhaPlot.getOwner()!=null) {dhaPlot.getOwner().print();}

        dhaPlot.print();
    }



}
