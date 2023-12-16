import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<StudentOfinstitute> studentOfinstitutes=new ArrayList<StudentOfinstitute>();
        System.out.println("Рузультаты лабораторных:");
        for (int i = 0; i < 20; i++) {
            StudentIVMIIT studentIVMIIT=new StudentIVMIIT(RandomNameGenerator.generateRandomName());
            StudentItis studentItis=new StudentItis(RandomNameGenerator.generateRandomName());
            studentOfinstitutes.add(studentIVMIIT);
            studentOfinstitutes.add(studentItis);
        }

        for (int i = 0; i < studentOfinstitutes.size(); i++) {
            studentOfinstitutes.get(i).makeProgramming();
            studentOfinstitutes.get(i).makeElecEngineering();
            studentOfinstitutes.get(i).makeProgramming();
            System.out.println(studentOfinstitutes.get(i));
        }
        RandomMac randomMac=new RandomMac();
        //" Студенты получившие макбук");
        randomMac.distributeMacbooks(studentOfinstitutes);

    }


}
