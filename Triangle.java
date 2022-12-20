import java.util.Scanner;;
class Triangle{
    /** Return true if the sum of every two sides is
     * * greater than the third side. */
    public static boolean isValid(double side1, double side2, double side3){
        if((side1 + side2 > side3) ||(side2 + side3 > side1) ||(side1 + side3 > side2) ){
            return true;
        }
        return false;
    }

    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        double areaSquared = s *(s - side1) + s *(s - side2) + s *(s - side3);
        double area = Math.sqrt(areaSquared);
        return area;
    }
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        //Triangle tri = new Triangle();
        System.out.print("side1: ");
        double side1 = scn.nextDouble();
        System.out.println("side2: ");
        double side2 = scn.nextDouble();
        System.out.print("side3: ");
        double side3 = scn.nextDouble();

        if(isValid(side1,side2,side3) == true){
            System.out.println(area(side1, side2, side3));
        }
        else{
            System.out.println("the triangle is invlaid");
        }
    }
 }