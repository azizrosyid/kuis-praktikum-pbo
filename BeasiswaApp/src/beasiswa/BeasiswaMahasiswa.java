package beasiswa;

public class BeasiswaMahasiswa extends BaseBeasiswa {
    public BeasiswaMahasiswa(String name) {
        super(name);
        this.addRating(new Rating("Struktur dan Konten Jurnal", 0.6));
        this.addRating(new Rating("Relevansi Data ", 0.25));
        this.addRating(new Rating("Kemampuan Problem Solving ", 0.15));
    }
}
