package entity;

public class Moto extends Veiculo{

    //ATRIBUTOS
    private int cilindradas;

    //GETTERS & SETTERS
    public int getCilindradas() { return this.cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

    //CONSTRUTOR VAZIO
    public Moto() {}

    //CONSTRUTOR
    public Moto(String placa, String modelo, int anoFabrica, float kmAtual, int cilindradas) {
        super(placa, modelo, anoFabrica, kmAtual);
        this.cilindradas = cilindradas;
    }

    //ToSTRING
    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano='" + getAnoFabrica() + '\'' +
                ", km=" + getKmAtual() +
                ", cilindradas=" + cilindradas +
                '}';
    }
}