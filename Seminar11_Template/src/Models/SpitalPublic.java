package Models;

public class SpitalPublic extends Template {
    private String numeSpital;
    private int numarPaturi;

    public SpitalPublic(String numeSpital, int numarPaturi) {
        this.numeSpital = numeSpital;
        this.numarPaturi = numarPaturi;
    }

    @Override
    protected void analizaSanatate(Pacient pacient) {
        pacient.setStareSanatate(pacient.getNume().length() % 5 + 1);
        System.out.println("Pacientul " + pacient.getNume() + " are o stare de sanatate de " + pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitatePaturi() {
        return numarPaturi;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat in spitalul " + numeSpital);
        numarPaturi--;
    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " nu a putut fi internat in spitalul " + numeSpital);
    }
}
