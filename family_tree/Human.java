package family_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Human
 */
public class Human extends Node implements FamilyTree {
    
    private List<Human> children = new ArrayList<>();
    private List<Human> parents = new ArrayList<>();

    public Human(String first, String man) {
        super();
    }

    public Human(String second, String man, Human node1) {
        super();
    }

    enum Sex {MALE, FEMALE}

    private Sex sex;

    public Human(String name, String surname, Sex sex, Human parent) {
        this.setName(name);
        this.setSurname(surname);
        this.sex = sex;
        if (checkParent(parent)) {
            this.parents.add(parent);
            parent.children.add(this);
        }

    }

    public String getSex() {
        return String.valueOf(this.sex);
    }

    private boolean checkParent(Human human) {
        return human != null;
    }

    @Override
    public List<Human> getParents() {
        return parents;
    }

    @Override
    public List<Human> getChildren() {
        return children;
    }

    @Override
    public List<Human> getSubParents() {
        List<Human> result = new ArrayList<>();
        List<Human> subResult = this.getParents();
        for (Human per : subResult) {
            for (Human subPar : per.getParents()) {
                result.add(subPar);
            }
        }
        return result;
    }

    @Override
    public List<Human> getSubChildren() {
        List<Human> result = new ArrayList<>();
        List<Human> subResult = this.getChildren();
        for (Human per : subResult) {
            for (Human subChil : per.getChildren()) {
                result.add(subChil);
            }
        }
        return result;
    }
    
}