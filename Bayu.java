import java.text.Format;

public class Bayu {
    public static void main(String[] args) throws Exception {

        String nama ="bayu kartika aji putra";
        int nim =2113010265;

        String pesan = String.format("\nhalo, nama saya %s, dan nim saya %d",nama,nim);

        System.out.println(pesan);
    }
}