//Name: <Nevin Gutta>

// Class: CS 3305

// Term: Spring 2024

// Instructor: Umama Tasnim
import java.util.Scanner;
 class AverageGradeNevinGutta {



     //recursive compute average method
     public static double computeAverage(int[] arrClassSize, int index, int sum){
         // Terminating condition to prevent infinite recursion
         if (index == arrClassSize.length){
             //if length is equal to zero return zero to prevent divide by 0 error
             if (arrClassSize.length == 0){
                 return 0;
             }
             //returns average of the sum once terminating condition is met
             else{
                 return (double) sum / arrClassSize.length;
             }
         }
         //recursion statement where the index is being incremented by one and adding to the sum each time it runs
         else{
             return computeAverage(arrClassSize, index + 1, sum + arrClassSize[index]);
         }


     }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //while loop to repeat questions if user enters wrong information
        while (true){

            //class size is equal to array size.
            System.out.print("Class Size: ");
            int classSize = input.nextInt();
            input.nextLine();
            if (classSize == 0){
                System.out.println("Class size is 0. No averages can be computed.");
                System.exit(0);
            }
            int[] arrClassSize = new int[classSize];



            //have to convert input from string to int because input is spaced out
            System.out.print("Entered grades: ");
            String enteredGrades = input.nextLine();

            //splits up each integer when there's a space between each number
            String [] numberOfEnteredGrades = enteredGrades.split(" ");


            //if the number of entered grades is not the same as class size display an error message
            if (classSize != numberOfEnteredGrades.length){
                System.out.println("Entered grades does not match with class size!");
            }
            else{
                //converting each string seperated by a space to an integer
                for (int i= 0; i < classSize; i++){
                    arrClassSize[i] = Integer.parseInt(numberOfEnteredGrades[i]);
                }
                //pass the input and variable to the compute average recursion method
                double averageGrades = computeAverage(arrClassSize, 0,0);
                //prints out the class avaerage from the recursion method
                System.out.print("Class Average: " + averageGrades);
                //exits out of loop
                System.exit(0);
            }
        }
    }
}