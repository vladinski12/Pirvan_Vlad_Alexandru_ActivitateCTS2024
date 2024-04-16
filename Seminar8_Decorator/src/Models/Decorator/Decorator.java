package Models.Decorator;

import Models.Spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract {
    protected DiagnosticAbstract diagnostic;

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    public abstract void afiseazaOnline();

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma");
    }

    @Override
    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public Boolean getNecesitaSpitalizare() {
        return diagnostic.getNecesitaSpitalizare();
    }
}
