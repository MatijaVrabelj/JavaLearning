public class Main {
    public static void main(String[] args) {
        //shouldWakeUp(true, 5);
        System.out.println("Should wake up: " + shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
        if (hoursOfDay < 0 || hoursOfDay > 23) {
            return false;
        }
        if (barking && (hoursOfDay < 8 || hoursOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}
