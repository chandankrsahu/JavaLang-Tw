import java.util.*;
class calc{
    int x,y,z;
    public void perform(){
        z=x+y;
    }

}
public class classAndObject{

     public static void main(String[] args) {
         calc obj;//reference 
         obj=new calc();//object creation
         obj.x=5;
         obj.y=10;
         obj.perform();
         System.out.print(obj.z);
     }
    }

