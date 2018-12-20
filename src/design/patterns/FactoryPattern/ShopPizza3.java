package design.patterns.FactoryPattern;

/**
 *
 * @author Alejandro
 */
public class ShopPizza3 {

    private Pizza1 pizza;
    
    /**
     * Ahora le damos a PizzaStore una referencia a un SimplePizzaFactory.
    **/
    
    public SimplePizzaFactory factory;
    
    /**
     * PizzaStore consigue que la fábrica pase al constructor.
     * @param factory
     **/
    public ShopPizza3(SimplePizzaFactory factory){
	this.factory = factory;
    }

    
    /**
     *
     * @param type
     * @return Pizza1
     */
    public Pizza1 orderPizza(String type) {  

        //Aqui vamos a llamar a la clase creadora de pizzas.
        
        /** Primero, extraemos el código de creación de objetos 
         * del Método orderPizza. Luego colocamos ese código en 
         * un objeto que solo se va a preocupar sobre cómo crear pizzas. 
         * Si cualquier otro objeto necesita una pizza creada, este es el 
         * objeto al que debe acudir.
         * 
         * El nuevo objeto se puede llamar como SimplePizzaFactory.
         * 
         * El método orderPizza() utiliza la fábrica para crear sus 
         * pizzas simplemente transmitiendo el tipo de pedido. 
         * Observe que hemos reemplazado al nuevo operador con un método 
         * de creación en el objeto de fábrica. 
         * ¡No más ejemplificaciones concretas aquí!
         */
        
        pizza = factory.createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;

    }
    
}
