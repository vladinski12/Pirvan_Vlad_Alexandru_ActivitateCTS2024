package Models.Spital;

public class Diagnostic implements DiagnosticAbstract {
    private String numeDiagnostic;
    private String simptome;
    private Boolean necesitaSpitalizare;

    public Diagnostic(String numeDiagnostic, String simptome, Boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }

    public String getSimptome() {
        return simptome;
    }

    public Boolean getNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Nume diagnostic: " + this.numeDiagnostic + ". Simptome: " + this.simptome + (necesitaSpitalizare ? ". Necesita spitalizare" : ". Nu necesita spitalizare"));
    }
}
