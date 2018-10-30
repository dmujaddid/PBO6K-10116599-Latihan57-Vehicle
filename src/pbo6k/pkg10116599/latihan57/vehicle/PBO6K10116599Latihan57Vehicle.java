/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan57.vehicle;

/**
 *
 * @author eka
 */
public class PBO6K10116599Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);

        System.out.println("Brand\t\t: " + bicycle.getMyBrand());
        System.out.println("Model\t\t: " + bicycle.getMyModel());
        System.out.println("Jumlah Gear\t: " + bicycle.getMyGearCount());
        System.out.println();

        Skateboard skateboard = new Skateboard();
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Roket");
        skateboard.setMyBoardLength(54.5);

        System.out.println("Brand\t\t: " + skateboard.getMyBrand());
        System.out.println("Model\t\t: " + skateboard.getMyModel());
        System.out.println("Panjangnya Board: " + skateboard.getMyBoardLength());

    }

}
