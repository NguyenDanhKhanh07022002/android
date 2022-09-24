/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class maytinhvinacal implements maytinhbotuiinterface {

    @Override
    public double cong(double a, double b) {
        return a + b ; 
    }

    @Override
    public double tru(double a, double b) {
        return a - b ; 
    }

    @Override
    public double nhan(double a, double b) {
        return a * b ; 
    }

    @Override
    public double chia(double a, double b) {
        return a / b ; 
    }
    
}
