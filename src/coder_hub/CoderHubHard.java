package coder_hub;

public class CoderHubHard {

    //===================================================================
    //===================================================================
    //===================================================================

    // Subtracting two numbers without the minus sign
    public static int mySub(int num1, int num2) {
        return num1+(~num2+1);
    }

    //===================================================================
    //===================================================================
    //===================================================================

    //from Binary to octal
    public static int binToOct(String b){
        int a = Integer.parseInt(b,2);
        return Integer.parseInt(Integer.toOctalString(a));
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // from octal to Binary
    public static String octToBin(int octal) {
        int a = Integer.parseInt(String.valueOf(octal),8);
        return  Integer.toBinaryString(a);
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // Number to English words
    public static String numToEng(int n){
        int lastDig=n%10;//last digit
        int s=n/10;
        int secondDig=s%10;//second digit
        int firstDig=n/100;//first digit
        String[] oneDig ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] oneDigTens = {" ","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tensDig ={" ","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String hundredsDig=" hundred ";
        if(n >= 0 && n<10)
            return oneDig[n];
        else if(n >= 0 && n <100) {
            if (n > 10 && n < 20)
                return oneDigTens[lastDig];
            else {
                if(lastDig == 0){
                    return tensDig[secondDig];
                }
                else {
                    return tensDig[secondDig] + "-" + oneDig[lastDig];
                }
            }
        }
        else if (n >= 0 && n <= 999){//from 100 to 999
            if(secondDig == 0){
                if(lastDig == 0 ) {
                    return oneDig[firstDig] + hundredsDig;
                }
                else{
                    return oneDig[firstDig] + hundredsDig + oneDig[lastDig];
                }
            }
            else if(secondDig == 1){
                if(lastDig == 0){
                    return oneDig[firstDig]+ hundredsDig + tensDig[1];
                }
                else {
                    return oneDig[firstDig] + hundredsDig + oneDigTens[lastDig];
                }
            }
            else {
                if(lastDig == 0){
                    return oneDig[firstDig] + hundredsDig + tensDig[secondDig];
                }
                else {
                    return oneDig[firstDig] + hundredsDig + tensDig[secondDig] + "-" + oneDig[lastDig];
                }
            }
        }
        return"";
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // Determine odd and even numbers
    public static String oddsVsEvens(int num) {
        String intStr = String.valueOf(num);
        int odd = 0;
        int even = 0;
        for (int i = 0;i < intStr.length();i++){
            int w = Integer.parseInt(intStr.substring(i,i+1));
            if(w % 2 == 1){
                odd += w;
            }
            else{
                even+= w;
            }
        }
        if (odd > even){
            return "odd";
        }
        else if (odd < even){
            return "even";
        }
        else{
            return "equal";
        }
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // Split words
    public static String capSpace(String txt) {
        String s = "";
        for (int i = 0; i < txt.length();i++){
            if(Character.isUpperCase(txt.charAt(i))){
                s = s + " "+txt.charAt(i);
            }
            else {
                s += txt.charAt(i);
            }
        }
        return s.toLowerCase();
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // Adding two numbers inside a text value
    public static String addStrNums(String num1, String num2) {
        try{
            return String.valueOf((Integer.parseInt(num1)+Integer.parseInt(num2)));
        }
        catch (Exception e ){
            return String.valueOf(-1);
        }
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // the Vowels letter
    public static String firstNVowels(String phrase, int n) {
        String s = "";
        for (int i = 0; i < phrase.length();i++){
            switch (phrase.charAt(i)) {
                case 'a', 'A' -> s += phrase.charAt(i);
                case 'e', 'E' -> s += phrase.charAt(i);
                case 'i', 'I' -> s += phrase.charAt(i);
                case 'o', 'O' -> s += phrase.charAt(i);
                case 'u', 'U' -> s += phrase.charAt(i);
            }
            if(s.length() == n){
                break;
            }
        }
        if (s.length() < n){
            return "invalid";
        }
        else {
            return s;
        }
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // Check the mathematical process
    public static boolean mathExpr(String expr) {
        boolean b = false;
        String a;
        int c;
        for (int i = 0;i<expr.length();i++){
            try {
                switch (expr.charAt(i)) {
                    case '+', '*', '/', '-', '%' -> {
                        a = expr.replace(expr.substring(i, i + 1), "");
                        c = Integer.parseInt(a);
                        b = true;
                        return b;
                    }
                }
            }
            catch( Exception e ){
                return b;
            }
        }
        return b;
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // Converting between 12 hours and 24 hours
    public static String convertTime(String time) {
        int s = 0;
        String res = "";
        for (int i = 0; i < time.length(); i++) {
                if(time.charAt(i) == ':') {
                    s = Integer.parseInt(time.substring(0,i));
                    break;
                }
        }
        String a = time.substring(String.valueOf(s).length(), time.length());
        if(s >= 12 && s<= 23){
            int remainder = s % 12;
            if(time.contains("am")) {
                res += remainder + a.replaceAll("am","") ;
                res = res.replaceAll(" ","");
            }
            else if(time.contains("pm")){
                if(s == 12){
                    res = "";
                }
                else {
                    res += remainder + a;
                }
            }
            else{
                res += remainder+a+" pm";
            }
        }
        else if (s >= 0 && s < 12){
            int re = 12 + s;
            if(time.contains("pm")) {
                res += re + a.replaceAll("pm","");
                res = res.replaceAll(" ","");
            }
            else if(time.contains("am")) {
                res += s+a.replaceAll("am","") ;
                res = res.replaceAll(" ","");
            }
            else{
                if(s == 0){
                    res += re+a+" am";
                }
                else {
                    res += time + " am";
                }
            }
        }
        return res;
    }

    //===================================================================
    //===================================================================
    //===================================================================

    // postfix
    public static int postFix(String expr) {
        //expr = expr.replaceAll(" ","");
        String [] ar = new String[expr.length()];
        int c = 0;
        int a = 0;
        int b = 0;
        int s = 0;
        String x = "";
        for (int i=0 ; i < expr.length() ; i++){

            for (int j = i; j < expr.length();j++){
                if(Character.isDigit(expr.charAt(j))){
                    x += expr.charAt(j);
                }
                else {
                    break;
                }
            }
            if (x.length() != 0) {
                ar[c] = x;
                c++;
            }
            if(!Character.isDigit(expr.charAt(i))){
                if(expr.charAt(i) == ' '){
                    continue;
                }
                for(int j = ar.length-1 ;j >= 0;j--){
                    try {
                        a = Integer.parseInt(ar[j]);
                        b = Integer.parseInt(ar[j-1]);
                        s = j-1;
                        break;
                    }
                    catch (Exception ignored){
                    }
                }
                switch (expr.charAt(i)){
                    case '+':{
                        ar[s] = String.valueOf(b + a);
                        for (int k=s+1;k < ar.length ; k++){
                            ar[k] = "$";
                        }
                        c--;
                        break;
                    }
                    case '-':{
                        ar[s] = String.valueOf(b - a);
                        for (int k=s+1;k < ar.length ; k++){
                            ar[k] = "$";
                        }
                        c--;
                        break;
                    }
                    case '*':{
                        ar[s] = String.valueOf(b * a);
                        for (int k=s+1;k < ar.length ; k++){
                            ar[k] = "$";
                        }
                        c--;
                        break;
                    }
                    case '/':{
                        ar[s] = String.valueOf(b / a);
                        for (int k=s+1;k < ar.length ; k++){
                            ar[k] = "$";
                        }
                        c--;
                        break;
                    }
                }
            }
            i += x.length();
            x = "";
        }
        return Integer.parseInt(ar[0]);
    }

    //===================================================================
    //===================================================================
    //===================================================================

    public static int[] tribonacci(int num) {
        int [] arr = new int [num];
        int s = 0;
        for (int i = 0; i < num; i++) {
            if(i > 2){
                for(int j = i - 3; j < i; j++){
                    s += arr[j];
                }
                arr[i] = s;
                s = 0;
                continue;
            }
            arr[i] = 1;
        }
        return arr;
    }

    //===================================================================
    //===================================================================
    //===================================================================

    public static boolean isInterleave(String A, String B, String C) {
        String constA = A;
        String constB = B;
        String A2 = "";
        String B2 = "";
        int lengthOfCSubInA;
        int lengthOfCSubInB;
        if ((A.length() + B.length()) != C.length()) {
            return  false;
        }
        for (int i = 0; i < C.length(); i++) {
            if(!A.contains(String.valueOf(C.charAt(i))) && !B.contains(String.valueOf(C.charAt(i)))){
                return false;
            }
            else{
                if(A.contains(String.valueOf(C.charAt(i))) && !B.contains(String.valueOf(C.charAt(i)))){
                    if(A.length() == 1){
                        A2 += String.valueOf(C.charAt(i));
                        A = A.replace(String.valueOf(C.charAt(i)),"");
                    } else {
                        lengthOfCSubInA = 0;
                        for (int j = i+1; j <= C.length(); j++) {
                            if(A.contains(C.substring(i,j))){
                                lengthOfCSubInA++;
                                if(A.length() == lengthOfCSubInA){
                                    A2 += C.substring(i,i + lengthOfCSubInA);
                                    A = A.replace(C.substring(i,i + lengthOfCSubInA) , "");
                                    i += lengthOfCSubInA-1;
                                    break;
                                }
                            } else {
                                A2 += C.substring(i,i + lengthOfCSubInA);
                                A = A.replace(C.substring(i,i + lengthOfCSubInA) , "");
                                i += lengthOfCSubInA-1;
                                break;
                            }
                        }
                    }

                } else if(!A.contains(String.valueOf(C.charAt(i))) && B.contains(String.valueOf(C.charAt(i)))){
                    if(B.length() == 1){
                        B2 += String.valueOf(C.charAt(i));
                        B = B.replaceFirst(String.valueOf(C.charAt(i)),"");
                    } else{
                        lengthOfCSubInB = 0;
                        for (int j = i+1; j <= C.length(); j++) {
                            if(B.contains(C.substring(i,j))){
                                lengthOfCSubInB++;
                                if(B.length() == lengthOfCSubInB){
                                    B2 += C.substring(i,i + lengthOfCSubInB);
                                    B = B.replaceFirst(C.substring(i,i + lengthOfCSubInB) , "");
                                    i += lengthOfCSubInB-1;
                                    break;
                                }
                            } else {
                                B2 += C.substring(i,i + lengthOfCSubInB);
                                B = B.replaceFirst(C.substring(i,i + lengthOfCSubInB) , "");
                                i += lengthOfCSubInB-1;
                                break;
                            }
                        }
                    }

                } else {
                     lengthOfCSubInA = 0;
                     lengthOfCSubInB = 0;
                    for (int j = i+1; j <= C.length(); j++) {
                        if(!A.contains(C.substring(i,j)) && !B.contains(C.substring(i,j))){
                            break;
                        } else {
                            if(A.contains(C.substring(i,j))){
                                lengthOfCSubInA++;
                            }
                            if(B.contains(C.substring(i,j))){
                                lengthOfCSubInB++;
                            }
                        }

                    }

                        if(lengthOfCSubInA > lengthOfCSubInB){
//
                            A2 += C.substring(i,i + lengthOfCSubInA);
                            A = A.replaceFirst(C.substring(i,i + lengthOfCSubInA) , "");
                            i += lengthOfCSubInA-1;
                        } else {
//
                            B2 += C.substring(i,i + lengthOfCSubInB);
                            B = B.replaceFirst(C.substring(i,i + lengthOfCSubInB) , "");
                            i += lengthOfCSubInB-1;
                        }

                    }
                }

            }

        if(!constA.equals(A2)){
            return false;
        }
        if(!constB.equals(B2)){
            return false;
        }
        return true;
    }
}
