public class Grocery{
public static void main(String[] args){
Grocery obj = new Grocery();
int totalRice1 =obj.rice();
int totalWheat1 =obj.wheat();
int totalOil1 =obj.oil();
int totalBillings = obj.totalBilling(totalRice1,totalWheat1,totalOil1);
obj.discount(totalBillings);
}

public int rice(){
int whiterice = 100;
int brownrice = 150;
int totalRice = whiterice + brownrice;
System.out.println("Total rice cost = "+ totalRice);
return totalRice;
}

public int wheat(){
int whitewheat = 200;
int brownwheat = 250;
int totalWheat = whitewheat + brownwheat;
System.out.println("Total wheat cost = "+ totalWheat);
return totalWheat;
}

public int oil()
{
int sunfloweroil = 300;
int groundnutoil = 350;
int totalOil = sunfloweroil + groundnutoil;
System.out.println("Total oil cost = "+ totalOil);
return totalOil;
}

public int totalBilling(int totalRice1, int totalWheat1, int totalOil1){
int totalBillings = totalRice1 + totalWheat1 + totalOil1;
System.out.println("Total  Billing Price without Discount = "+ totalBillings);
return totalBillings;
}

public void discount(int totalBillings){
int finalPrice = totalBillings - 100;
System.out.println("Final Price with Discount = "+ finalPrice);

}

}

