package coder_hub;

import java.util.Objects;

public class CoderHubEasy {
    public static String concatNames(String name1, String name2) {
        return name1+" "+name2;
    }

    public static double average(int[] array) {
        double s = 0;
        for(int i : array){
            s += i;
        }
        return s/array.length;
    }

    public static String isSame(String name1, String name2) {
        int x = name1.compareTo(name2);
        if(x == 0){
            return "متشابهتين";
        }
        else
            return "غير متشابهتين";
    }

    public static String inputType(String value) {
        if(value.contains(".")){
            return "double";
        }
        else {
            try {
                int a = Integer.parseInt(value);
                return "integer";
            }
            catch (Exception e){
                return "string";
            }
        }
    }

    public static int[] deleteElementInArray(int[] arr, int index) {
        int c = 0;
        int []ar = new int[arr.length-1];
        for (int i =0; i < arr.length;i++) {
            if (i == index)
                continue;
            ar[c] = arr[i];
            c++;
        }
        return ar;
    }

    public static String wordRepeat(String word, int n) {
        String s = "";
        for(int i =  1; i <= n; i++){
            if(i == n){
                s +=  word;
                continue;
            }
            s += word + " ";
        }
        return s;
    }

    public static boolean match_array(String[] array1, String[] array2) {
        if(array1.length != array2.length){
            return false;
        }
        boolean a = false;
        for(int i = 0; i < array1.length; i++) {
            a = false;
            for(int j = 0; j < array1.length; j++)
            if(Objects.equals(array1[i], array2[j])){
               a = true;
            }
        }
        return a;
    }

    public static String numbers_range(int number) {
        String s = "";
        for(int i = 0; i <= number; i++){
            s += i+" ";
        }
        return s;
    }

    public static int exponent_squared(int number) {
        return (int)Math.pow(number,2);
    }

    public static int countChar(String sentence, String ch) {
        int s = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(String.valueOf(sentence.toLowerCase().charAt(i)).equals(ch.toLowerCase())){
                s++;
            }
        }
        return s;
    }

    public static int DecimalPlaces(String num) {
        String s = "";
        if(!num.contains("."))
            return 0;
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '.') {
                for (int j = i + 1; j < num.length();j++){
                    s += num.charAt(j);
                }
                break;
            }
        }
        int a = Integer.parseInt(s);
        return String.valueOf(a).length();
    }

    public static String reverseCase(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                s += str.toLowerCase().charAt(i);
            }
            else if(Character.isLowerCase(str.charAt(i))){
                s += str.toUpperCase().charAt(i);
            }
        }
        return s;
    }

    public static int sumTwoSmallestNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr[0] + arr[1];
    }

    public static double cubes(int num) {
        return Math.cbrt(num);
    }

    public static int rootCheck(double sqr, int num) {
        if(Math.sqrt(sqr)==num)
            return num;
        else
            return 0;
    }

    public static int sumEven(int[] arr) {
        int s = 0;
        for (int i:arr) {
            if(i % 2==0)
                s+=i;
        }
        return s;
    }

    public static String hashtag_it(String[] my_array) {
        String s = "";
        for (int i = 0; i < my_array.length; i++) {
            if(i == my_array.length - 1){
                s += my_array[i]+"#";
                break;
            }
            s += my_array[i]+" #";
        }
        return s;
    }


    public static int[] removeDuplicate(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return temp;
    }

    public static String deleteLastChar(String word) {
        return word.substring(0,word.length()-1);

    }

    public static double convertPercent(String percentage) {
        int len=0;
        for (int i=0;i<percentage.length();i++ ){
            if(percentage.charAt(i) == '%'){
                len=i;
                break;
            }

        }
        int num = Integer.parseInt(String.valueOf(percentage.substring(0,len)));
        return num/100.0;
    }

    public static int[] gravity_flip(int[] columns) {
        for (int i = 0; i < columns.length-1; i++) {
            for (int j = i+1; j < columns.length; j++) {
                if(columns[i] > columns[j]){
                    int temp = columns[i];
                    columns[i] = columns[j];
                    columns[j] = temp;
                }
            }
        }
        return columns;
    }


    public static int repetitions(String s) {
        int longest = 0;
        int track =0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length()-1; i++) {
            if(String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(i+1)))){
                track++;
            } else {
            if(longest < track) {
                longest = track;
              track=0;
                 }
            }
        }
        track++;
        return Math.max(longest, track);
    }

    public static String canForm(String source, String target) {
        source = source.toLowerCase();
        target = target.toLowerCase();
        for (int i = 0; i < target.length(); i++) {
            if(!source.contains(String.valueOf(target.charAt(i)))){
                return "no";
            }
        }
        return "yes";
    }

    public static int[] get_duplicate_elements(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    c++;
                    break;
                }
            }
        }
        int [] repeated = new int [c];
        c=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    repeated[c] = arr[i];
                    c++;
                    break;
                }
            }
        }
        return repeated;
    }


//    public static String string_builder(String expression) {
//        int num;
//        String reg = "12345689";
//        String s = "";
//        for (int i = 0; i < expression.length(); i++) {
//            if(String.valueOf(expression.charAt(i)).equals("[")){
//                num = Integer.parseInt(String.valueOf(expression.charAt(i-1)));
//                for (int j = i; j < expression.length(); j++) {
//                    if(String.valueOf(expression.charAt(j)).equals("]")){
//                        s += expression.substring(i+1,j).repeat(num);
////                        s += string_builder(expression.substring(j));
//                        break;
//                    }
//                }
//            }
//        }
//        return s;
//    }


}
