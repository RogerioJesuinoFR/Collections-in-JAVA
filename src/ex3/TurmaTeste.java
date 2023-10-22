package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays; // Adicione esta importação

public class TurmaTeste {
    public static void main(String[] args) {
    	
        List<ALuno> alunos = new ArrayList<>();
        alunos.add(new ALuno("RA1", "Aluno 1", Arrays.asList(8.0, 9.0, 7.5, 9.5)));
        alunos.add(new ALuno("RA2", "Aluno 2", Arrays.asList(7.0, 6.5, 8.0, 6.0)));
        alunos.add(new ALuno("RA3", "Aluno 3", Arrays.asList(9.5, 9.0, 8.5, 10.0)));
        alunos.add(new ALuno("RA4", "Aluno 4", Arrays.asList(2.4, 3.5, 7.3, 4.1)));
        alunos.add(new ALuno("RA5", "Aluno 5", Arrays.asList(4.2, 1.1, 2.7, 5.6)));
        
        Turma turma = new Turma("Programacao Orientada a Objetos", alunos);
        
        System.out.println("turma: " + turma.getNomeTurma());
        
        turma.calcularMedia();
        
        double mediaTurma1 = turma.calcularMediaTurma();
        System.out.printf("Media da turma: %.2f\n", mediaTurma1);
        
        System.out.println("\n=================================================\n");
        
        List<ALuno> alunos2 = new ArrayList<>();
        alunos2.add(new ALuno("RA10", "Aluno A", Arrays.asList(6.1, 8.6, 9.2, 7.4)));
        alunos2.add(new ALuno("RA11", "Aluno B", Arrays.asList(2.4, 3.5, 4.6, 5.7)));
        alunos2.add(new ALuno("RA12", "Aluno C", Arrays.asList(6.0, 6.0, 6.0, 6.0)));
        alunos2.add(new ALuno("RA13", "Aluno D", Arrays.asList(7.6, 8.9, 3.4, 5.7)));
        alunos2.add(new ALuno("RA14", "Aluno E", Arrays.asList(5.9, 5.9, 5.9, 5.9))); // Corrigir "add" para "add"

        Turma turma2 = new Turma("Orientacao a objetos", alunos2);
        
        System.out.println("turma: " + turma2.getNomeTurma());
        
        turma2.calcularMedia();
        
        double mediaTurma2 = turma2.calcularMediaTurma();
        
        System.out.printf("Media da turma: %.2f\n", mediaTurma2);

    }
}
