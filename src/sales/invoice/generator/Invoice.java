package sales.invoice.generator;

import java.util.ArrayList;

/**
 *
 * @author Deebo
 */
public class Invoice {
    private int id;
    private String name;
    private ArrayList<Item> children;
    
    public Invoice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getPopulation() {
        int popluation = 0;
        for (Item c : getChildren()) {
            popluation += c.getPopulation();
        }
        
        return popluation;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getChildren() {
        // lazy intialization
        if (children == null) {
            children = new ArrayList<>();
        }
        return children;
    }

    public void setChildren(ArrayList<Item> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Continent{" + "id=" + id + ", name=" + name + '}';
    }
}
