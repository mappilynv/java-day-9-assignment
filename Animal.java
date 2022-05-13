public class Animal {
    public String name;
    public boolean dogOrNot;

    public Animal (String name){
        this.name = name;
        this.dogOrNot = false;
    }

    public Animal (boolean dogOrNot){
        this.name = "Fido";
        this.dogOrNot = dogOrNot;
    }

    public Animal (String name, boolean dogOrNot){
        this.name = name;
        this.dogOrNot = dogOrNot;
    }

    public String getName(){
        return this.name;
    }

    public boolean getDog() {
        return this.dogOrNot;
    }

    @Override
    public String toString(){
        return getName() + " is a dog = " + getDog();
    }

}
