import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // first exercise
        System.out.println("Weight(kg)=");
        double weight = s.nextDouble();
        System.out.println("Height(m)=");
        double height = s.nextDouble();
        System.out.println("BMI="+(weight/ (height * height)));

        // second exercise
        System.out.println("Obtained Marks=");
        double marks = s.nextDouble();
        System.out.println("Total Marks=");
        double totalMarks = s.nextDouble();
        System.out.println("Percentage="+((marks / totalMarks)*100)+"%");

        // third exercise
        System.out.println("Amount in USD=");
        double amount= s.nextDouble();
        System.out.println("Exchange Rate(USD to EUR)");
        double exchangeRate = s.nextDouble();
        System.out.println("Amount in EUR="+amount * exchangeRate);

        // forth exercise
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Length of the string: "+str.length()+"And Reversed string:"+sb.reverse());

        // fifth exercise
        System.out.println("Sentence=");
        String sentence = s.nextLine();
        System.out.println("Start Index=");
        int startIndex = s.nextInt();
        System.out.println("End Index=");
        int endIndex = s.nextInt();
        System.out.println(sentence.substring(startIndex,endIndex));

        // sixth exercise
        System.out.println("sentence=");
        String sentence2 = s.nextLine();
        System.out.println("Keyword=");
        String keyWord = s.nextLine();
        System.out.println(sentence2.contains(keyWord));

        // seventh exercise
        System.out.println("sentence=");
        String sentence3 = s.nextLine();
        System.out.println("Replace=");
        String replacedWord = s.nextLine();
        System.out.println("Replacement word");
        String replacement = s.nextLine();
        System.out.println(sentence3.replaceAll(replacedWord,replacement));

        // eighth exercise
        System.out.println("String 1=");
        String firstStr = s.nextLine();
        System.out.println("String 2=");
        String secondStr = s.nextLine();
        System.out.println(firstStr.equalsIgnoreCase(secondStr));


        //end


    }
}