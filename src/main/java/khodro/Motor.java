package khodro;

public class Motor {
    boolean ayaRoshanAst; //false

    public void roshan() {

        ayaRoshanAst = true;
    }
    void khamoush(){
        ayaRoshanAst = false;
    }
        public boolean ayaDarHaleHarekatAst () {
            return ayaRoshanAst;
        }
}
