package khodro.jadid;

import khodro.Gearbox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandoghDar;

public class Mashin extends Khodro implements SandoghDar, Gearbox {
    public static int tedadeForoush;
    //Constructor
    public Mashin(){

    }

    public Mashin(String mark){

        this.mark = mark;
    }

    //dade:

    private boolean ayaDarBazAst; //false
    private String mark;
    private int gonjayeshSandogh;
    private String noeDande;
    private Ranande ranande;

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
    public boolean ayaDarHaleHarekatAst(){//dar baste bashad va mashin roshan bashad (rule)
        protectedMethod();
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
