
/**
 * @author (Herbert Wenisch)
 * @version (03-07-23)
 */
public class Car {
    private double v; // Geschwindigkeit
    
    Car(){
        v = 30;
    };
    
    public void getFaster(double deltaV){
        if(deltaV > 0) v+=deltaV;
    }
}
