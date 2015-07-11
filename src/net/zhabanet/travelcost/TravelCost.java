/*
 * Tthis program uses the total distance of a trip
 * the km/l of a vehicle and the current price 
 * of gas to calculate the total cost of the trip
 */

package net.zhabanet.travelcost;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TravelCost {

  private static double distance;
  private static double kmpl;
  private static double pricePerLiter;
  private static double totalCost;

  private static NumberFormat formatter = new DecimalFormat("#0.00");

  public static void main(String[] args) {

    // specifying the decimal delimeter
    // http://stackoverflow.com/questions/9081814/how-to-specify-decimal-delimiter
    //
    Scanner in = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Enter the total distance in km: ");

    distance = in.nextDouble();

    System.out.println("Enter the kmpl for the vehicule: ");

    kmpl = in.nextDouble();

    System.out.println("Enter the current price of a liter of gas: ");

    pricePerLiter = in.nextDouble();

    totalCost = (distance / kmpl) * pricePerLiter;

    System.out.println("The trip is going to cost " + formatter.format(totalCost));

    in.close();

  }

}
