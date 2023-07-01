//Дано чесное число N (0>) и сиволы c1 и c2.
// Написать метод,который вернет строку длины N,которая состоит из чередующихся символов c1 и c2,
// начиная c c1.
package seminar002;

public class task001 {
    public static void main(String[] args){
        System.out.println(LongStringDilding(11, 'f','k'));
    }


    static String LongStringDilding(int n,char c1,char c2){
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
            
        }
        return newStr.toString();
    }
}
