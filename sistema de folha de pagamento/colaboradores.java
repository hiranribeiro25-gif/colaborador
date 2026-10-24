import java.util.ArrayList;

public class colaboradores {
    String nome;
    int matricula;
    double salario = 2000;
    double valor_vendas;
    double comissao_percentual;
    int quantidade_peca;
    double valor_peca;

    public static void main(String[] args) {

        ArrayList<colaboradores> todos = new ArrayList<>();
        colaboradores registro = new colaboradores();
        todos.add(registro);
        System.out.println(registro.salario);

    }
}
