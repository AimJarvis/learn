/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author Umesh
 */
//if a base class and derieved class has data member with same name then the data member of base class is hidden.
// so inorder to use it super keyword is used. eg- super.value
// Constructors in the base class are never inherited, regardless of their attributes. 
//super(“Dog”);                                    // Call the base constructor
//The use of the super keyword here as the method name calls the constructor in the superclass—the direct base class of the class Dog, which is the class Animal. 
//
//Generally, the ability to appear in many forms. In object-oriented programming, polymorphism refers to a programming language's ability to process objects differently depending on their data type or class.
//More specifically, it is the ability to redefine methods for derived classes.
//Static binding in Java occurs during Compile time while Dynamic binding occurs during Runtime.
//2) private, final and static methods and variables uses static binding and bonded by compiler while virtual methods are bonded during runtime based upon runtime object.
//Method overriding is one of the way by which java achieve Run Time Polymorphism.
// We can have two ore more static methods with same name, but differences in input parameters.
//We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same)
//If a derived class defines a static method with same signature as a static method in base class, the method in the derived class hides the method in the base class. 
//	// As per overriding rules this should call to class Derive's static 
	// overridden method. Since static method can not be overridden, it 
	// calls Base's display() 
//Polymorphism in Java has two types: Compile time polymorphism (static binding) and Runtime polymorphism (dynamic binding). 
//Method overloading is an example of static polymorphism, while method overriding is an example of dynamic polymorphism.
public class Inhertance 
{
    
}
