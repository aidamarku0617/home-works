package class8;

public class Task1 {
    public static void main(String[] args) {
        //write a program to count how many times the name Zeehan
        //as appeared in this array


    String [] names={"Aidos", "Zeehan", "Abid", "Sharif", "Zeehan"};

            int count=0;
            for(int i=0; i< names.length; i++){
                if(names[i].equals("Zeehan")){
                    count++;

                }
            }
        System.out.println("Zeehan appeared " + count+ "times");
    }


}
