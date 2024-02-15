public class Numero {
    private int numeroInteiro;
    private double numeroReal;
    private String numeroExtenso;

    public Numero(int numeroInteiro, double numeroReal, String numeroExtenso) {
        this.numeroInteiro = numeroInteiro;
        this.numeroReal = numeroReal;
        this.numeroExtenso = numeroExtenso;
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }

    public void setNumeroInteiro(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    public String getNumeroExtenso() {
        return numeroExtenso;
    }

    public void setNumeroExtenso(String numeroExtenso) {
        this.numeroExtenso = numeroExtenso;
    }

    public void numeros(int n1, int n2){
        this.numeroInteiro = n1 + n2;
        System.out.println("Resultado: " + this.numeroInteiro);
    }
    public void numeros(double n1, double n2){
        this.numeroReal = n1 + n2;
        System.out.println("Resultado: " + this.numeroReal);
    }

    public void numeros(String n1, String n2){
        this.numeroExtenso= n1 + n2;
        System.out.println("Resultado: " + this.numeroExtenso);
    }
}
