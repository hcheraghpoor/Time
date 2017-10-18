/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohammadHossein
 */
public class Time {

    private int hour;
    private int minute;
    private int second;
    //////////////////////////
    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@constructors

    public Time() {
        System.out.println("the constructors is called.");//برای اطمینان از اجرای سازنده
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int h, int m, int s) {
        //System.out.println("the constructors is called.");
        setTime(h, m, s);
    }

    //clone
    public Time(Time t) {
        hour = t.hour;
        minute = t.minute;
        second = t.second;
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@setters
    public void setHour(int h) {
        if ((h >= 0 && h < 24)) {
            hour = h;
            
        } else {
            System.err.println("the Hour is invalid!!! Timer not set");
        }
    }

    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            System.err.println("the Minute is invalid!!! Timer not set");
        }
    }

    public void setSecond(int s) {
        if ((s >= 0 && s < 60)) {
            second = s;
        } else {
            System.err.println("the Second is invalid!!! Timer not set");
        }
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@getters
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinuts() {
        return minute;
    }

    public int getSecond() {
        return this.second;
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@otherMethods
    public boolean equals(Time t) {
        if (this.hour == t.hour && this.minute == t.minute && this.second == t.second) {
            return true;
        } else {
            return false;
        }

    }

    public void finalize() {
        System.out.println("the time object with " + this.toString() + " property is distroyed.");
    }


}
