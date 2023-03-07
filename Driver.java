
/**
 * @author (Herbert Wenisch)
 * @version (03-07-23)
 */
public class Driver{
    private String name;
    private Car myCar;
    
    Driver(String aName){
        name = aName;
        myCar = new Car();
    }
    
    public void accelerate(double deltaV){
        myCar.getFaster(deltaV);
    }
}
