import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// Используйте предыдущие задачи из прошлого домашнего задания.
//  Необходимо гарантированно продумать иерархию компонент и взаимодействия их между собой.
// Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
// конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”




public class Main{
    public static void main(String[] args) {
        Human oleg = new Human("Грозный Олег Дмитриевич", "Мужской", 44);
        Human irina = new Human("Грозная Ирина Васильевна", "Женский", 42);
        Human denis = new Human("Грозный Денис Олегович", "Мужской", 14);
        Human pavel = new Human("Грозный Павел Олегович", "Мужской", 10);
        Human inna = new Human("Грозная Инна Олегович", "Женский", 6);
        Family family = new Family();
        family.appendPerentChild(oleg, denis);
        family.appendPerentChild(irina, denis);
        family.appendPerentChild(irina, pavel);
        family.appendPerentChild(oleg, inna);
        family.appendWifeHusband(irina, oleg);

        System.out.println("Дети Ирины");
        System.out.println(new Reserch(family).spend(irina, Relationship.PARENT));
        // Ищем детей 
        System.out.println("Дети Олега");
        System.out.println(new Reserch(family).spend(oleg, Relationship.PARENT));

        // Ищем мужа Ирины 
        System.out.println("Муж Ирины");
        System.out.println(new Reserch(family).spend(irina, Relationship.WIFE));

        // Ижем людей оперделенного возраста
        System.out.println(new Reserch(family).searchAge());
    }




    


    
}