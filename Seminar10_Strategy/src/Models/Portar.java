package Models;

public class Portar {
    private IVerficator verificator;

    public Portar() {
        this.verificator = new VerificatorPeluza();
    }

    public void setVerificator(IVerficator verificator) {
        this.verificator = verificator;
    }

    public void verifica(String nume) {
        verificator.verificaSuporter(nume);
    }
}
