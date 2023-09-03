/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author macos
 */
public class Vuong extends ChuNhat{

    public Vuong() {
    }
    
    public Vuong(double rong) {
        super(rong,rong);
    }

    @Override
    public void xuat() {
        System.out.println("Canh: "+rong);
        System.out.println("Chu vi HV: "+getChuVi());
        System.out.println("Dien Tich HV: "+getDienTich());
    }
   
    
            
   
    
}
