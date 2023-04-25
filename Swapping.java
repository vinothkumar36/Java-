public class Swapping
{
public static void main(String[] args)
    {
    Swapping obj = new Swapping();
    obj.swap();
    }

public void swap()
    {
    int first = 5;
    int second = 7;
    int temp;
    System.out.println("first value before swapping ="+ first);
    System.out.println("second value befor swapping ="+ second);
    temp = first;
    first = second;
    second = temp;
    System.out.println("first value after swapped ="+ first);
    System.out.println("second value after swapped ="+ second);
    }
}
