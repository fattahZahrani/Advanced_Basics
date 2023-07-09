import foroushande.Foroushande;
import khodro.jadid.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoushandeMashinTest {

    @Test
    void Bayad_Tedade_Kol_Mashin_Haye_Foroukhte_Shode_Ra_Be_Dast_Avarim() {
        Foroushande ali = new Foroushande();
        Foroushande naser = new Foroushande();

        ali.foroushMashin();
        ali.foroushMashin();
        ali.foroushMashin();
        ali.foroushMashin();
        naser.foroushMashin();

        Assertions.assertEquals(5, Mashin.tedadeForoush);

//        Mashin mashin = new Mashin();
//        System.out.println("Object ke dar Test vojood darad: " + mashin);
        //(Digar chon class tedadeForoush ra static kardim, niyazi be 2 kaht code bala nadarim va mitavanim hazfeashan konim.)
    }
}
