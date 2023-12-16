import java.util.Random;

public class StudentItis extends StudentOfinstitute{
    public StudentItis(String name) {
        super(name, "ИТИС");
    }

    @Override
    public void makeElecEngineering() {
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 3;
        setRating(getRating() + randomNumber);
    }

    @Override
    public void makeProgramming() {
        Random random = new Random();
        int randomNumber = random.nextInt(2) + 3;
        setRating(getRating() + randomNumber);
    }
}
