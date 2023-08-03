package class4;

public class T1 {
    public static void main(String[] args) {
        boolean degree=true;
        double score=3.5;


        if(degree == true){
            System.out.println("Congratulations!");
            if(score>=3.5){
                System.out.println("You are eligible for scholarship");
            }else if(score<3.5){
                System.out.println("You should have studied harder");
            }else{
                System.out.println("You should get a degree.");
            }

        }




    }
}
