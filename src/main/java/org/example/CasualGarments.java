package org.example;
/* implements the GarmentFactory interface, class is in charge of designing an inventory of casual clothing, comprising top, pants, and shoes.
 provides methods for creating instances of each garment type within the casual category.
 */
public class CasualGarments implements GarmentFactory{
    public top create_top(){
    return new casual_top();
}
    public pants create_pants(){
        return new casual_pants();
    }
    public shoes create_shoes(){
        return new casual_shoes();
    }
}

