package demitir;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario {
    
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
        @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + "Motoboy{" + "carteiraDeHabilitacao=" + carteiraDeHabilitacao + '}';
    }
    
    
    
    
}
