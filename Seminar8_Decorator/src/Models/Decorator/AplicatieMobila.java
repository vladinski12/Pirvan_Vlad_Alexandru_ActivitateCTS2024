package Models.Decorator;

import Models.Spital.DiagnosticAbstract;

public class AplicatieMobila extends Decorator {
    public AplicatieMobila(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul: "
                + super.getNumeDiagnostic() + " " + super.getSimptome() + " " + super.getNecesitaSpitalizare());
    }
}
