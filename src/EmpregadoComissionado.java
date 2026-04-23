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
}
