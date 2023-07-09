package foroushande;

import khodro.jadid.Mashin;

public class Foroushande {
    public static String [] nameForoushandegan = new String[10];
    static {
        nameForoushandegan[0] = "Ali";
        nameForoushandegan[1] = "Ahmad";
    }
    public void foroushMashin() {
        Mashin.tedadeForoush++;

        //Mashin mashin = new Mashin();    //Ba static kardan tedadeForoush digar niyazi be dorost kardan object Mashin nadarim.
        //System.out.println("Object ke dar class foroushande vojood darad: " + mashin);

    }
}
