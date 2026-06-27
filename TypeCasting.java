import java.nio.charset.Charset;

public class TypeCasting {
    public static void main(String[] args){
        // widening implicit
        // byte b = 10;
        // short s = b;
        // int i = s;
        // long l = i;
        // float f = l;
        // double d = f;
        // char c  = 'A';
        // int ascii = c;
        // System.out.println(d);


        // Narrowing explicit
        // double d = 100.99;
        // float f = (float) d;
        // long l = (long) f;
        // int i = (int) l;
        // int s = (short) i;
        // byte b =(byte) s;
        // System.out.println(b);

        // Using wrapper classes
        // string => All
        // String str = "100";
        // int i = Integer.parseInt(str);
        // double d = Double.parseDouble(str);
        // float f = Float.parseFloat(str);
        // long l = Long.parseLong(str);

        // All to string
        // double d = 1000;
        // String s = String.valueOf(d);
        // System.out.println(s);

        // String a = new StringBuilder("sohail").toString();
        // // String b = new StringBuilder("sohail").toString();
        // String b =  "sohaio sdj fo lkd flol";

        // System.out.println(b.split("o",2));

        // String theString = "This is a good day to code";

        // byte[] bytes1 = theString.getBytes();
        // byte[] bytes2 = theString.getBytes(Charset.forName("UTF-8"));
        // System.out.println(bytes1.toString());
        String input1  = "   Hey \n   This \n   is \n   indented.";
String output = input1.stripIndent();

System.out.println(output);
    }

}
