package beasiswa;

public class Rating {
    private String name;
private     double weight;
    private double score;

    Rating(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double calculateScore() {
        return  this.score * this.weight;
    }

    public String getName() {
        return name;
    }
}
