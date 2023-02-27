public class Human {
    private String fio;
    private String sex;
    private int age;

    public Human(String fio, String sex, int age) {
        this.fio = fio;
        this.age = age;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return String.format("ФИО: %s Пол: %s  Возраст: %d",
                fio, sex, age);
    }


    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    
}