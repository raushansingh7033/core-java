
 public class _00_DataTypes
{
    public static void main(String[] args) 
    {
        int a;//variable declaration
        a=55;//initialization of variable

        System.out.println("a");
        System.out.println(a);
        System.out.println("the value of a is "+a);
        System.out.println("a ki value "+a+" hai");

        int num,num2=56,num3=90,var1=98;

        // System.out.println(num); //error
        System.out.println("num2 = "+num2+" num3="+num3+" var1="+var1);


        //8 data types
        byte b=127;  //1 byte
        short s=120; //2 bytes
        int a=10; //4 bytes
        long l=123456789; //8 bytes
        float pi=3.14f; //4 bytes
        double d=34.674848338; //8 bytes
        char ch='A';   //in java char takes 2 bytes 
        boolean bool=true; //1 bit
        String name="AMan"; //in java String is a class 

        System.out.println("byte b= "+b);
        System.out.println("short s= "+s);
        System.out.println("int a= "+a);
        System.out.println("long l= "+l);
        System.out.println("float pi= "+pi);
        System.out.println("double d= "+d);
        System.out.println("char ch= "+ch);
        System.out.println("boolean bool= "+bool);
        System.out.println("String name= "+name);
    }
}