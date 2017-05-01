package movie;


public class Movie {
    private int sumOfrate = 0;
    private int countOfRate = 0;

    public Integer averageRating() {
        return countOfRate == 0 ? 0 :sumOfrate / countOfRate;
    }

    public void rate(int rate) {
        this.sumOfrate += rate;
        this.countOfRate++;
    }
}


