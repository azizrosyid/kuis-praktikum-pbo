package beasiswa;

import java.util.List;

public interface CategoryBeasiswa {
    String name = null;
    List<Rating> listRating = null;

    public void addRating(Rating rating);
    public double getTotalScore();
    public void setAllScore();
    public double setScore(Rating rating);
    public void checkScore(double score);
}
