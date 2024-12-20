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
        String s = "#"+my_array[0];
        for (int i = 1; i < my_array.length; i++) {
            s += " "+ "#"+my_array[i];
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

    public static int[] getPrimesBetween(int a, int b) {
        int c=0;
        for (int i = a; i <= b; i++) {
            if(i==0 || i==1){
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                c++;
            }
        }
        int [] primeNums = new int[c];
        c=0;
        for (int i = a; i <= b; i++) {
            if(i==0 || i==1){
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNums[c] = i;
                c++;
            }
        }
        return primeNums;
    }

    public static double calculate_circumference(double radius) {
        return Math.PI*2*radius;
    }

    public static int[] mergeAndOrder(int[] array1, int[] array2) {
        if(array1.length == 0){
            return array2;
        }
        if(array2.length == 0){
            return array1;
        }
        int [] arr = new int [array1.length + array2.length];
        int c = 0;
        for (int i : array1) {
            arr[c] = i;
            c++;
        }
        for (int i : array2) {
            arr[c] = i;
            c++;
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] remove_duplicate(int[] arr) {
        String s = arr[0] +",";
        for (int num : arr) {
            boolean isDuplicated = false;
            for (int i = 0; i < s.length(); i++) {
                if(s.contains(String.valueOf(num))){
                    isDuplicated = true;
                    break;
                }
            }
            if(!isDuplicated){
                s += num + ",";
                }
            }
        String[] result = s.split(",");
        int [] nums = new int[result.length];

        for (int i = 0; i < result.length; i++) {
            nums[i] = Integer.parseInt(result[i]);
        }
        return  nums;
    }

    public static double get_mean(int[] arr) {
        // write your code here
        double sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int[] countdown(int num) {
        if(num <= 4){
            return  new int[]{0};
        }
        String s ="";
        for (int i = 1; i < num; i++) {
            int res = num - 3*i;
            if(res <= 0){
                break;
            }
            if(res % 2 == 0){
                s += res +",";
            }
        }
        String [] a = s.split(",");
        int [] nums = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            nums[nums.length - i-1] = Integer.parseInt(a[i]);
        }
        return nums;
    }

    public static double cone_volume(double radius, double height) {
        // write your code her
        return Math.pow(radius,2) * height * 3.14 * (1.0/3.0);
    }

    public static int calculate_sum(int[] lst) {
        // write your code here
        int sum = 0;
        for (int j : lst) {
            if (j == 7) {
                break;
            }
            sum += j;
        }
        return sum;
    }

    public static String operation(int num1, int num2) {
        if(num1/num2 == 24){
            return "divided";
        }
        else if(num1*num2 == 24){
            return "multiplied";
        }
        else if(num1+num2 == 24){
            return"added";
        }
        else if(num1-num2 == 24){
            return"subtracted";
        }
        else{
            return "None";
        }
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
