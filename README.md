### **README.md**
```markdown
# Sinema Müşteri Kayıt Sistemi

Bu proje, bir **Sinema Müşteri Kayıt Sistemi** uygulamasıdır. Proje, verileri JSON tabanlı dosyalarda saklar ve Java konsol uygulaması olarak çalışır. Kullanıcılar, müşteri, film ve salon bilgilerini ekleyebilir, güncelleyebilir ve görüntüleyebilir.

---

## Özellikler

1. **Müşteri Yönetimi**
   - Yeni müşteri ekleme
   - Müşterileri JSON dosyasına kaydetme

2. **Film Yönetimi**
   - Yeni film ekleme
   - Filmleri JSON dosyasına kaydetme
   - Film detaylarını görüntüleme

3. **Salon Yönetimi**
   - Salon ekleme
   - Salonlara film atama
   - Salonlardaki müşterileri listeleme

4. **JSON İşlemleri**
   - Veriler `Gson` kütüphanesi ile JSON formatında saklanır.
   - Veriler JSON dosyalarından okunabilir ve düzenlenebilir.

---

## Gereksinimler

- **Java 8** veya daha güncel bir sürüm
- **Gson Kütüphanesi**: JSON işlemleri için kullanılır.
  - Maven kullanıyorsanız, aşağıdaki bağımlılığı `pom.xml` dosyanıza ekleyin:
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.9</version>
    </dependency>
    ```
  - Alternatif olarak, Gson kütüphanesini manuel olarak indirebilirsiniz: [Gson GitHub](https://github.com/google/gson)

---

## Kullanım

1. **Projeyi Klonlayın**
   ```bash
   git clone https://github.com/kullanici-adi/sinema-musteri-kayit-sistemi.git
   cd sinema-musteri-kayit-sistemi
   ```

2. **Gson Kütüphanesini Yükleyin**
   Maven kullanıyorsanız yukarıdaki bağımlılığı `pom.xml` dosyanıza ekleyin ve projeyi yeniden derleyin.

3. **Projeyi Çalıştırın**
   ```bash
   javac Main.java
   java Main
   ```

4. **JSON Dosyaları**
   - `Musteri.json`, `Film.json`, `Salon.json` dosyaları proje dizininde oluşturulacaktır.
   - Bu dosyalarda müşteri, film ve salon bilgileri saklanır.

---

## Konsol Menüsü

- 1: Yeni Müşteri Ekle
- 2: Yeni Film Ekle
- 3: Yeni Salon Ekle
- 4: Filmleri Listele
- 5: Salonlardaki Müşterileri Listele
- 6: Çıkış

---

## Örnek JSON Formatları

### Musteri.json
```json
[
  {
    "id": 1,
    "name": "Ahmet Yılmaz"
  }
]
```

### Film.json
```json
[
  {
    "ad": "Interstellar",
    "sure": 169,
    "tur": "Bilim Kurgu"
  }
]
```

### Salon.json
```json
[
  {
    "id": 1,
    "name": "Salon 1",
    "film": {
      "ad": "Interstellar",
      "sure": 169,
      "tur": "Bilim Kurgu"
    },
    "musteriler": [
      {
        "id": 1,
        "name": "Ahmet Yılmaz"
      }
    ]
  }
]
```
