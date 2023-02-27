import java.util.ArrayList;

public class Family {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    // связь родитель - ребенок
    public void appendPerentChild(Human PARENT, Human CHILDREN) {
        tree.add(new Node(PARENT, Relationship.PARENT, CHILDREN));
        tree.add(new Node(CHILDREN, Relationship.CHILDREN, PARENT));
    }

    // связь муж - жена
    public void appendWifeHusband(Human WIFE, Human HUSBAND) {
        tree.add(new Node(WIFE, Relationship.WIFE, HUSBAND));
        tree.add(new Node(HUSBAND, Relationship.HUSBAND, WIFE));
    }
}
