//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*TODO
            @ Registrar ROTA
                -
            @ Regra de negócio
                1) após cadastro não pode alterar placa ou ano de fabriação
                2) quilometragem nunca pode diminuir
                3) quilometragem só pode aumentar usando registrarRota
                4) O sistema alertará automaticamente a revisão do veiculo
                    - Motos: a cada 3.000km
                    - Caminhoes: a cada 10.000km ou se carga total acumular 500t em suas viagens
                5) Prever custo de seguro anual
                    - Motos: fixo 5% do valor do veiculo
                    - Caminhão: 2% do valor do veiculo + R$50 por tonelada de capacidade
                6) Estado do veiculo (disponivel, em rota ou em manutenção)
                    - Em manutenção: Não permitir registrar rota
                    - Ao chegar a quilometragem limite, status deve mudar para EM MANUTANÇÃO ou
                    lançar um alerta
        */
    }
}