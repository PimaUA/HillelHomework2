package part1;

public class Count {
    //method wordsCount calculates number of words
    //per string
    public int wordsCount(String str) {
        //split the string to array using whitespace as separator
        String[] strArray = str.split("\\s+");
        //checking if each element of array is word
        int numberOfWords=0;
        for(String element:strArray){
      if(element.matches("(\\p{P}?([a-zA-Z\\-]+)\\p{P}?)")){
          numberOfWords++;
      }
        }
        return numberOfWords;
    }
//method main
    public static void main(String[] args) {
        Count count = new Count();
        int numberOfWords=count.wordsCount(" .Hello -hello,   my other   23 worlds! ");
        System.out.println(numberOfWords);
    }
}
