/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding2;

/**
 *
 * @author Dell 5300
 */

public class Main2 {
    public static void main(String[] args) {
        Lingkaran2 l = new Lingkaran2();
        l.hitungLuas(14);
        l.hitungKeliling(14);
        l.tampilData();

        System.out.println("--------------------");

        SegitigaSamaKaki2 sg = new SegitigaSamaKaki2();
        sg.hitungLuas(8, 3);
        sg.hitungKeliling(8, 3);
        sg.tampilData();

        System.out.println("--------------------");

        SegiEmpat2 se = new SegiEmpat2();
        se.hitungLuas(5, 8);
        se.hitungKeliling(5, 8);
        se.hitungDiagonal(5, 8);
        se.tampilData();
    }
}
