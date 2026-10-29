package chainofresponsability;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AprovadorTest {

    @Test
    void deveAprovarPeloSupervisor() {
        Supervisor supervisor = new Supervisor();
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);

        TipoDespesa despesa =
                new DespesaAlimentacao(300, "Almoco");

        assertEquals(
                "Supervisor aprovou",
                supervisor.aprovar(despesa)
        );
    }

    @Test
    void deveAprovarPeloGerente() {
        Supervisor supervisor = new Supervisor();
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);

        TipoDespesa despesa =
                new DespesaTransporte(1200, "Viagem");

        assertEquals(
                "Gerente aprovou",
                supervisor.aprovar(despesa)
        );
    }

    @Test
    void deveAprovarPeloDiretor() {
        Supervisor supervisor = new Supervisor();
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);

        TipoDespesa despesa =
                new DespesaEquipamento(5000, "Notebook");

        assertEquals(
                "Diretor aprovou",
                supervisor.aprovar(despesa)
        );
    }
}