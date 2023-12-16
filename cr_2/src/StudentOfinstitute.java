import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class StudentOfinstitute {
    private String name;
    private String institute;
    private int rating;

    public StudentOfinstitute(String name, String institute) {
        this.name = name;
        this.institute = institute;
        this.rating = 0;

    }

    public abstract void makeProgramming();
    public abstract void makeElecEngineering();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Name:"+name+","+"rating:"+rating+", институт: "+institute;
    }
}
