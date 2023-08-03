package Class3;

import java.sql.SQLOutput;

public class T2TemperatureCheck {
    public static void main(String[] args) {
        double temperature=32;
        if(temperature >31){
            System.out.println("Water will Not freeze if temperature " +temperature);

        }else {
            System.out.println("Water will freeze with temperature " +temperature);
        }
        double temperature1=25;
        if(temperature1<32){ //25<32= true
            System.out.println("Water will freeze with temperature "+temperature1);
        }else {
            System.out.println("Water will Not freeze with temperature "+temperature1);
        }
    }
}
