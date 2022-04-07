package beasiswa;

public class BeasiswaPelajar extends BaseBeasiswa {
    public BeasiswaPelajar(String name) {
        super(name);
        this.addRating(new Rating("Struktur dan Konten Esai", 0.5));
        this.addRating(new Rating("Teknik Visualisasi ", 0.2));
        this.addRating(new Rating("Kemampuan Design Thinking ", 0.3));
    }
}
