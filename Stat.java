import java.util.*;
class stat{
    int empid;
    static String ceo;
     static int officeNo;
    static{
        officeNo=87557;//office no will be same for everyone.
    }
    public void show(){
        System.out.println(empid+" : "+officeNo+" : "+ceo);
    }
}
 class Stat{
    public static void main(String[] args) {
        stat Ram=new stat();
        Ram.empid=1;
        Ram.ceo="Indira";
        stat lakhan=new stat();
        lakhan.empid=2;

        stat.ceo="Rajiv";//ceo changed;
        //can also be written as lakhan.ceo
        Ram.show();
        lakhan.show();

    }
}