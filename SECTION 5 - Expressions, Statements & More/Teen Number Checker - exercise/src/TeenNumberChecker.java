public class TeenNumberChecker {
    public static boolean hasTeen(int parametar1, int parametar2, int parametar3) {
        if (isTeen(parametar1) || isTeen(parametar2) || isTeen(parametar3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int parametar4) {
        return (parametar4 >= 13 && parametar4 <= 19);
    }
}
