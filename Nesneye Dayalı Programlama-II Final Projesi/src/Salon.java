import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity {
    private Film film;
    private List<Musteri> musteriler;

    public Salon(int id, String name) {
        super(id, name);
        this.musteriler = new ArrayList<>();
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Film getFilm() {
        return film;
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public List<Musteri> getMusteriler() {
        return musteriler;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Salon ID: " + getId() + ", Adı: " + getName());
        if (film != null) {
            System.out.println("Gösterimdeki Film: " + film.getAd());
        } else {
            System.out.println("Gösterimdeki Film: Yok");
        }
    }
}
