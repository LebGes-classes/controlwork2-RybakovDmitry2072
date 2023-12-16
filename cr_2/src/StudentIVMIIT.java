import java.util.Random;

public class StudentIVMIIT extends StudentOfinstitute {
    public StudentIVMIIT(String name) {
        super(name, "ИВМИИТ");
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
