package Models;

public class VerificatorVIP implements IVerficator {
    @Override
    public void verificaSuporter(String nume) {
        System.out.println("Este verificat suporterul " + nume + " care este de tip VIP");
    }
}
