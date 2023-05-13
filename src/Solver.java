import java.util.Scanner;

public class Solver {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Law of Cosines\n2. Law of Sines");
        int choice = input.nextInt();
        if(choice == 1){ 
            System.out.println("1. Solve for side\n2. Solve for angles");
            choice = input.nextInt();
            if(choice == 1){
                System.out.println("Enter side a");
                double a = input.nextDouble();
                System.out.println("Enter side b");
                double b = input.nextDouble();
                System.out.println("Enter angle C in degrees");
                double C = Math.toRadians(input.nextDouble());
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(C));
                System.out.println("Side c is " + c);
            }
            if(choice == 2){
                System.out.println("Enter side a");
                double a = input.nextDouble();
                System.out.println("Enter side b");
                double b = input.nextDouble();
                System.out.println("Enter side c");
                double c = input.nextDouble();
                double A = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));
                double B = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)));
                double C = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
                System.out.println("Angle A is " + A + "\nAngle B is " + B + "\nAngle C is " + C);
            }
        }
        if(choice == 2){
            System.out.println("1. Solve for side\n2. Solve for angles");
            choice = input.nextInt();
            if(choice == 1){
                System.out.println("Enter side with known angle");
                double side = input.nextDouble();
                System.out.println("Enter angle with known side in degrees");
                double angle = Math.toRadians(input.nextDouble());
                System.out.println("Enter angle with unknown side in degrees");
                double angle2 = Math.toRadians(input.nextDouble());
                double angle3 = Math.toRadians(180 - (Math.toDegrees(angle) + Math.toDegrees(angle2)));
                double side2 = (side * Math.sin(angle2)) / Math.sin(angle);
                double side3 = (side * Math.sin(angle3)) / Math.sin(angle);
                System.out.println("Side with angle entered " + side2 + "\nSide with angle not entered is " + side3);
            }
            if(choice == 2){
                System.out.println("Enter side with known angle");
                double side = input.nextDouble();
                System.out.println("Enter angle with known side in degrees");
                double angle = Math.toRadians(input.nextDouble());
                System.out.println("Enter side with unknown angle");
                double side2 = input.nextDouble();
                if(side2 > side){
                    double calc = side2 / side * Math.sin(angle);
                    if(calc > 1){
                        System.out.println("No solution");
                    }
                    else if(calc == 1){
                        System.out.println("Angle is 90 degrees");
                    }
                    else{
                        System.out.println("Two solutions: ");
                        double angle2 = Math.toDegrees(Math.asin(calc));
                        double angle3 = 180 - angle2;
                        System.out.println("Solution 1: " + angle2 + "\nSolution 2: " + angle3);
                    }
                }
                if(side2 == side){
                    System.out.println("Angle is " + angle + " degrees");
                }
                else{
                    double angle3 = Math.toDegrees(Math.asin((side2 / side) * Math.sin(angle)));
                    System.out.println("Angle is " + angle3 + " degrees");
                }
            }
        }
        
    }
}
