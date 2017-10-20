package br.com.abc.javacore.Npolimorfismo.classes;

/**
 * Created by William Suane on 6/1/2016.
 */
public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamento para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: "+gerente.getNome());
//        System.out.println("Salário desse mês: "+gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamento para os vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: "+vendedor.getNome());
//        System.out.println("Salário desse mês: "+vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salário desse mês: "+funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("Participacao nos lucros: "+g.getPnl());
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total vendas: "+((Vendedor) funcionario).getTotalVendas());
        }

    }
}
