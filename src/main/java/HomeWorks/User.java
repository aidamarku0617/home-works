package HomeWorks;


    public class User {
        // Write program: User that has a constructor that initializes instance variable name and mobile number.
        // Create a subclass/child class  userInfo that will have user address variable and
        // it also being initialized through constructor call. Print users name, mobile number and
        // address in userDetails method. Test your code.

        String name;
        double mobileNumber;
    public User(String name, double mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

    }

    class UserTester extends User {

        String address;

        public UserTester(String name, double mobileNumber, String address) {
            super(name, mobileNumber);
            this.address = address;
        }

        public void userDetails() {
            System.out.println("Name " + name);
            System.out.println("Mobile number " + mobileNumber);
            System.out.println("Address " + address);
        }
    }

