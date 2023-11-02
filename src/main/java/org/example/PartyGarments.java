package org.example;
/* implements the GarmentFactory interface, class is in charge of designing an inventory of party clothing, comprising top, pants, and shoes.
 provides methods for creating instances of each garment type within the party category.
 */
public class PartyGarments implements GarmentFactory{
    public top create_top(){
        return new party_top();
    }
    public pants create_pants(){
        return new party_pants();
    }
    public shoes create_shoes(){
        return new party_shoes();
    }
}

