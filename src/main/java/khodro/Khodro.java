package khodro;

public abstract class Khodro {
    //Car is a vehicle. (Liskov Substitution Principle)
    protected boolean ayaRoshanAst; //false

    protected void protectedMethod(){
        System.out.println("This is a protected method.");
    }

    public void roshan() {

        ayaRoshanAst = true;
    }
    void khamoush(){
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getMark();
}
