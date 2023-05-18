package Strings;
/*
pattern is made of 0s and 1s. zeros are for vowels, 1s are for consonants.
Count substrings of the source that match the pattern
*/

public class MatchPatternAndSource {
    public static int matchPatternToSource(String pattern, String source){
        int patternLength = pattern.length();
        int result=0;
        for(int i=0; i<source.length(); i++){
            String shortString="";
            if(source.substring(i).length()>=patternLength){
                shortString = source.substring(i,i+patternLength);
                System.out.println(shortString);
            }
            else{
                System.out.println("string too short");
            }
            String resultString="";
            for(int j=0; j<shortString.length(); j++){
                if(shortString.charAt(j) == 'a' ||
                        shortString.charAt(j) == 'e' ||shortString.charAt(j) == 'o' ||
                        shortString.charAt(j) == 'i' ||shortString.charAt(j) == 'u' ||
                        shortString.charAt(j) == 'y'){
                    resultString +='0';
                }
                else{
                    resultString+='1';
                }

            }
            if (resultString.equals(pattern)){
                result +=1;
                System.out.println(resultString);

            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        matchPatternToSource("010","amazing");
    }
}
