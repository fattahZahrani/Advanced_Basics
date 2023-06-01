import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_bayad_harekat_konad_vaghty_dar_baste_ast_va_mashin_roshan_ast() {
        //Given
        Mashin benz = new Mashin("benz");
        Mashin volvo = new Mashin("volvo");
        //When
        boolean ayaHarekatMikonad = benz.ayaMashinDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaMashinDarHaleHarekatAst();
        //Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);


        //Objects
//        Mashin mashin = new Mashin();
//        mashin.bazKardanDar();
//        mashin.basteKardanDar();
//        mashin.harekat();
//
//        System.out.println("Aya dar mashin baz ast? " + mashin.ayaDarMashinBazAst);
//
//        System.out.println("-----------------------------------------------------------");
//
//        Mashin pride = new Mashin("pride");
//        pride.roshan();
//        pride.bazKardanDar();
//        pride.harekat();
    }

    class Mashin{

        //Constructor
        Mashin() {
            out.println("Yek mashin bedone dade sakhted shod.");
        }

        Mashin(String mark){
            this.mark = mark;
            out.println("Yek mashin " + this.mark + " sakhte shod.");
        }

        //dade:

        boolean ayaMashinRoshanAst; //false
        boolean ayaDarMashinBazAst; //false
        String mark;

        //method:

        void roshan(){
            out.println("Mashin roshan ast.");
            ayaMashinRoshanAst = true;
        }
        void khamoush(){
            out.println("Mashin khamoush ast.");
            ayaMashinRoshanAst = false;
        }
        void bazKardanDar(){
            out.println("Dar baz shod.");
            ayaDarMashinBazAst = true;
        }
        void basteKardanDar(){
            out.println("Dar baste shod.");
            ayaDarMashinBazAst = false;
        }
        boolean ayaMashinDarHaleHarekatAst(){  //dar baste bashad va mashin roshan bashad (rule)
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                out.println("Mashin dar hale harekat ast.");
                return true;
            } else{
                out.println("Mashin park ast.");
                return false;
            }
        }
    }
}
