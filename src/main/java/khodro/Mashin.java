package khodro;

public class Mashin {
    //Constructor

    public Mashin(String mark){
        this.mark = mark;
    }

    //dade:

    boolean ayaRoshanAst; //false
    boolean ayaDarBazAst; //false
    String mark;
    Ranande ranande;

    //method:

    public void roshan(){
        ayaRoshanAst = true;
    }
    void khamoush(){
        ayaRoshanAst = false;
    }
    void bazKardanDar(){
        ayaDarBazAst = true;
    }
    void basteKardanDar(){
        ayaDarBazAst = false;
    }
    public boolean ayaDarHaleHarekatAst(){  //dar baste bashad va mashin roshan bashad (rule)
        if(!ayaDarBazAst && ayaRoshanAst){
            return true;
        } else{
            return false;
        }
    }
}
