public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int toConvert = kiloBytes;
            int megaBytes = (kiloBytes / 1024);
            int remKiloBytes = (toConvert % 1024);
            System.out.println(toConvert + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");
        }

    }
}
