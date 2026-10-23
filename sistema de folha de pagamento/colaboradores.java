import java.util.ArrayList;

public class colaboradores {
    String nome;
    int matricula;
    float salario = 2000;
    float valor_vendas;
    float comissao_percentual;
    int quantidade_peca;
    float valor_peca;

    public static void main(String[] args) {

        ArrayList<principal> todos = new ArrayList<>();
        colaboradores registro = new colaboradores();
        todos.add(registro);
        System.out.println(todos);

    }
}
