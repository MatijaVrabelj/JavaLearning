public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        double x = Math.round(number1 * 1000);
        x /=1000;

        double y = Math.round(number2 * 1000);
        y /=1000;

        if(x == y)
        {
            return true;
        }else{
            return false;
        }
    }
}
