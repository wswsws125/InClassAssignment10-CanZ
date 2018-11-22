import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a tweet:");
        String tweet=s.nextLine();

        if(tweet.length()>140){
            System.out.println("Please enter less than 140 characters");
            System.out.println("Excess characters:"+(tweet.length()-140));
        }

        else {
            System.out.println("Length Correct");
            int numOfMentions=0 , numOfHashtags=0, numOfLinks=0;

            for(int i=tweet.length()-2;i>=0;i--){
                if (tweet.charAt(i)=='@'){
                    if((tweet.charAt(i+1)!='\t')&&(tweet.charAt(i+1)!=' ')){
                        numOfMentions++;
                    } }}
                System.out.println("Number of mentions: " +numOfMentions);

            for(int i=tweet.length()-2;i>=0;i--){
                if (tweet.charAt(i)=='#'){
                    if((tweet.charAt(i+1)!='\t')&&(tweet.charAt(i+1)!=' ')){
                        numOfHashtags++;
                    } }}
            System.out.println("Number of hashtags: " +numOfHashtags);

            for(int i=0;i<=tweet.length()-1;i++){
                String uppaercase=tweet.toUpperCase();
                if (uppaercase.substring(i).startsWith("HTTP://")) {
                    numOfLinks++;
                    }}
            System.out.println("Number of links: " +numOfLinks);
        }

                //int occurance = StringUtils.countOccurrencesOf("a.b.c.d", ".")
        }
    }
