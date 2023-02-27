import java.util.ArrayList;
import java.util.Scanner;

// Попробуйте сделать интерфейс для любого из сервисных классов - например, Research.
//  Абстрактный класс подоразумевает сокрытие не только методов, но и полей , 
//  и реализации в некой базовой реализации. Попробуйте выделить
//   это в своих классах, не обязательно использовать абстрактный класс дважды потом.

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
            if (t.p1.fio == p.fio && t.re == re) {
                result.add(t.p2.fio);
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

            if (t.p1.age <= age && !resultAge.contains(t.p1.fio)) {
                resultAge.add(t.p1.fio);
            }
        }
        in.close();
        return resultAge;
    }
}