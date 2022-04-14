package base;

import javax.xml.namespace.QName;

public class Plants {
    boolean needsWater;
    String plantFamily;
    String name;

    public Plants(boolean needsWater, String plantFamily, String name) {
        this.needsWater = needsWater;
        this.plantFamily = plantFamily;
        this.name = name;
    }
    public void wateringInstruction(){
        System.out.println("give water");
    }
    public void sunlightRequirements(){

    }
}
