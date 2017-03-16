/**
 * Created by Serg on 14.03.2017.
 */
class Tax {

    double grossIncome;
    String state;
    int dependents;

    public double calcTax() {

        if (grossIncome <= 500000){
            return grossIncome*0.06;

        } else {
            return grossIncome*0.8;
        }
    }
}

