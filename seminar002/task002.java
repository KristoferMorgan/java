// Напишите метод который сжимает строку
// пример:
// aaaabbbcdd. Результат: a4b3cd2
package seminar002;

public class task002 {


public static void main(String[] args){
    System.out.println(stringCompress("aaaabbbcdd"));

}

    static String stringCompress(String str){
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0);
        newStr.append(symbol);
        int count = 0;

        for(char letter : str.toCharArray()){
            if(letter == symbol) count++;
            else{
                if(count != 1) newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;

            }
        }
        if(count != 1) newStr.append(count);


        return newStr.toString();
    }
}
