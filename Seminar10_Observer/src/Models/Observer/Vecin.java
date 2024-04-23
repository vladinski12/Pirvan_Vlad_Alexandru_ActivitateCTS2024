package Models.Observer;

public class Vecin implements Observer {
    private String nume;
    private int distantaFataDeSala;

    public Vecin(String nume, int distantaFataDeSala) {
        this.nume = nume;
        this.distantaFataDeSala = distantaFataDeSala;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " a primit mesajul: " + mesaj + " si se afla la " + distantaFataDeSala + " metri de sala.");
    }
}
