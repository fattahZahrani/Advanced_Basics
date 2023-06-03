import khodro.Khodro;
import khodro.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MotorTest {

    @Test
    void Motor_bayad_harekat_konad_vaghty_roshan_ast() {
        Khodro motor = new Motor();

        motor.roshan();
        boolean ayaHarekatMikonad = motor.ayaDarHaleHarekatAst();

        assertTrue(ayaHarekatMikonad);
    }
}
