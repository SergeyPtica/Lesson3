/**
 * Created by Serg on 16.03.2017.
 */
class NJTax extends Tax{
    double adjustForStudents (double stateTax){
        double adjustedTax = stateTax - 500;
        return adjustedTax;
    }
}