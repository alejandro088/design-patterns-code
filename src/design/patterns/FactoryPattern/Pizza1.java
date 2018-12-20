package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public abstract class Pizza1 {

    public void prepare() {
        System.out.println("Preparando la pizza...");
    }

    public void bake() {
        System.out.println("Horneando la pizza...");
    }

    public void cut() {
        System.out.println("Cortando la pizza en porciones...");
    }

    public void box() {
        System.out.println("Embalando la pizza...");
    }
    
}
