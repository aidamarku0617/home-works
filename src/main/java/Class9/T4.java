package Class9;

public class T4 {
    public static void main(String[] args) {

        String[][] carsArray= {
                {"Chevrolet", "Ford", "Dodge"},
                {"BMW", "Mercedes", "Audi"},
                {"Hyundai", "Kia", "Genesis"},
                {"Ferrari", "Lamborghini", "Maserati"}
        };
for (int i=0; i< carsArray.length; i++ ){
    for(int j=0; j< carsArray[i].length; j++){
        System.out.print(carsArray[i][j]+" ");
    }
    System.out.print("__");
}
//second way using enhanced for loop
        for(String[] arr:carsArray){
            for(String car:arr){
                System.out.print(car+" ");
            }
            System.out.println();
        }
    }
}
