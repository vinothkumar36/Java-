class Loops{
        int a = 2;
        int b = 2;
    public static void main(String[] args){
    Loops obj = new Loops();
    obj.divide();
    obj.sum();
    obj.or();
    obj.notMultiple();
    obj.even();
    }
    public void sum(){
        if((a+b)==(a*b)){
    System.out.println("Given no sum and the product are equal 'LHS = RHS'");
    }

    }
    public void divide(){
        if((a+b)%4==0 && (a*b)%4==0){
         System.out.println("Given no 'sum and the product are /4'");
    }
    }

    public void or(){
        if((a+b)%2 == 0 || (a*b)%3 == 0){
         System.out.println("hi");
    }
    }

    public void notMultiple(){
        if((a+b)%3 != 2 && (a+b)%7 != 2){
         System.out.println("Given no is not Multiple of 3 and 7");
    }
    }

    public void even(){
        if(a%2 == 0){
         System.out.println("Given no is Even");
    }
    }
    }
    
