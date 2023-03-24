//Create a main class
public class Main {
    public static void main(String[] args) {
        //create string variable for String, StringBuffer and StringBuilder
        String string1 = new String("  Welcome to the java ");
        StringBuffer string2 = new StringBuffer();
        StringBuilder string3 = new StringBuilder();

        //Append  five lines in StringBuffer.
        string2.append(" Sting Buffer line 1 ");
        string2.append(" String Buffer line 2 ");
        string2.append("String Buffer line 3 ");
        string2.append(" String Buffer line 4 ");
        string2.append(" String Buffer line 5 ");

        //Append  five lines in StringBuilder.
        string3.append("String Builder Line 1 ");
        string3.append("String Builder Line 2 ");
        string3.append("String Builder Line 3 ");
        string3.append("String Builder Line 4 ");
        string3.append("String Builder Line 5 ");

        //Convert all variables string to upper case letter and trim all the variable of string
        System.out.println("Converted in Uppercase  :");
        System.out.println(string1.toUpperCase());
        System.out.println(string2.toString().toUpperCase());
        System.out.println(string3.toString().toUpperCase() +"\n");
        System.out.println("Trim leading and trailing white space :");
        System.out.println(string1.toString().trim());
        System.out.println(string2.toString().trim());
        System.out.println(string3.toString().trim() +"\n");
        //Print all variable in console
        System.out.println("Print All variable in console :");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);


    }
}