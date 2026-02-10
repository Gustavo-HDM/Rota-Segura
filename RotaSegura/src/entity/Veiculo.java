package entity;

public class Veiculo {

    // ATRIBUTOS
    private String placa;
    private String modelo;
    private int anoFabrica;
    private float kmAtual;

    // GETTERS & SETTERS
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnoFabrica() { return anoFabrica; }
    public void setAnoFabrica(int anoFabrica) { this.anoFabrica = anoFabrica; }

    public float getKmAtual() { return kmAtual; }
    public void setKmAtual(float kmAtual) { this.kmAtual = kmAtual; }

    //CONSTRUTOR VAZIO
    public Veiculo() {}

    //CONSTRUTOR
    public Veiculo(String placa, String modelo, int anoFabrica, float kmAtual) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabrica = anoFabrica;
        this.kmAtual = kmAtual;
    }

    //ToSTRING
    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabrica=" + anoFabrica +
                ", kmAtual=" + kmAtual +
                '}';
    }
}