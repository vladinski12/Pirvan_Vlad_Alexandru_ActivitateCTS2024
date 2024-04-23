package Models;

public class VerificatorPeluza implements IVerficator {
    @Override
    public void verificaSuporter(String nume) {
        System.out.println("Sunt verificate bagajele si hainele suporterului " + nume + " care este de tip Peluza");
    }
}
