
class Demo
{
    public int i;                   //Instatance Variable
    static public int j;            //Class Variable

    static
    {
       System.out.println("Inside Static Block");
       j = 21;
    }


    public Demo()
    {
      System.out.println("Inside Constructor");
      this.i = 11;
      
    }

}

class BlocksX
{
  public static void main(String  A[])
  {
    System.out.println("Inside main");
    Demo dobj1 = new Demo();
    Demo dobj2 = new Demo();
    Demo dobj3 = new Demo();
    
  
  } 
}