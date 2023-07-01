package family_tree;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Human node1 = new Human("First","Man");
        // Human node2 = new Human("Second","Man", node1);
        // Human node3 = new Human("Third","Man", node2);
        // Human node4 = new Human("Fourth","Man", node2);
       Human per1 = new Human("N1", "S1", Human.Sex.MALE, null);
       Human per2 = new Human("N2", "S2", Human.Sex.MALE, per1);
       Human per3 = new Human("N3", "S3", Human.Sex.FEMALE, per2);
       Human per4 = new Human("N4", "S4", Human.Sex.MALE, per3);
       Human per5 = new Human("N5", "S5", Human.Sex.FEMALE, per3);
       Human per6 = new Human("N6", "S6", Human.Sex.FEMALE, per5);


        // PathFamilyTree visitor = new PathFamilyTree("Man","Second");
        // Walker walker = new Walker(visitor);
        // walker.walk(node3);
        // List<Human> result = (List<Human>) walker.getResult();
        // System.out.println(walker.getResult());
        System.out.println("Parent('s): ");
        for (Human person : per3.getParents()) {
            System.out.println(person.getNameData());
        }
        // System.out.println("Перечень людей: " + Person.getPersons());
        System.out.println("Children are: ");
        for (Human person : per3.getChildren()) {
            System.out.println(person.getNameData());
        }
        // System.out.println("Дети человека 1: " + node1.getChildren());
        // System.out.println("Дети человека 2: " + node2.getChildren());
        // System.out.println("Дети человека 3: " + node3.getChildren());
        System.out.println("Subparents are: ");
        for (Human person : per3.getSubParents()) {
            System.out.println(person.getNameData());
        }
        // System.out.println();

        // System.out.println("Родители человека 1: " + node1.getParent());
        // System.out.println("Родители человека 2: " + node2.getParent());
        // System.out.println("Родители человека 3: " + node3.getParent());
        // System.out.println("Родители человека 4: " + node4.getParent());
        System.out.println("Subchildren are: ");
        for (Human person : per3.getSubChildren()) {
            System.out.println(person.getNameData());
        }
    }
    }        