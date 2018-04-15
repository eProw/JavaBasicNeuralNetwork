package redneuronal;

/**
 *
 * @author eProw
 */
public class RedNeuronal {
    public static void main(String[] args) {
        
        int[] neuronLayers = {4,5};
        float[] inputs = {-1,0.5f};
                
        Perceptron p = new Perceptron(neuronLayers,inputs);
        
        float[] outputs = p.Calculate();
        for(float f : outputs){
            System.out.println(f);
        }
        
        
    }
    
}
