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

  private static final String DISTANCE_PROMPT = "Enter the total distance in km: ";
  private static final String CONSUMPTION_PROMPT = "Enter the L/100km value for the vehicle: ";
  private static final String GAS_PRICE_PROMPT = "Enter the current price of a liter of gas: ";

  private static double distance;
  private static double kmpl;
  private static double pricePerLiter;
  private static double totalCost;

  private static NumberFormat formatter = new DecimalFormat("#0.00");

  public static void main(String[] args) {

    // specifying the decimal delimeter
    // http://stackoverflow.com/questions/9081814/how-to-specify-decimal-delimiter
    //
    Scanner in = new Scanner(System.in);
    in.useLocale(Locale.US);

    System.out.println(DISTANCE_PROMPT);

    distance = in.nextDouble();

    System.out.println(CONSUMPTION_PROMPT);

    kmpl = in.nextDouble();

    System.out.println(GAS_PRICE_PROMPT);

    pricePerLiter = in.nextDouble();

    totalCost = computeCost(distance, kmpl, pricePerLiter);

    System.out.println("The trip is going to cost " + formatter.format(totalCost));

    in.close();

  }

  private static double computeCost(double distance, double kmpl, double pricePerLiter) {

    return (distance / kmpl) * pricePerLiter;
  }

}
