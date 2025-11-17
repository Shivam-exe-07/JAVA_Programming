interface A
{
    int no = 11;
    void fun(); 
    default void gun()                          //java 8 version feature added
    {
        System.out.println("Inside gun");
    }
}

class Demo implements A  //Multiple inheritance
{
    public void fun()
    {
        System.out.println("Inside fun");    
    }
}

class InterfaceDemo8
{
    public static void main(String A[]) 
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
    }
}