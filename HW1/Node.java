public class Node {
    Human p1;
    Relationship re;
    Human p2;

    public Node(Human p1, Relationship re, Human p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Осношения [Родитель1 " + p1 + ", Ребёнок " + re + ", Родитель2 " + p2 + "]";
    }
    
}