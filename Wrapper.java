class Wrapper{
    public static void main(String args[])
    {
        //Autoboxing
        int a=10;
        float b=10.5f;
        char c='A';
        double d= 2.58;

        Integer int_obj = a;
        Float float_obj=b;
        Character ch_obj=c;
        Double d_obj=d;
        
        System.out.println("Objects");
        System.out.println("Integer="+int_obj);
        System.out.println("Float="+float_obj);
        System.out.println("Charecter="+ch_obj);
        System.out.println("Double="+d_obj);

        //unboxing
        int int_val=int_obj;
        float float_val=float_obj;
        char ch_val=ch_obj;
        double d_val= d_obj;
        System.out.println("Values");
        System.out.println("Integer="+int_val);
        System.out.println("Float="+float_val);
        System.out.println("Charecter="+ch_val);
        System.out.println("Double="+d_val);

        //Null values
        int p=0; float f=0;
        Integer int_null=p;
        Float float_null=f;

        int_null=null;
        float_null=null;
        System.out.println("Storing null values");
        System.out.println(int_null);
        System.out.println(float_null);

    }
}
