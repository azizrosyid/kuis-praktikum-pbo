package beasiswa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseBeasiswa implements CategoryBeasiswa {
    private List<Rating> listRating;
    private String name;
    private Scanner scanner = new  Scanner(System.in);

    BaseBeasiswa(String name){
        this.name = name;
        this.listRating = new ArrayList<Rating>();
    }

    public void addRating(Rating rating) {
        listRating.add(rating);
    }

    @Override
    public double getTotalScore() {
        double totalScore = 0;
        for (Rating rating : listRating) {
            totalScore += rating.calculateScore();
        }
        return totalScore;
    }

    @Override
    public void setAllScore() {
        for (Rating rating: listRating){
            double score = this.setScore(rating);
            rating.setScore(score);
        }
    }

    @Override
    public double setScore(Rating rating) {
        double score = 0;
        while (true) {
            try {
                System.out.print("Nilai " + rating.getName() + " : ");
                score = scanner.nextFloat();
                this.checkScore(score);
                break;
            } catch (Exception error) {
                System.out.println("Error : " + error.getMessage());
                scanner.nextLine();
            }
        }
        return score;
    }

    @Override
    public void checkScore(double score) {
        if (score < 0 || score > 100){
            throw new IllegalArgumentException("Score hanya 0 - 100!");
        }
    }
}
