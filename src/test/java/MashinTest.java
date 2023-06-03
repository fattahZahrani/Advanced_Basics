import khodro.Khodro;
import khodro.Mashin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_bayad_harekat_konad_vaghty_dar_baste_ast_va_mashin_roshan_ast() {
        Khodro benz = new Mashin("benz");
        Khodro volvo = new Mashin("volvo");

        boolean ayaHarekatMikonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaDarHaleHarekatAst();

        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);


//      ----------------------------------------------------------------------------------------------------
        //Objects
//        mashin.Mashin mashin = new mashin.Mashin();
//        mashin.bazKardanDar();
//        mashin.basteKardanDar();
//        mashin.harekat();
//
//        System.out.println("Aya dar mashin baz ast? " + mashin.ayaDarMashinBazAst);
//
//        System.out.println("-----------------------------------------------------------");
//
//        mashin.Mashin pride = new mashin.Mashin("pride");
//        pride.roshan();
//        pride.bazKardanDar();
//        pride.harekat();
    }
}

