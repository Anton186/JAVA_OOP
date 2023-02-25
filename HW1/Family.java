import java.util.ArrayList;

public class Family {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Human parent, Human children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    // связь муж - жена
    public void appendWifeHusband(Human wife, Human husband) {
        tree.add(new Node(wife, Relationship.wife, husband));
        tree.add(new Node(husband, Relationship.husband, wife));
    }
}
