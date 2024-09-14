package exercicioMedicamentosTest;

import br.unibave.exercicioMedicamentos.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    Pessoa p= new Pessoa();
    @BeforeEach
    void inicializar() {
        p.setNome("maria");

    }
    @Test
    void adicionarNomeTest(){

        assertEquals("maria",p.getNome());
    }

}
