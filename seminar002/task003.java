// Напишите метод,который принемает на вход строку
// и определяет являеться ли строка палиндромом


package seminar002;

public class task003 {
    public static void main(String [] arg){

    }

    static Boolean ChecingForAPalindrom(char [] word ){
        int i1 = 0;
        int i2 = word.length -1;
        while(i1 > i2){
            if (word[i1] != word[i2]){
                return false;
            }
        }
        return true;


    }
}
