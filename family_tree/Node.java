package family_tree;

/**
 * Node
 */
public abstract class Node {
     private String name;
     private String surname;

    private Node parent;

    private Node child;

    public void getParent(){}

    public void setParent(){}

    public void getChild(){}

    public void setChild(){}

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getNameData(){
        return "Human is " + name + " " + surname;
    }

    
}