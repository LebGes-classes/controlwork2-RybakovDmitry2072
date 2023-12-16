import java.util.Random;

public class RandomNameGenerator {
    private static final String[] NAMES = {"Александр", "Екатерина", "Иван", "Анна", "Дмитрий", "Мария", "Артем", "Ольга"};

    public static String generateRandomName() {
        Random random = new Random();
        int randomIndex = random.nextInt(NAMES.length);
        return NAMES[randomIndex];
    }
}