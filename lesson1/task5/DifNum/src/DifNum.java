public class DifNum {
    public static void main(String[] args){
        int number = 1345;
        String s = String.valueOf(number);
        int counter = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j) && j != i) {
                    counter++;
                }
            }
        }
        if (counter > 0){
            System.out.print("Неверно. Цифры совпадают.");
        } else if (counter == 0) {
            System.out.print("Верно. Все цифры различны.");
        }
    }
}
