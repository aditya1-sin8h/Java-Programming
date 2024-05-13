class Time
{
    int hr,min;
    double sec;
    Time(int h,int m,double s)
    {
        hr=h;
        min=m;
        sec=s;
    }
    void add_time(int m)
    {
        min+=m;
        if(min>=60)
        {
            hr=hr+1;
            min=min-60;
        }
    }
    void add_time(int h,int m)
    {
        hr=hr+h;
        min=min+m;
        if(min>=60)
        {
            hr=hr+1;
            min=min-60;
        }
    }
    void add_time(double s)
    {
        sec=sec+s;
        if(sec>=60)
        {
            min=min+1;
            sec=sec+60;
        }
    }
    Time add_time(Time T1)
    {
        Time T2=new Time(0,0,0);
        T2.hr=T1.hr+hr;
        T2.min=T1.min+min;
        if(T2.min>=60)
        {
            T2.hr=T2.hr+1;
            T2.min=T2.min-60;
        }
        T2.sec=T1.sec+sec;
        if(T2.sec>=60)
        {
            T2.min=T2.min+1;
            T2.sec=T2.sec-60;
        }
        return T2;
    }
    void showdata()
    {
        System.out.println(hr+"  "+min+"  "+sec);
    }

    public static void main(String[] args)
    {
        System.out.println("Time is");
        Time ob1=new Time(4,25,34.5);
        ob1.showdata();
        System.out.println("Time after adding 45 minutes");
        ob1.add_time(45);
        ob1.showdata();
        System.out.println("Time after adding 1 hour 10 minutes");
        ob1.add_time(1,10);
        ob1.showdata();
        System.out.println("Time after adding 2.6 seconds");
        ob1.add_time(2.6);
        ob1.showdata();
        System.out.println("Time after adding 1 hour 10 minutes 5 seconds");
        Time ob2=new Time(1,10,5);
        Time ob3=ob1.add_time(ob2);
        ob3.showdata();
    }
}
