package br.com.andremarchi.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempoEstudosTest {

    private TempoEstudos rotina;

    @BeforeEach
    void setUp() {
        rotina = new TempoEstudos();
        rotina.modeloEstudo = "Pomodoro";
        rotina.horaInicio = 8.0f;
        rotina.horaFim = 12.0f;
        rotina.quantidadePausas = 2;
        rotina.minutosPausa = 15;
        rotina.quantidadeDisciplinas = 2;
        rotina.disciplinas = new String[]{"Matemática", "Português"};
    }

    @Test
    void deveCalcularTempoRealDeEstudoCorretamente() {
        float horasTotais = rotina.horaFim - rotina.horaInicio;       
        float minutosTotais = horasTotais * 60;
        int tempoTotalPausas = rotina.quantidadePausas * rotina.minutosPausa; 
        float minutosEstudo = minutosTotais - tempoTotalPausas;       

        assertEquals(240f, minutosTotais, 0.01f);
        assertEquals(30,   tempoTotalPausas);
        assertEquals(210f, minutosEstudo, 0.01f);
    }

    @Test
    void horaFimMenorQueHoraInicioDeveResultarEmTempoNegativo() {
        rotina.horaFim = 7.0f; 
        float minutosTotais = (rotina.horaFim - rotina.horaInicio) * 60;

        assertTrue(minutosTotais < 0,
            "Tempo total deve ser negativo quando horaFim < horaInicio");
    }

    @Test
    void semPausasTempoEstudoDeveSerIgualAoTempoTotal() {
        rotina.quantidadePausas = 0;
        rotina.minutosPausa = 0;

        float minutosTotais = (rotina.horaFim - rotina.horaInicio) * 60;
        int tempoTotalPausas = rotina.quantidadePausas * rotina.minutosPausa;
        float minutosEstudo = minutosTotais - tempoTotalPausas;

        assertEquals(minutosTotais, minutosEstudo, 0.01f,
            "Sem pausas, o tempo de estudo deve ser igual ao tempo total");
    }

    @Test
    void deveDistribuirTempoPorDisciplinaCorretamente() {
        float minutosTotais = (rotina.horaFim - rotina.horaInicio) * 60;
        int tempoTotalPausas = rotina.quantidadePausas * rotina.minutosPausa;
        float minutosEstudo = minutosTotais - tempoTotalPausas;
        float tempoPorDisciplina = minutosEstudo / rotina.quantidadeDisciplinas;

        assertEquals(105f, tempoPorDisciplina, 0.01f);
    }

    @Test
    void deveArmazenarDisciplinasCorretamente() {
        assertEquals(2, rotina.disciplinas.length);
        assertEquals("Matemática", rotina.disciplinas[0]);
        assertEquals("Português", rotina.disciplinas[1]);
    }
}
