public class Node {
    private Human p1;
    private Relationship re;
    private Human p2;

    public Node(Human p1, Relationship re, Human p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Осношения [Родитель1 " + p1 + ", Ребёнок " + re + ", Родитель2 " + p2 + "]";
    }

    public Human getP1() {
        return p1;
    }

    public Relationship getRe() {
        return re;
    }

    public Human getP2() {
        return p2;
    }
    
}