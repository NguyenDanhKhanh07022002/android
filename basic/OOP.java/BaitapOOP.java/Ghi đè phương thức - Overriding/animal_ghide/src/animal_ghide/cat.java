/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal_ghide;

/**
 *
 * @author Admin
 */
public class cat extends Animal_ghide{

    public cat() {
        super("cat");
    }

    @Override
    public void makeSound() {
        System.out.println("meo meo");
    }

    @Override
    public void eat() {
        System.out.println("toi thich an ca");
    }
    
}
