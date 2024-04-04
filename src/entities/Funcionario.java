package entities;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double taxa;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, double salarioBruto, double taxa) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.taxa = taxa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}


	public double getTaxa() {
		return taxa;
	}

	public double obterSalarioLiquido() {
		return salarioBruto -= taxa;
	}
	public void aumentoSalario(double percentege) {
		salarioBruto *= (percentege + 100) / 100; 	
	}

	@Override
	public String toString() {
		return "Funcionario [nome= " 
				+ nome 
				+ String.format(", salário= %.2f", salarioBruto) 
						+ ", taxa= " 
						+ taxa;
	}
	
	
	
	

}
