package Models;

public class VerificatorTribuna implements IVerficator {
    @Override
    public void verificaSuporter(String nume) {
        System.out.println("Sunt verificate bagajele suporterului " + nume + " care este de tip Tribuna");
    }
}
