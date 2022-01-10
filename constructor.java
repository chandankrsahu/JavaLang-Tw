import java.util.*;
class calc{
    int x,y,z;
    calc(){
        x=1;y=1;
    }
    calc (int x,int y){
        this.x=x;
        this.y=y;
    }
    calc(int x1,double y1){
        x=x1;
        y=(int)y1;
    }
    

}
public class constructor{

     public static void main(String[] args) {
        calc obj;//reference 
        obj=new calc(4,5.4);//object creation
        System.out.print(obj.y);
     }
    }