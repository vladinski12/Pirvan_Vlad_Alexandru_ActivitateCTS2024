package Models;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void seAgraveazaStarea() {
        if (this.stare instanceof Internat) {
            Stare stareNoua = new SubObservatie();
            stareNoua.setStare(this);
            System.out.println("Pacientul " + this.nume + " a fost mutat in subobservatie deoarece starea lui s-a agravat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu poate fi mutat in subobservatie deoarece nu este internat.");
        }
    }

    public void seImbunatatesteStarea() {
        if (this.stare instanceof SubObservatie) {
            Stare stareNoua = new Internat();
            stareNoua.setStare(this);
            System.out.println("Pacientul " + this.nume + " a fost mutat in internat deoarece starea lui s-a imbunatati.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu poate fi mutat in internat deoarece nu este subobservatie.");
        }
    }

    public void vindecare() {
        if (this.stare instanceof Internat) {
            Stare stareNoua = new Externat();
            stareNoua.setStare(this);
            System.out.println("Pacientul " + this.nume + " a fost vindecat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu poate fi vindecat deoarece nu este internat.");
        }
    }
}
