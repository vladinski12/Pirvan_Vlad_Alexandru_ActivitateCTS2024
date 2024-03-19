package Models;

public class DatabaseConnection {
    private String numeBaza;
    private int nrTabele;

    private String linkConexiune;
    private static DatabaseConnection instance = null;

    private DatabaseConnection(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public static synchronized DatabaseConnection getInstance(String numeBaza, int nrTabele, String linkConexiune) {
        if (instance == null) {
            instance = new DatabaseConnection(numeBaza, nrTabele, linkConexiune);
        }
        return instance;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConexiune='" + linkConexiune + '\'' +
                '}';
    }
}
