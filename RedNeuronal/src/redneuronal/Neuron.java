
package redneuronal;

import java.util.Random;

class Neuron{
    public float[] inputs, weights;
    public float bias;
    public float output;
    
    Random rand;
    
    public Neuron(){
        
    }
    
    public Neuron(float[] inputs){
        this.inputs = inputs;
        this.weights = new float[inputs.length];
        
        rand = new Random();
        
        for(int i = 0; i < weights.length; i++){
            weights[i] = rand.nextFloat()*2-1;
        }
        
        bias = rand.nextFloat()*2-1;
    }
    
    public Neuron(float[] inputs, float[] weights,float bias){
        this.inputs = inputs;
        this.weights = weights;
        this.bias = bias;
    }
    
    public float Calculation(){
        float result = 0;
        
        for(int i = 0; i < inputs.length;i++){
            result += inputs[i]*weights[i];
        }
        
        float output = activation(result+bias);       
        this.output = output;

        return output;
    }
    
    float activation(float x){
        //return(x>=0?1:-1);
        return(1/(1+(float)(Math.pow(Math.E,-x))));
    }
}

