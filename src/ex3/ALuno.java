package ex3;

import java.util.ArrayList;
import java.util.List;

public class ALuno {

	private String RA;
	private String nomeAluno;
	private List <Double> notas;
	
	public ALuno(String RA, String nomeAluno, List<Double> notas) {
		this.RA = RA;
		this.nomeAluno = nomeAluno;
		this.notas = new ArrayList<>(notas);
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}

	public String getRA() {
		return RA;
	}

	public List<Double> getNotas(){
		return notas;
	}
}
