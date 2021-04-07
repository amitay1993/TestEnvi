import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfFloors;
        System.out.println("Enter number of floors");
        Scanner scanner=new Scanner(System.in);
        numberOfFloors=scanner.nextInt();
        System.out.println("The minimum number os steps required is "+calcFloor(numberOfFloors));

    }
    public static int calcFloor(int floor){
      int a=1,b=1,c=-2*floor;
      //preparing for quadratic solution
      //Some explations regading the code:
        /*
        assuming the we dropped the egg from nth floor
        1.if it breaks we should step one by one till we get the correct answer.
        2.if it does not break we should jump (n-1) steps up,since we already checked the current floor.
            so over all the formual would be (n^2-n)/2;
         */
      double solution2;
      double solution1=(-b+Math.sqrt(b*b-4*a*c))/2*a; //quadratic solution
      int minFloor= (int) Math.floor(solution1+1); //rounding up the solution in order to find the initial step size
      a=-1;
      b=2*minFloor+1;
      //calculating the formula in order to find the number of jumps.
      //There is no option to get Complex solution.
      solution1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
      //Minimum number of jumps
      return (int) Math.floor(solution1+1);
    }
}


