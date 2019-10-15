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
		int i = 1;
        for(float f : outputs){
            System.out.println("Result " + i + ": " +f);
			i++;
        }
        
        
    }
    
}
