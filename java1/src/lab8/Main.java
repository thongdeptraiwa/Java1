/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author macos
 */
public class Main {

    public static void main(String[] args) {
        XPoly n = new XPoly();

        double[] x = {2, 3, 4};
        System.out.println(n.sum(x));
        System.out.println(n.min(x));
        System.out.println(n.max(x));
        System.out.println(n.toUpperFirstChar("nguyen   thien thong"));
    }
}
