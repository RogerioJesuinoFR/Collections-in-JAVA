package ex3;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String nomeTurma;
	private List<ALuno> alunos;
	
	public Turma(String nomeTurma, List<ALuno> alunos) {
		this.nomeTurma = nomeTurma;
		this.alunos = new ArrayList<>(alunos);
	}
	
	public void adicionarAluno(ALuno aluno) {
		alunos.add(aluno);
	}
	
	public boolean verificaAluno(String RA) {
		for (ALuno aluno : alunos) {
			if(aluno.getRA().equals(RA)) {
				return true;
			}
		}
		return false;
	}
	
	public void calcularMedia() {
        for (ALuno aluno : alunos) {
            List<Double> notas = aluno.getNotas();
            double somaNotas = 0;
            for (Double nota : notas) {
            	somaNotas += nota;
            }
            double mediaAluno = somaNotas / notas.size();
            String situacao = mediaAluno >= 6.0 ? "Aprovado" : "Reprovado";
            System.out.printf("Aluno: %s | Media: %.2f | Situacao: %s%n", aluno.getNomeAluno(), mediaAluno, situacao);
        }
    }

	public double calcularMediaTurma() {
        double somaMedias = 0;
        for (ALuno aluno : alunos) {
            List<Double> notas = aluno.getNotas();
            double somaNotas = 0;
            for (Double nota : notas) {
                somaNotas += nota;
            }
            double mediaAluno = somaNotas / notas.size();
            somaMedias += mediaAluno;
        }
        return somaMedias / alunos.size();
    }
    
    public String getNomeTurma() {
    	return nomeTurma;
    }
    
}
