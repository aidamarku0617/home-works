package review4;

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            System.out.println("Hello " +i);
        }
        for(int i=2; i<=10; i+=3){
            System.out.println(i);
        }
        for(int i=10; i>2; i--){
            System.out.print(i + " ");
        }
        for(int i=10; i<2; i--){
            System.out.print(i + " ");
        }
        for(int i=10; i>2; i++){
            System.out.print(i + " ");//infinit loop
        }
    }

}
