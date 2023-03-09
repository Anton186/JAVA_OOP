//Заставить работать. (помним про SOLID)


package HW7;

public class Task1 {
    public static void main(String[] args) {
        IInterface obj = new Writer();
        new InnerApp(obj).write();
    }
}

interface IInterface {
    void print();
}

interface IWriter {
    void write();
}

class InnerApp implements IWriter {
    private final IInterface v;

    public InnerApp(IInterface v) {
        this.v = v;
    }

    @Override
    public void write() {
        v.print();
    }
}

class Writer implements IInterface {
    @Override
    public void print() {
        System.out.println("Hello, world!");
    }
}

