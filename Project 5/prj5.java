   // <====================> //
  // Program Assignment #2  //
 // <====================> //




  //  Starting Point of Java Program  //
 //  ==============================  //
//  ==============================  //

public class prj5 {
    public static void main(String[]args) {


// Assigning Values to Variables //
String M = ("Meters");
String Q = ("Meters Squared");
String F = ("The surface area of this room's floor: ");
String G = ("The surface area of the 4 walls in this room: ");
double l = 45.50;
double w = 20.25;
double h = 15.50;
double floorresult = w * l;
double wallmath = l + w;
double wallresult = wallmath * h * 2;
double mtsqtotal = l * w;


// System Printing & Concatenating String Constants & Variables // 
System.out.println("A Rectangular Shaped Room has the Following Dimensions: ");
System.out.println("\t➼➡ A length of " + l + " " + M + ",");
System.out.println("\t➼➡ A width of " + w + " " + M + ",");
System.out.println("\t➼➡ A height of " + h + " " + M + ".");
System.out.println();
System.out.println();
System.out.println("The surface area of this room's floor:");
System.out.println("\t = " + floorresult + " " + Q);
System.out.println();
System.out.println();
System.out.println("The combined surface area of all 4 walls in this room:");
System.out.println("\t = " + wallresult + " " + Q);
System.out.println();
System.out.println();
System.out.println("The total square footage of the room:");
System.out.println("\t = " + mtsqtotal + " " + Q);

  //  Ending Point of Java Program  //
 //  ============================  //
//  ============================  //




    }
}
