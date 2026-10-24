import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("1 - cadastrar colaborador padrão");
        System.out.println("2 - cadastrar colaborador comissionado");
        System.out.println("3 - cadastrar colaborador produção");
        System.out.println("4 - gerar folha de pagamento");
        System.out.println("5 - colaboradores cadastrados");
        System.out.println("0 - sair do programa");
        int escolha = valor.nextInt();


        switch (escolha) {
            case 1:
                colaboradores registro = new colaboradores();

                System.out.println("Nome:");
                registro.nome = valor.next();
                System.out.print("Matricula: ");
                registro.matricula = valor.nextInt();
                System.out.println("Colaborador cadastrado com sucesso!");
              
                break;
            case 2:

                registro = new colaboradores();
                System.out.println("Nome:");
                registro.nome = valor.next();
                System.out.print("Matricula: ");
                registro.matricula = valor.nextInt();
                System.out.print("informe o valor das vendas: ");
                registro.valor_vendas = valor.nextFloat();
                System.out.print("informe comissão percentual: ");
                registro.comissao_percentual = valor.nextFloat();
                System.out.print("Colaborador cadastrado com sucesso!");
                
                break;
            case 3:
                registro = new colaboradores();
                System.out.println("nome:");
                registro.nome = valor.next();
                System.out.print("Matricula: ");
                registro.matricula = valor.nextInt();
                System.out.print("informe quantidade peças produzidas: ");
                registro.quantidade_peca = valor.nextInt();
                System.out.print("informe valor da peça: ");
                registro.valor_peca = valor.nextDouble();
                System.out.print("Colaborador cadastrado com sucesso!");
                break;

            case 4:
                System.out.println("folha de pagamento de 1 colaborador: ");

                break;
            case 5:
                System.out.println("folha de pagamento de todos os colaboradores cadastrados");
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        
        }
    }
}
