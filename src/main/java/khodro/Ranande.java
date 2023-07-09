package khodro;
//Outer Class
public class Ranande {
    private String noeGavahiname = "Paye 1"; //Runtime
    private static String nam = "Farhad"; //Compiletime
    //Non-Static Nested Class: Inner Class
    public class Gavahiname{
        public void print(){
            System.out.println("Class non static : ");
            System.out.println(noeGavahiname);
            System.out.println(nam);
        }

    }
    //Static Nested Class
    public static class StaticGavahiname{
        public void print(){
            System.out.println("Class static : ");
            System.out.println(nam);
            //System.out.println(noeGavahiname);  //Nemitavanim az in dar inja ke static hast estefade konim.
        }

    }


}
