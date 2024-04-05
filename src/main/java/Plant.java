package com.mycompany.mavenproject;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Plant implements Externalizable {
    public String name;
    public String family;
    public String colour;
    public int age;
    public float height;
  
    public Plant() {

    }

    public Plant(String name, String family, String colour, int age, float height) {
        this.name = name;
        this.family = family;
        this.colour = colour;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        if (!(age >= 0)) {
            throw new RuntimeException("Аge cannot be a negative number");
        } else {
            this.age = age;
        }
    }

    public void setHeight(float height) {
        if (!(height >= 0)) {
            throw new RuntimeException("Height cannot be a negative number");
        } else {
            this.height = height;
        }
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(family);
        out.writeObject(colour);
        out.writeInt(age);
        out.writeFloat(height);        
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        family = (String) in.readObject();
        colour = (String) in.readObject();
        age = in.readInt();
        height = in.readFloat();        
    } 
    
    @Override
    public String toString() {
        return "Plant{" + "name=" + name + ", family=" + family + ", colour=" + colour + ", age=" + age + ", height=" + height + '}';
    }    
}