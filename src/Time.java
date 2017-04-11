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
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int h, int m, int s) {
        //System.out.println("the constructors is called.");
        this.setTime(h, m, s);
    }

    //clone
    public Time(Time t) {
        this.hour = t.hour;
        this.minute = t.minute;
        this.second = t.second;
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@setters
    public void setTime(int h, int m, int s) {
        if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60)) {
            this.hour = h;
            this.minute = m;
            this.second = s;
        } else {
            System.err.println("the time is invalid!!! Timer not set");
        }

    }

    public void setHour(int h) {
        setTime(h, this.minute, this.second);
    }

    public void setMinute(int m) {
        setTime(this.hour, m, this.second);
    }

    public void setSecond(int s) {
        setTime(this.hour, this.minute, s);
    }

    //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@getters
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinuts() {
        return this.minute;
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
