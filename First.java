public class First{
 public static void main(String []args)
 {
  First obj = new First();
  int result = obj.addition();
  obj.discount(result);
}
public int addition()
{
  int first= 10;
  int second= 5;
  int total = first + second;
System.out.println("First value is"+ first);
System.out.println("Second value is"+ second);
System.out.println("The addition output is"+ total);
return total;
}
public void discount(int ans)
{
int finalResult = ans-5;
  System.out.println("pls pay"+ finalResult);
}
}
