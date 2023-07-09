import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void Bayad_Mohasebat_Riazi_Anjam_Dehad() {
        double moteghayer = -1.5;
        double meghdarMotlagh = Math.abs(moteghayer);
        System.out.println(meghdarMotlagh);
        Assertions.assertEquals(1.5, meghdarMotlagh);
        Assertions.assertEquals(1, Math.cos(0));
    }
}
