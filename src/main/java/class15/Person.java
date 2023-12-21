package class15;

public class Person {
   private String name;
   private int age;
    private double weight;
   private double salary;
  private  String favPLanguage;

public   Person(String pName,int pAge, double pWeight,double pSalary, String pFavLang){
      name=pName;
      age=pAge;
      weight=pWeight;
      salary=pSalary;
      favPLanguage=pFavLang;

  }

    public   Person(String pName,int pAge, double pWeight,double pSalary) {
        name = pName;
        age = pAge;
        weight = pWeight;
        salary = pSalary;

    }
        void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
