package khodro;

public class Mashin extends Khodro implements SandoghDar, Gearbox {
    //Constructor

    public Mashin(String mark){
        this.mark = mark;
    }

    //dade:

    boolean ayaDarBazAst; //false
    String mark;
    Ranande ranande;

    //method:

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

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
}
