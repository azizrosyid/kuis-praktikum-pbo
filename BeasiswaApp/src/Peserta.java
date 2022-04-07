import beasiswa.CategoryBeasiswa;

public class Peserta {
    private String name;
    private int age;
    private CategoryBeasiswa beasiswa;

    Peserta(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setBeasiswa(CategoryBeasiswa beasiswa) {
        this.beasiswa = beasiswa;
    }

    public void setAllScore(){
        this.beasiswa.setAllScore();
    }

    private double getTotalScore(){
        return this.beasiswa.getTotalScore();
    }

    public String getResult(){
        StringBuilder result = new StringBuilder();
        if (this.getTotalScore() >= 87.5 ){
            result.append("Nilai Akhir : ").append(this.getTotalScore() ).append("\n");
            result.append("Keterangan : Diterima").append("\n");
            result.append("Selamat! ").append(this.name).append(" (").append(this.age).append(" Tahun) dinyatakan diterima pada program BEASISWA PELAJAR").append("\n");
            result.append("Karena berhasil mencapai nilai yang diharapkan pada tahap seleksi.").append("\n");
        }else {
            result.append("Nilai Akhir : ").append(this.getTotalScore()).append("\n");
            result.append("Keterangan : Tidak Diterima").append("\n");
            result.append("Mohon maaf, ").append(this.name).append(" (").append(this.age).append(" Tahun) dinyatakan tidak diterima pada program BEASISWA PELAJAR").append("\n");
            result.append("Karena belum mencapai nilai yang diharapkan pada tahap seleksi.");
        }
        return result.toString();
    }
}
