import java.util.ArrayList;
import java.util.Scanner;



public class Reserch implements interfaces{
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Reserch(Family Family) {
        tree = Family.getTree();
    }

    @Override
    public ArrayList<String> spend(Human p, Relationship re) {
        for (Node t : tree) {
            if (t.getP1().getFio() == p.getFio() && t.getRe() == re) {
                result.add(t.getP2().getFio());
            }
        }
        return result;
    }

    @Override
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Node t : tree) {

            if (t.getP1().getAge() <= age && !resultAge.contains(t.getP1().getFio())) {
                resultAge.add(t.getP1().getFio());
            }
        }
        in.close();
        return resultAge;
    }
}