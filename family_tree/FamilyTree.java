package family_tree;

import java.util.List;

/**
 * FamilyTree
 */
public interface FamilyTree {

    public List getParents();
    public List getChildren();
    public List getSubParents();
    public List getSubChildren();
}