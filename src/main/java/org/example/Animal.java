package org.example;

public class Animal{
    private String type;
    private String[] description;
    private String noise;
    private int id;
    private byte age;

    public Animal(String type, String[] description, String noise, int id, byte age){
        this.type=type;
        this.description=description;
        this.noise=noise;
        this.id=id;
        this.age=age;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setDescription(String[] description){
        this.description=description;
    }
    public void setNoise(String noise){
        this.noise=noise;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setAge(byte age){
        this.age=age;
    }
    public String getType(){
        return this.type;
    }
    public String[] getDescription(){
        return this.description;
    }
    public String getNoise(){
        return this.noise;
    }
    public int getID(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    public void printInfo(){
        String fullDescription="";
        for(String i : description){
            fullDescription+=i+ ", ";
        }
        System.out.println(type+ "\n" + fullDescription + "\nIt says "+ noise + "\nID is "+id+"\nIts age is "+age);
    }
    public void printAnimalSound(){
        System.out.println(this.noise);
    }
}