package class20;

public  abstract class Computer {
    //instance variables
    public static String type;
    String name;
    int memory;
    String color;


    Computer(String name, int memory, String color){
        this.name=name;
        this.memory=memory;
        this.color=color;

    }
   public static void playSong(){
        System.out.println("I can play music on my "+type);
    }
protected void printInfo(){
    System.out.println("i have "+name+"computer with "+memory+" memory");
}
 abstract void execudeCode();
    abstract void readEmails();
}
