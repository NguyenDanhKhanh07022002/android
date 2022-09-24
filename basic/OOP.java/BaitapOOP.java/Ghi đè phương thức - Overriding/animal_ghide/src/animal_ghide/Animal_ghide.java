/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal_ghide;

/**
 *
 * @author Admin
 */
public class Animal_ghide {

    private String name; 

    public Animal_ghide(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void eat(){
        System.out.println("toi dang an .....");
    }
    public void makeSound(){
        System.out.println("..................");
    }
    public void sleep(){
        System.out.println("zzzzzzzzzzzzzzzzzzz");
    }
    public static void main(String[] args) {
        System.out.println("test dog");
        dog d = new dog(); 
        d.eat();
        d.makeSound();
        d.sleep(); 
        
        System.out.println("-----");
        System.out.println("test cat");
        cat c = new cat(); 
        c.eat();
        c.makeSound();
        c.sleep();
        
        System.out.println("-----");
        System.out.println("test bride");
        Bird b = new Bird(); 
        b.eat();
        b.makeSound();
        b.sleep();
    }
}
