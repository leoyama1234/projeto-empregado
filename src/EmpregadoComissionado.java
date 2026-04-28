public class EmpregadoComissionado extends Empregado{
    double totalVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome,double totalVendas, double comissao) {
        super(matricula, nome );
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){
        return totalVendas * comissao / 100;
    }

    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "comissao=" + comissao +
                ", totalVendas=" + totalVendas +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
