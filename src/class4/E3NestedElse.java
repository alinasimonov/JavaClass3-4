package class4;

public class E3NestedElse {
    public static void main(String[] args) {
        double accountBalance=15000;

        if(accountBalance>28000){
            System.out.println("We can afford a normal toyota");
            if(accountBalance>50000){
                System.out.println("We ca afford Luxury cars as well");
            }
        }else {
            System.out.println("We need to save more");
        }
    }
}
