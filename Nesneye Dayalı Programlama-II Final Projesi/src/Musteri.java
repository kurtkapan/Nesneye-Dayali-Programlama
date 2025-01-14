public class Musteri extends BaseEntity {
    public Musteri(int id, String name) {
        super(id, name);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri ID: " + getId() + ", Adı: " + getName());
    }
}
