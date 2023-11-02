package org.example;
/* implements the GarmentFactory interface, class is in charge of designing an inventory of professional clothing, comprising top, pants, and shoes.
 provides methods for creating instances of each garment type within the professional category.
 */
public class ProfessionalGarments implements GarmentFactory {
    public top create_top(){
        return new professional_top();
    }
    public pants create_pants(){
        return new professional_pants();
    }
    public shoes create_shoes(){
        return new professional_shoes();
    }
}
