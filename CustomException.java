// public class Exceptions{
//     static void fun(){
//         try{
//             throw new NullPointerException("Demo");
//         }
//         catch(NullPointerException e){
//             System.out.println("caugth inside fun())");
            
//         }

//     }
//     public static void main(String[] args){
//         try{
//             fun();
//         }catch(NullPointerException e){
//             System.out.println("Main in catch))");
//         }
//     }
// }

// public class Exception{
//     public static void main(String[] args)throws ClassNotFoundException{
//         try{
//             Class temp = Class.forName("Exception");

//         }catch(ClassNotFoundException e){
//             System.out.println("Class not exists");
//         }
//     }
// }



// custom Exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String m){
        super(m);
    }
}
public class CustomException{
    public static void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age mustbe above 18");
        }
        System.out.println("Valid age" + age);
    }
    public static void main(String[] args){
        try{
            validate(13);

        }catch(InvalidAgeException e){
            System.out.println("Caught exception");
        }
    }
}