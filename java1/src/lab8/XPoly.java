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
public class XPoly {
    public static final double sum(double ... x){
        double sum = 0;
        for(double i : x){
            sum += i;
        }
        return sum;
    }
    public static final double min(double ... x){
        double min = x[0];
        for(double i : x){
            min = Math.min(min, i);
        }
        return min;
    }
    public static final double max(double ... x){
        double max = x[0];
        for(double i : x){
            max = Math.max(max, i);
        }
        return max;
    }
    public static final String toUpperFirstChar(String name){
        String[] arrName = name.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<arrName.length ; i++){
            String item = arrName[i];
            if(!item.equals("")){
                String fist = item.substring(0, 1).toUpperCase();
                item = fist + item.substring(1).toLowerCase();
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
        
    }
    
    public XPoly() {
    }
    
}
