
/*
    11, Viết chương trình đếm các ký tự, số, khoảng trắng và các ký tự khác của một chuỗi.
    input: Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
    output: ky tu: 23 space: 9 so: 10 khac: 6
 */
public class B11 {

    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);

    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                other ++;
            }
        }
        System.out.println("ky tu: " + letter);
        System.out.println("space: " + space);
        System.out.println("so: " + num);
        System.out.println("khac: " + other);
    }
}
