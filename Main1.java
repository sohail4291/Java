import java.util.List;
public class Main1{
    public static void main(String[] args){
       List<List<String>> list = List.of(List.of("A","B"), List.of("C","D"));

        list.stream().flatMap(List::stream).forEach(System.out::println);
       
    }
}