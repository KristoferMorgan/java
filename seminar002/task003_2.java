// Напишите метод,который принемает на вход строку
// и определяет являеться ли строка палиндромом


package seminar002;

public class task003_2 {
    public static void main(String [] arg){

    }

    static boolean isPalindrom(String str){
        StringBuilder res = new StringBuilder((""));

        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt((i)));
            
        }
        return str.equals(res.toString());


    }
}
