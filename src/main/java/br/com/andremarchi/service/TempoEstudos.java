package br.com.andremarchi.service;

public class TempoEstudos {

    public String modeloEstudo;
    public float horaInicio;
    public float horaFim;
    public int quantidadePausas;
    public int minutosPausa;
    public int quantidadeDisciplinas;
    public String[] disciplinas;

    public void mostrarResumo() {

        float horasTotais = horaFim - horaInicio;
        float minutosTotais = horasTotais * 60;

        int tempoTotalPausas = quantidadePausas * minutosPausa;

        float minutosEstudo = minutosTotais - tempoTotalPausas;
        float horasEstudo = minutosEstudo / 60;

        float tempoPorDisciplina = minutosEstudo / quantidadeDisciplinas;

        System.out.println("Modelo de estudo: " + modeloEstudo);
        System.out.println("Horário: " + horaInicio + "h até " + horaFim + "h");
        System.out.println("Pausas: " + quantidadePausas + " pausa(s) de " + minutosPausa + " minuto(s)");

        System.out.println("Disciplinas de hoje:");
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println((i + 1) + ". " + disciplinas[i]);
        }

        System.out.printf("Tempo total disponível: %.0f minutos (%.2f horas)%n", minutosTotais, horasTotais);
        System.out.println("Tempo total de pausas: " + tempoTotalPausas + " minutos");
        System.out.printf("Tempo real de estudo: %.0f minutos (%.2f horas)%n", minutosEstudo, horasEstudo);
        System.out.printf("Cada disciplina terá aproximadamente %.0f minutos.%n", tempoPorDisciplina);

        if (horasEstudo >= 4) {
            System.out.println("Parabéns! Você terá um ótimo tempo de estudo.");
        } else {
            System.out.println("Tente aumentar um pouco seu tempo de estudo para render mais.");
        }
    }
}
