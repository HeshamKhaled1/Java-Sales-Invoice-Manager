package sales.invoice.generator;

/**
 *
 * @author Deebo
 */
public class Item {
    private int id;
    private String name;
    private int population;
    private Invoice parent;

    public Item(int id, String name, int population, Invoice parent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.parent = parent;
    }

    public Invoice getParent() {
        return parent;
    }

    public void setParent(Invoice parent) {
        this.parent = parent;
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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", population=" + population + '}';
    }
}
