package Lab1;


public class Ex {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        String number = new Input().input().trim();
        try{
            new CheckForMagic().isNumberMagic(number);
            System.out.println("Number is MAGIC");
        }catch(StackOverflowError ex){
            System.out.println("Number isn't magic(((");
        }
    }
}
