import java.util.*;
public class PrimitiveDataTypes{

     public static void main(String[] args) {
        int a=5;//4 bytes ->32 bits
        short b=2;//2 bytes ->16bits
        byte c=1;  //1 byte   ->8bits
        long d=50000000l ;//8 bytes

        System.out.print(a+" "+b+" "+c+" "+d+"\n");

        double a1=5.5;
        float b1=5.5f;
        char ch='A';
        ch=66;//ASCII value of 'B';
        System.out.print(a1+" "+b1+" "+ch+"\n");

        double d1=5;//implicit type conversion
        int e1=(int)(5.6);//type casting
        System.out.print(d1+" "+e1);

    }
}