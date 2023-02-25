// Реализовать, с учетом ооп подхода, приложение Для проведения исследований с генеалогическим древом. 
// Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей
//  и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат,
//   свекровь, сестра и т. д. компонент для проведения исследований дополнительные компоненты, например
//    отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных
//     моделей человека Под “проведением исследования” можно понимать получение всех детей выбранного человека.
//      Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.
//       Какие члены должны быть у каждого из классов (у меня на семинаре студенты пришли к тому,
//        чтобы продумать логику взаимодействия жена разрешает открыть дверцу шкафа мужу, после чего эту дверцу можно открыть)  
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
        System.out.println(new Reserch(family).spend(irina, Relationship.parent));
        // Ищем детей 
        System.out.println("Дети Олега");
        System.out.println(new Reserch(family).spend(oleg, Relationship.parent));

        // Ищем мужа Ирины 
        System.out.println("Муж Ирины");
        System.out.println(new Reserch(family).spend(irina, Relationship.wife));

        // Ижем людей оперделенного возраста
        System.out.println(new Reserch(family).searchAge());
    }
}