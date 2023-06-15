import java.text.Format;

public class Tegar {
    public static void main(String[] args) throws Exception {

        String nama ="tegar rafif putra nurhuda";
        int nim =2113010277;

        String pesan = String.format("\nhi guys, saya adalah %s, dan nim saya %d",nama,nim);

        System.out.println(pesan);
    }
}