import org.junit.jupiter.api.Test;

public class MashinTest {

    class Mashin{

        //dade:

        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;

        //method:

        void roshan(){
            System.out.println("Mashin roshan ast.");
            ayaMashinRoshanAst = true;
        }
        void khamoush(){
            System.out.println("Mashin khamoush ast.");
            ayaMashinRoshanAst = false;
        }
        void bazKardanDar(){
            System.out.println("Dar baz shod.");
            ayaDarMashinBazAst = true;
        }
        void basteKardanDar(){
            System.out.println("Dar baste shod.");
            ayaDarMashinBazAst = false;
        }
        void harekat(){  //dar baste bashad va mashin roshan bashad (rule)
            if(!ayaDarMashinBazAst && ayaMashinRoshanAst){
                System.out.println("Mashin dar hale harekat ast.");
            } else{
                System.out.println("Mashin park ast.");
            }
        }
    }
}
