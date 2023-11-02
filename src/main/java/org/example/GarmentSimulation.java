package org.example;

public class GarmentSimulation {
    public static void main(String[] args) {
        GarmentFactory PartyGarments = new PartyGarments();

        // created individual garment objects
        top party_top = PartyGarments.create_top();
        pants party_pants= PartyGarments.create_pants();
        shoes party_shoes = PartyGarments.create_shoes();

        // wearing party garments
        party_top.wear();
        party_pants.wear();
        party_shoes.wear();
    }
}
