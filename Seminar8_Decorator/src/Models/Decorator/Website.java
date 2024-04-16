package Models.Decorator;

import Models.Spital.DiagnosticAbstract;

public class Website extends Decorator {
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul website-ului ati primit diagnosticul: "
                + super.getNumeDiagnostic() + " " + super.getSimptome() + " " + super.getNecesitaSpitalizare());
    }
}
