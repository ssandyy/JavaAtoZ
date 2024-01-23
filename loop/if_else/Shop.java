package loop.if_else;
class Shop {
    
    public static void main(String[] args) {
        int quantity;
        float totalCost;
        float cost = 100;
        float price;
        float discount;
        System.out.println("Enter the Quantity : ");
        quantity = new java.util.Scanner(System.in).nextInt();
        totalCost=cost*quantity;

        if (quantity>=10){
            discount = (totalCost*10)/100;
            price=totalCost - discount;
            System.out.println("congratulation you have got 10% discount you have to pay "+price+ "instead of "+totalCost);
        }else{
            System.out.println("your total amount is "+totalCost);
        }




    }
}
