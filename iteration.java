import java.util.*;
public class iteration{

     public static void main(String[] args) {
        int n=5;

        // for loop 
        // ->when you know the start and end points ,its better to use a for loop

        for(int i=0;i<5;i++)
        System.out.print("Hello");

        //While loop
         // ->when you have various conditions ,its better to use a while

         while(n!=0){
            System.out.print("Hello");n--;
         }
         //Do while loop
         //->its enter the loop even if the condition is false

         n=9;
         do{
            System.out.print("Hello");
            n--;
         }while(n<5);

        }
    }
