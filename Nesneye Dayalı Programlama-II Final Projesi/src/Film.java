public class Film {
    private String ad;
    private int sure;
    private String tur;

    public Film(String ad, int sure, String tur) {
        this.ad = ad;
        this.sure = sure;
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public int getSure() {
        return sure;
    }

    public String getTur() {
        return tur;
    }

    public void bilgiGoster() {
        System.out.println("Film Adı: " + ad + ", Süre: " + sure + " dk, Tür: " + tur);
    }
}
