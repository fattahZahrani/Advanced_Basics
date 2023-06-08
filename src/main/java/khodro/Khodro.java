package khodro;

public abstract class Khodro {
    //Car is a vehicle. (Liskov Substitution Principle)
    boolean ayaRoshanAst; //false

    public void roshan() {

        ayaRoshanAst = true;
    }
    void khamoush(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getMark();
}
