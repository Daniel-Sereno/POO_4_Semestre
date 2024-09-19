package exercicioMedicamentos2Test;

import br.unibave.exercicioMedicamentos2.Atendimento;
import br.unibave.exercicioMedicamentos2.Pessoa;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class exercicioMedicamentos2TestTest {
    private Atendimento a = new Atendimento();

    @BeforeEach
    void inicializa(){
      soa("p1", "Sintoma"));
    }


}