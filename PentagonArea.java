/*(Geometry: area of a pentagon) Write a program that prompts the user to enter 
the length from the center of a pentagon to a vertex and computes the area of the 
pentagon */

import java.util.Scanner;
class PentagonArea {
    double length;
    public double computeArea(double length){
        double s = 2 * length * Math.sin(Math.PI/5);
        double divisor = 4 * Math.tan(Math.PI/5);
        double dividend = 5 * Math.pow(s,2);
        double area = dividend / divisor;
        return area;
    }


    public static void main(String[] args){
        //objects
        Scanner scn = new Scanner(System.in);
        PentagonArea pntArea = new PentagonArea();

        //get length
        System.out.print("Enter the length from the center to a vertex: ");
        double length = scn.nextDouble();
        double area = pntArea.computeArea(length);
        //Display area on the console
        System.out.println("The area of the pentagon is: " + area);        
    }
}