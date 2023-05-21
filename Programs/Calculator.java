public class Calculator {
    public static void main(String [] args) {
        Plus2Num p2n = new Plus2Num();

        System.out.println("Welcome to My Calculator");

        p2n.setNums(1, 2);
        System.out.println(p2n.getResult());
        
        // can directly access member data like below if they 
        // are defined as public but not following the concept 
        // data of encapsulation
        p2n.setNums(0, 0);

        System.out.println(p2n.getResult());

    }

}

class Plus2Num {
    // both below will define member data num1 & num2 as public
    //int num1, num2; // by default it's a public member data
    //public int num1, num2; //  clearly defined it as public
    
    // properly apply member data encapsulation 
    private int num1, num2; 

    void setNums(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    int getResult() {
        return num1 + num2;
    }
}