public class Main {
    public static void main(String[] args) {

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0 )
        {
            System.out.println("Invalid Value");
        }else{
            int megabytes = kiloBytes / 1024;
            int reminder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + reminder + " KB");
        }
    }
}
