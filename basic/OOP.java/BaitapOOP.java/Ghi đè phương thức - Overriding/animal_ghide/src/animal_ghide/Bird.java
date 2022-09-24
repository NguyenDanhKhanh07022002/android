/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal_ghide;

/**
 *
 * @author Admin
 */
public class Bird extends Animal_ghide{

    public Bird() {
        super("bird");
    }

    @Override
    public void makeSound() {
        System.out.println("liu lo");
    }

    @Override
    public void eat() {
        System.out.println("toi thich an sau bo");
    }
    
}
