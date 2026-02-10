package entity;

public class Caminhao extends Veiculo{

    //ATRIBUTOS
    private float capCarga;
    private int qtdEixos;

    //GETTERS & SETTERS
    public float getCapCarga() { return capCarga; }
    public void setCapCarga(float capCarga) { this.capCarga = capCarga; }

    public int getQtdEixos() { return qtdEixos; }
    public void setQtdEixos(int qtdEixos) { this.qtdEixos = qtdEixos; }

    //CONSTRUTOR VAZIO
    public Caminhao() { }

    //CONSTRUTOR
    public Caminhao(String placa, String modelo, int anoFabrica, float kmAtual, float capCarga, int qtdEixos) {
        super(placa, modelo, anoFabrica, kmAtual);
        this.capCarga = capCarga;
        this.qtdEixos = qtdEixos;
    }

    //ToSTRING
    @Override
    public String toString() {
        return "Caminhão{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano='" + getAnoFabrica() + '\'' +
                ", km=" + getKmAtual() +
                ", capacidade de carga=" + capCarga + '\'' +
                ", qtd de eixos=" + qtdEixos +
                '}';
    }
}