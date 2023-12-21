package review8;

public class Sport {
    /* data typename

     */
    //instance variables
    String type ,teamName;
    int numberOfPlayers;
    String location;
    String coach;


    /* Must Must
    returnType name(){}
     */

    void play(){
        System.out.println("we play "+type);
    }
    void watch(String stream){
        System.out.println("i am watching "+type+"on "+stream);
    }
}
