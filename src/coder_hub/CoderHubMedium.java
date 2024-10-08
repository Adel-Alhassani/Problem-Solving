package coder_hub;

import java.util.Arrays;

public class CoderHubMedium {

    public static int[] largestSmallest(int[] array) {
        int s = 0;
        int [] ar = new int[2];
        for (int j : array){
                if (j > s){
                    s = j;
                }
        }
            ar[0] = s;
        for (int i : array){
            if (i < s){
                s = i;
            }
        }
        ar[1] = s;
        return ar;
    }

    public static boolean findElement(int[] array, int element) {
        for (int i:array) {
            if (element == i)
                return true;
        }
        return false;
    }

    public static int maxElement(int[] arr) {
        int s = arr[0];
        for (int i: arr) {
            if(s < i){
                s = i;
            }
        }
        return s;
    }

    public static int smallestNumber(int[] arr) {
        int s = arr[0];
        for (int i: arr) {
            if(s > i){
                s = i;
            }
        }
        return s;
    }

    public static int[] subArrays(int[] arr1, int[] arr2) {
        int [] ar = new int[arr1.length];
        for(int i = 0 ; i < arr1.length ; i++){
            ar[i] = arr2[i] - arr1[i];
        }
        return ar;
    }

    public static int mostFrequentElement(int[] arr) {
        int s = 0;
        int c = 0;
        int res = 0;

        for (int i: arr) {
            for (int j: arr) {
                if(i == j){
                    c++;
                }
            }
            if (c > s){
                s = c;
                res = i;
            }
            c = 0;
        }
        return res;
    }

    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int[] sortArray(int[] array, String type) {
        Arrays.sort(array);
        int []ar = new int[array.length];
        if(type.equals("S")){
            return array;
        }
        else{
            int c = 0;
            for (int i=array.length-1; i >=0 ; i--){
                ar[c] = array[i];
                c++;
            }
            return ar;
        }
    }

    public static int[] primesNums(int[] array) {
        String a = "";
        int c = 0;
        boolean s = false;
        for (int i : array) {
            if(i == 2){
                a += i+" ";
                continue;
            }
            for (int j = i-1; j > 1;j--){
                if (i%j==0){
                    s = false;
                    break;
                }
                else {
                    s = true;
                }
            }
            if(s){
                a += i+" ";
            }
        }
        String []aa = a.split(" ");
        int []ar = new int[aa.length];
        for (String k : aa) {
            ar[c] = Integer.parseInt(k);
            c++;
        }
        return ar;

    }

    public static String date_format(String date) {
        String []s  = date.split("/");
        return date+" | "+date.replaceAll("/","-")+" | "+s[1]+"/"+s[2]+"/"+s[0];
    }

    public static int[] filpEvenOdd(int[] array) {
        int []ar = new int [array.length];
        int c = 0;
        for (int i : array) {
            if(i%2==0){
                ar[c] = i+1;
                c++;
            }
            else{
                ar[c] = i-1;
                c++;
            }
        }
        return ar;
    }

    public static String dateFormating(String date) {
        String [] s = date.split("-");
        return s[2]+"-"+s[1]+"-"+s[0];
    }
    public static int octToDec(int oct) {
        return Integer.parseInt(String.valueOf(oct),8);
    }
    public static String octToHex(int oct) {
        return Integer.toHexString(Integer.parseInt(String.valueOf(oct),8)).toUpperCase();
    }

    public static int countOnes(int num) {
        int c = 0;
        String s = Integer.toBinaryString(num);
        for (int i = 0 ; i < s.length();i++){
            if (s.charAt(i) == '1')
                c++;
        }
        return c;
    }
    public static String replaceThe(String txt) {
        String []s = txt.split(" ");
        for (int i = 0; i < s.length;i++){
            if(s[i].equals("the")){
                switch(s[i+1].charAt(0)){
                    case 'a', 'e', 'i', 'o','u':{
                        txt = txt.replace("the","an");
                    }
                    default:{
                        txt = txt.replace("the","a");
                    }
                }
            }
        }
        return txt;
    }

    public static int leftDigit(String str) {
        for (int i = 0;i < str.length();i++){
            try{
                return Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            catch (Exception ignored){
            }
        }
        return 0;
    }

    public static String missingLetter(String txt) {
        char s = txt.charAt(0);
        for (int i = 0; i < txt.length();i++){
            if (s != txt.charAt(i)){
                return String.valueOf(s);
            }
            s++;
        }
        return "No Missing Letter";
    }

    public static String removeSpecialCharacters(String str) {
        str=str.replaceAll("[^a-zA-Z0-9-_ ]","");
        return str;
    }

    public static String longestZero(String str) {
        String s = "";
        String c = "";
        if(str.contains("0")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    s += str.charAt(i);
                }
                else{
                    if (s.length() > c.length()) {
                        c = s;
                    }
                    s = "";
                }
            }
            return  c;
        }
        else{
            return " ";
        }
    }

    public static int[] cumulativeSum(int[] arr) {
        int []ar = new int [arr.length];
        int s = 0;

        for (int i = 0; i < ar.length;i++){
            s += arr[i];
            ar[i] = s;
        }
        return ar;
    }

    public static String hasSpace(String str) {
        if(str.contains(" ")){
            str = str.replaceAll(" ","#");
        }
        return str;
    }

    public static int[] wordLength(String[] arr) {
        int []ar = new int[arr.length];
        int s = 0;
        for(int i = 0 ; i < arr.length;i++){
            s = arr[i].length();
            ar[i] = s;
        }
        return ar;
    }

    public static int[] mergeSort(int[] node1, int[] node2) {
        String s = "";
        for (int i:node1) {
            s += i + " ";
        }
        for (int i:node2) {
            s += i+ " ";
        }
        String []ss = s.split(" ");
        int c = 0;
        int []ar = new int[ss.length];
        int x = Integer.parseInt(ss[0]);
        for (String i:
             ss) {
            if(Integer.parseInt(i) < x){
                x = Integer.parseInt(i);
            }
        }
        int a = x;
        for (int i = ss.length - 1; i >= 0; i--) {
            for (int j = 0; j < ss.length; j++) {
                try {
                    int val = Integer.parseInt(ss[j]);
                    if (val >= a) {
                        a = val;
                        c = j;
                    }
                }
                catch (Exception ignored){}
            }
            ar[i] = a;
            a = x;
            ss[c] = " ";
        }
        return ar;
    }

    public static int[] unique(int[] arr) {
        String s = "";
        boolean x = false;
        String[] a = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = String.valueOf(arr[i]);
        }
        for (int j = 0 ; j < a.length; j++) {
            x = false;
            if (a[j].equals("$")){
                x = true;
            }
            for (int k = j+1 ; k < a.length ; k++) {
                //System.out.println("eq "+a[j]+"  "+a[k]);
                if (a[j].equals(a[k])) {
                    x = true;
                    a[k] = "$";
                }

            }
            //System.out.println("x: "+x);
            if (!x) {
                s += a[j] + " ";
            }
            //System.out.println("--------");
        }
        //System.out.println(">>"+s);


        String []ss = s.split(" ");
        int []ar = new int[ss.length];
        if(s.contains("$") || s.length() == 0){
            return ar;
        }
        int c = 0;
        for (String i: ss) {
            ar[c] = Integer.parseInt(i);
            c++;
        }
        return ar;
    }

    public static double[] arrayRoot(double[] arr) {
        double []ar = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ar[i] = Math.sqrt(arr[i]);
        }
        return ar;
    }

    public static String sortByLength(String txt) {
        String x ="";
        int a = txt.length();
        String f = "";
        String []ss = txt.split(" ");
        for (int i = 0;i<ss.length;i++) {
            String s = ss[i];
            for(int j = i+1;j < ss.length; j++) {
                if(ss[i].length() > ss[j].length()){
                   x = ss[i];
                   ss[i] = ss[j];
                   ss[j] = x;
                }
                else if(ss[i].length() == ss[j].length()){
                    int t = ss[i].toLowerCase().compareTo(ss[j].toLowerCase());
                    if (t > 0){
                        x = ss[i];
                        ss[i] = ss[j];
                        ss[j] = x;
                    }
                }
            }
            f += ss[i]+" ";
        }
        return f;
    }

    public static String[] addFive(String[] arr) {
        if(arr.length == 0)
            return arr;
        for (int i = 0 ; i < arr.length ; i++) {
           arr[i] = arr[i]+"5";
        }
        return arr;
    }

    public static String middleChar(String word) {
        if (word.length() % 2== 1){
            return String.valueOf(word.charAt(word.length() / 2));
        }
        else{
            int a = word.length() / 2 - 1;
            return word.substring(a,a+2);
        }
    }

    public static boolean compareTwoWords(String s1, String s2) {
        int x = s1.substring(s1.length() - 2,s1.length()).toLowerCase().compareTo(s2.substring(s2.length() - 2,s2.length()).toLowerCase());
        return x == 0;
    }

    public static String[] find_prefix(String[] words, String text) {
        String s = "";
        for (int i = 0; i < words.length; i++) {
            try {
                if (words[i].substring(0,text.length()).equals(text)){
                    s += words[i] + " ";
                }
            }
            catch (Exception ignored){
            }
        }

        String [] arr;

        if (s.length() == 0){
            arr = new String[1];
            arr[0] = "No matches found";
            return arr;
        }
        arr = s.split(" ");
        return arr;
    }

    //قم بكتابة دالة function تستقبل متغير من نوع string يتكون من حروف، تقوم الدالة باستبدال الاحرف باحد الرمزين (>) و(<) بحيث
    // اذا كان الحرف مكرر في الكلمة يتحول الى > واذا كان الحرف لا يتكرر يتحول الى <
    //** النتيجة للدالة تكون من نوع string
    public static String arrowDuplicates(String word) {
        // write your code here
        word = word.toLowerCase();
        String res = word;
        boolean s;
        for (int i = 0; i < word.length(); i++) {
            s = false;
            if(word.charAt(i) == '<' || word.charAt(i) =='>'){
                continue;
            }
            for(int j=i+1;j<word.length();j++){
                if(String.valueOf(word.charAt(i)).equals(String.valueOf(word.charAt(j)))){
                    s = true;
                    break;
                }
            }
            if(s){
                res = res.replaceAll(String.valueOf(word.charAt(i)),"<");
            }
            else{
                res = res.replaceAll(String.valueOf(word.charAt(i)),">");
            }
        }
        return res;
    }


    //قم بكتابة دالة تستقبل متغيرين من نوع string ثم تقوم بإرجاع true إذا كان النص الأول يحتوي
    // على الجزء النصي المعطى في المتغير الثاني وتقوم بإرجاع false في ما عدا ذلك
    public static boolean stringContains(String firstName, String contains) {
        // write your code here
        return firstName.contains(contains);

    }


    public static String longestAlternatingSubstring(String digits) {
        if(digits.length() == 0){
            return"";
        }
        String longest = "";
        for (int i = 0; i < digits.length(); i++) {
            String sub = "";
            if(Integer.parseInt(String.valueOf(digits.charAt(i))) % 2 != 0){
                boolean isPrevOdd = true;
                sub += digits.charAt(i);
                for (int j = i+1; j < digits.length(); j++) {
                    if(Integer.parseInt(String.valueOf(digits.charAt(j))) % 2 == 0){
                        if(isPrevOdd){
                            sub += digits.charAt(j);
                            isPrevOdd = false;
                        } else{
                            if(longest.length() < sub.length()){
                                longest = sub;
                            }
                            break;
                        }
                    } else {
                        if(!isPrevOdd){
                            sub += digits.charAt(j);
                            isPrevOdd = true;
                        } else{
                            if(longest.length() < sub.length()){
                                longest = sub;
                            }
                            break;
                        }
                    }
                }
            } else {
                boolean isPrevEven = true;
                sub += digits.charAt(i);
                for (int j = i+1; j < digits.length(); j++) {
                    if(Integer.parseInt(String.valueOf(digits.charAt(j))) % 2 != 0){
                        if(isPrevEven){
                            sub += digits.charAt(j);
                            isPrevEven = false;
                        } else{
                            if(longest.length() < sub.length()){
                                longest = sub;
                            }
                            break;
                        }
                    } else {
                        if(!isPrevEven){
                            sub += digits.charAt(j);
                            isPrevEven = true;
                        } else{
                            if(longest.length() < sub.length()){
                                longest = sub;
                            }
                            break;
                        }
                    }
                }
            }
        }
            return longest;
    }

}

