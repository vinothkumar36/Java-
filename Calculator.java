public class Calculator 
{
public static void main (String args[])
{
Calculator casio = new Calculator();
casio.add(5,5);
casio.add(10,15);
casio.add(25,50);
casio.sub(20,15);
casio.shutdown();
}
public void add(int first, int second)
{ 
int total = first + second;
System.out.println("sum of two numbers" + total);
}
public void shutdown()
{ 
System.out.println("shutdown");
}
public void sub(int first, int second)
{ 
int sum = first - second;
System.out.println("sub answer = "+ sum);
}
}
