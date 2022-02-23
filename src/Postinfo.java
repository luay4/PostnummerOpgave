public class Postinfo {
    private String by;
    private int postnummer;

    public Postinfo(int postnummer, String by) {
        this.by = by;
        this.postnummer = postnummer;
    }

    public String getBy() {
        return by;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    @Override
    public String toString() {
        return "Postinfo{" +
                "by='" + by + '\'' +
                ", postnummer=" + postnummer +
                '}';
    }
}
