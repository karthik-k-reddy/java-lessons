package Section_17;

import java.io.Serializable;

public class Cars implements Serializable {
    private String model;
    private int bhp;
    public Cars(String model, int bhp) {
        this.model = model;
        this.bhp = bhp;
    }
    public String toString(){
        return "Brand:"+this.model+"<---> Bhp:"+this.bhp;
    }
}
