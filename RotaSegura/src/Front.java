import entity.Caminhao;
import entity.Moto;

import java.util.Scanner;

public class Front {

    Scanner scan = new Scanner(System.in);

    // MENU DE INICIO ==================================================================================================

    public int menuPrincial(){
        System.out.println("""
                ================= Rota Segura System =================
                                [1] Cadastrar Veiculo
                                [2] Definir Rota
                                [3] Sair
                                Escolha uma opção:
                """);
        return scan.nextInt();
    }

    // CADASTRO DE VEICULO: TIPO =======================================================================================

    public int escolherTipo() {
        System.out.println("""
               Qual o tipo de veiculo?
                    [1] Moto
                    [2] Caminhão
                    [3] Cancelar Cadastro
               """);
        return scan.nextInt();
    }

    // COLETA DE DADOS BASICOS =========================================================================================
        // Retorna os dados que qualquer veiculo deve coletar

    public String[] cadastroBasico() {;
        System.out.print("Placa: ");
        String placa = scan.nextLine();
        System.out.print("Modelo: ");
        String modelo = scan.nextLine();
        System.out.print("Ano de Fabricação: ");
        String ano = scan.nextLine();
        System.out.print("KM Atual: ");
        String km = scan.nextLine();
        return new String[]{placa, modelo, ano, km};
    }

    // CADASTRO DE VEICULO: MOTO =======================================================================================
        // Dados basicos + os dados de moto

    public Moto cadastroMoto() {
        String[] veiculo = cadastroBasico();
        System.out.println("Cilindradas: ");
        int cilindradas = scan.nextInt();
        return new Moto(veiculo[0], veiculo[1], Integer.parseInt(veiculo[2]),
                Float.parseFloat(veiculo[3]), cilindradas);
    }

    // CADASTRO DE VEICULO: CAMINHÃO ===================================================================================
        // Dados basicos + os dados de moto

    public Caminhao cadastroCaminhao() {
        String[] veiculo = cadastroBasico();
        System.out.println("Capacidade de Carga (ton): ");
        float capCarga = scan.nextFloat();
        System.out.println("Quantidade de eixos: ");
        int qtdEixos = scan.nextInt();
        return new Caminhao(veiculo[0], veiculo[1], Integer.parseInt(veiculo[2]),
                Float.parseFloat(veiculo[3]), capCarga, qtdEixos);
    }
}