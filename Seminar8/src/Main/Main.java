package Main;

import Models.Decorator.AplicatieMobila;
import Models.Decorator.Decorator;
import Models.Decorator.Website;
import Models.Spital.Diagnostic;
import Models.Spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic = new Diagnostic("raceala", "tuse, nas infundat", false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();

        Decorator website = new Website(diagnostic);
        website.afiseazaOnline();
    }
}