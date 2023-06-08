package khodro;

public class Mashin extends Khodro implements SandoghDar, Gearbox {
    //Constructor

    public Mashin(String mark){

        this.mark = mark;
    }

    //dade:

    boolean ayaDarBazAst; //false
    String mark;
    int gonjayeshSandogh;
    String noeDande;
    Ranande ranande;

    public Mashin(String mark, int gonjayeshSandogh, String noeDande) {
        this.mark = mark;
        this.gonjayeshSandogh = gonjayeshSandogh;
        this.noeDande = noeDande;
    }

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
    public String getMark() {
        return mark;
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
