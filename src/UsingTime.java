
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mohammadHossein
 */
public class UsingTime {

    public static void main(String[] args) {
        ////////////////////////////////////constructors methods testing
        Time obj1 = new Time();
        System.out.println(obj1.toString());
        Time obj2 = new Time(12,90,15);
        System.out.println(obj2.toString());
        Time obj3 = new Time(obj2);
        System.out.println(obj3);
        ////////////////////////////////////setters methods testing
        obj1.setTime(19, 20, 59);
        System.out.println(obj1.toString());
        obj1.setHour(12);
        System.out.println(obj1.toString());
        obj1.setMinute(40);
        System.out.println(obj1.toString());////////////////////////////////////
        obj1.setSecond(45);
        System.out.println(obj1.toString());
        ////////////////////////////////////getters methods testing
        Time obj5 = new Time(12,14,16);
        Time obj6 = new Time(12,34,45);
        boolean b = obj5.equals(obj6);
        if(b == true){
            System.out.println("is equals");
        }else{
            System.out.println("is not equal!!!");
        }
        obj1.finalize();

    }
}
