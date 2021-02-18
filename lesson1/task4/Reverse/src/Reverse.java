public class Reverse {
    public static void main(String[] args) {
        int number = 4576;
        String str = String.valueOf(number);
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        System.out.println(number);
        System.out.println(result);
    }
}

