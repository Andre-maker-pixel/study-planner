package br.com.andremarchi.menu;

import java.util.Scanner;

import br.com.andremarchi.service.TempoEstudos;

public class OrganizadorDeEstudos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        TempoEstudos rotina = new TempoEstudos();

        System.out.println("==============================");
        System.out.println("     PLANEJADOR DE ESTUDOS    ");
        System.out.println("==============================");

        System.out.print("Modelo de estudo: ");
        rotina.modeloEstudo = entrada.nextLine();

        System.out.print("Hora de início dos estudos: ");
        rotina.horaInicio = entrada.nextFloat();

        System.out.print("Hora de término dos estudos: ");
        rotina.horaFim = entrada.nextFloat();

        while (rotina.horaFim <= rotina.horaInicio) {
            System.out.println("A hora de término deve ser maior que a hora de início.");
            System.out.print("Digite novamente a hora de término: ");
            rotina.horaFim = entrada.nextFloat();
        }

        System.out.print("Quantidade de pausas: ");
        rotina.quantidadePausas = entrada.nextInt();

        System.out.print("Minutos de cada pausa: ");
        rotina.minutosPausa = entrada.nextInt();

        System.out.print("Quantas disciplinas você vai estudar? ");
        rotina.quantidadeDisciplinas = entrada.nextInt();
        entrada.nextLine();

        rotina.disciplinas = new String[rotina.quantidadeDisciplinas];

        for (int i = 0; i < rotina.quantidadeDisciplinas; i++) {
            System.out.print("Digite a disciplina " + (i + 1) + ": ");
            rotina.disciplinas[i] = entrada.nextLine();
        }

        System.out.println("========== SUA ROTINA ==========");
        rotina.mostrarResumo();

        entrada.close();
    }
}
