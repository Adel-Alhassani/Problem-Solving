package coder_hub;

public class CoderHubNiceTry {

    // هنا فيه بعض الميثودز الصحيحة نسبيَا يعني ماهي صحيحة كليًا
    // لكن في بعضها أخدت مني وقت طويل زي حق الطرح بدون علامة الطرح :)

    public static int postFix3(String expr) {
        int s = Integer.parseInt(expr.substring(0,1));
        int x = 0;
        expr = expr.replaceAll(" ","");
        for (int i = 0; i < expr.length(); i++) {
            switch (expr.charAt(i)) {
                case '+', '-', '*', '/' -> x++;
            }
        }
        System.out.println("--"+x);
        int [] ar = new int[x-1];
        int c = 0;
        for (int i = 0; i < expr.length();i++){
            try {
                switch (expr.charAt(i)) {
                    case '+': {
                        s += Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                        ar[c] = s;
                        c++;
                        break;
                    }
                    case '-': {
                        s -= Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                        ar[c] = s;
                        c++;
                        break;
                    }
                    case '*': {
                        s *= Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                        ar[c] = s;
                        c++;
                        break;
                    }
                    case '/': {
                        s /= Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                        ar[c] = s;
                        c++;
                        break;
                    }
                }
            }
            catch (Exception e) {
                switch (expr.charAt(i)) {
                    case '+': {
                        int res=0;
                        for (int k : ar) {
                            res += k;
                        }
                        s = res;
                        break;
                    }
                    case '-':{
                        int res=0;
                        for (int k : ar) {
                            res = k - res;
                        }
                        s = res;
                        break;
                    }
                    case '*':{
                        int res=1;
                        for (int k : ar) {
                            res *= k;
                        }
                        s = res;
                        break;
                    }
                    case '/':{
                        int res=1;
                        for (int k : ar) {
                            res = k / res;
                        }
                        s = res;
                        break;
                    }
                }
            }
        }
        for (int f : ar){
            System.out.println(f);
        }
        return s;
    }

    public static int postFix2(String expr) {
        int s = 1;
        int x = 0;
        int z = 0;
        int finalRes = Integer.parseInt(expr.substring(0,1));
        expr = expr.replaceAll(" ","");
        for (int i = 0; i < expr.length(); i++) {
            switch (expr.charAt(i)) {
                case '+', '-', '*', '/' -> x++;
            }
        }
        int [] ar = new int[x];
        int c = 0;
        for (int i = 0;i < expr.length();i++){
            switch (expr.charAt(i)) {
                case '+', '-', '*', '/':{
                    if(expr.charAt(i) == '+' || expr.charAt(i) == '-'){
                        s = 0;
                    }
                    else {
                        s = 1;
                    }
                    for (int j = i-1; j >= 0; j--) {
                        if(expr.charAt(i - 1) == '+'||expr.charAt(i - 1) == '-'||expr.charAt(i-1) == '/'||expr.charAt(i-1) == '*'){
                            switch (expr.charAt(i)) {
                                case '+': {
                                    int res=0;
                                    for (int k : ar) {
                                        res += k;
                                    }
                                    z = res;
                                    break;
                                }
                                case '-':{
                                    int res=0;
                                    for (int k : ar) {
                                        res = k - res;
                                    }
                                    z = res;
                                    break;
                                }
                                case '*':{
                                    int res=1;
                                    for (int k = 0 ; k < ar.length-1 ; k++) {
                                        res *= ar[k];
                                    }
                                    z = res;
                                    break;
                                }
                                case '/':{
                                    int res=1;
                                    for (int k : ar) {
                                        res = k / res;
                                    }
                                    z = res;
                                    break;
                                }
                            }
                            return z;
                        }
                        else {
                            try {
                                switch (expr.charAt(i)) {
                                    case '+': {
                                        int y=0;
                                        s += Integer.parseInt(String.valueOf(expr.charAt(j)));
                                        break;
                                    }
                                    case '-': {
                                        s = Integer.parseInt(String.valueOf(expr.charAt(j))) - s;
                                        break;
                                    }
                                    case '*': {
                                        s *= Integer.parseInt(String.valueOf(expr.charAt(j)));
                                        break;
                                    }
                                    case '/': {
                                        s = Integer.parseInt(String.valueOf(expr.charAt(j))) / s;
                                        break;
                                    }
                                }
                            }
                            catch (Exception e ){
                                break;
                            }
                        }
                    }
                    ar[c] = s;
                    c++;
                    switch (expr.charAt(i)) {
                        case '+': {
                            finalRes += Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                            break;
                        }
                        case '-': {
                            finalRes -= Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                            break;
                        }
                        case '*': {
                            finalRes *= Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                            break;
                        }
                        case '/': {
                            finalRes /= Integer.parseInt(String.valueOf(expr.charAt(i - 1)));
                            break;
                        }
                    }
                }
            }
        }
        return finalRes;
    }

    public static int mySup(int num1 , int num2) {
        int a = num1;
        int b = num2;

        String bin2Split1 = "";
        String bin2Split2 = "";

        // نحول العددين لباينري
        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);

        int bin1Len = bin1.length();
        int bin2Len = bin2.length();

        long bin1Int = Long.parseLong(bin1);
        long bin2Int = Long.parseLong(bin2);

        if(bin1Int == bin2Int){
            return 0;
        }

        //هنا يشوف اذا العدد الاول اكبر من الثاني لانه لازم نعرف اذا الناتج راح يطلع بالسالب او لا
        // وكمان الاصغر راح يضيف له خانات بعدد خانات الاكبر عشان مايطلع ايرور اوت اوغ باوند بعدين
        else if (bin2Int < bin1Int) {
            for (int j = 0; j < (bin1.length() - bin2Len); j++) {
                bin2 = "0".concat(bin2);
            }
        }

        //هنا يشوف اذا العدد الاول اكبر من الثاني لانه لازم نعرف اذا الناتج راح يطلع بالسالب او لا
        // وكمان الاصغر راح يضيف له خانات بعدد خانات الاكبر عشان مايطلع ايرور اوت اوغ باوند بعدين
        else if (bin2Int > bin1Int) {
            for (int j = 0; j < (bin2.length() - bin1Len); j++) {
                bin1 = "0".concat(bin1);
            }
        }

        // هنا بنسوي التوز كومبليمنت راح نقسم الباينري الثاني قسمين الاول من البداية الين اول واحد يلقاه ونخزنه في فاريابل
        // الثاني من مابعد الواحد الى النهاية ونخزنه في فاريابل
        for (int i = bin2.length() - 1 ; i >= 0; i--) {
            if (bin2.charAt(i) == '1'){
                bin2Split1 = bin2.substring(0,i);
                bin2Split2 = bin2.substring(i,bin2.length());
                break;
            }
        }

        //هنا اخذنا الفاريابل الثاني(اللي فيه من مابعد الواحد الى النهاية) ونخزنه في مصفوفة
        char [] bin2Split1Arrey = bin2Split1.toCharArray();

        // هنا نطبق التوز كومبلمنت نحول كل واحد الى صفر وكل صفر الى واحد
        for (int i = 0; i < bin2Split1.length(); i++){
            if (bin2Split1.charAt(i) == '1'){
                bin2Split1Arrey[i] = '0';
            }
            else if (bin2Split1.charAt(i) == '0'){
                bin2Split1Arrey[i] = '1';
            }
        }

        // نحول المصفوفة لنص
        String bin2Split2Str = String.valueOf(bin2Split1Arrey);

        //هنا نجمع الجزء الاول(اللي من البداية الى اول واحد) مع النص اللي يحمل قيمة المصفوفة ونخزنه في متغير جديد
        // المتغير ذا فيه التوز كومبلمنت للباينري الثاني
        String bin2TowsComp = bin2Split2Str + bin2Split2;

        int bin2TowsCompLen = bin2TowsComp.length();

        // المتغير هذا هو اللي راح يحمل قيمة الجمع
        String result = "";
        int carry = 0;

        // بما ان الجمع في الباينري احتمالاته محدودة سويت الجمع بطريقة الاف ستيتمنت بس النص راح يطلع عكس ف لازم نعكسه بعدين
        for (int i = bin1.length() - 1; i >= 0;i--){

            if (bin1.charAt(i) != bin2TowsComp.charAt(i) && carry == 0){
                result = result.concat("1");
            }

            else if (bin1.charAt(i) != bin2TowsComp.charAt(i) && carry == 1){
                result = result.concat("0");
            }

            else if (bin1.charAt(i) == '1' && bin2TowsComp.charAt(i) == '1' && carry == 0){
                result = result.concat("0");
                carry = 1;
            }

            else if (bin1.charAt(i) == '1' && bin2TowsComp.charAt(i) == '1' && carry == 1){
                result = result.concat("1");
            }

            else if (bin1.charAt(i) == '0' && bin2TowsComp.charAt(i) == '0' && carry == 0){
                result = result.concat("0");
            }

            else if (bin1.charAt(i) == '0' && bin2TowsComp.charAt(i) == '0' && carry == 1){
                result = result.concat("1");
                carry = 0;
            }
        }

        //  نعكس النص ونخزنه في متغير جديد نوعه سترينق بولدر
        StringBuilder finalResult = new StringBuilder(result).reverse();

        // نحول المتغير اللي نوعه سترينق بولدر لنص
        String finalResultStr = finalResult.toString();

        /* اذا كان العدد الثاني اكبر من الاول (يعني الناتج راح يطلع بالسالب) راح ناخذ الناتج ونجيب التوز كومبلمنت
         له مره ثانيه وبعدين نرجعه ديسيمال ونضرب الناتج في سالب واحد عشان يطلع سالب */
        if (bin2Int > bin1Int){

            String resprt1 = "";
            String resprt2 = "";

            for (int i = finalResultStr.length() - 1 ; i >= 0; i--) {
                if (finalResultStr.charAt(i) == '1'){
                    resprt1 = finalResultStr.substring(0,i);
                    resprt2 = finalResultStr.substring(i,finalResultStr.length());
                    break;
                }
            }
            char [] resRevArray = resprt1.toCharArray();

            for (int i = 0; i < resprt1.length(); i++){
                if (resprt1.charAt(i) == '1'){
                    resRevArray[i] = '0';
                }
                else if (resprt1.charAt(i) == '0'){
                    resRevArray[i] = '1';
                }
            }

            String resRevStrNew = String.valueOf(resRevArray);
            String resultTowComp = resRevStrNew+resprt2;

            int binFinalResult = Integer.valueOf(resultTowComp, 2);
            return (binFinalResult * -1);
        }

        // هنا اذا كان العدد الاول اكبر من الثاني راح يطلع في الناتج خانه زايده نحذفها
        // يسمونها اوفر مدري وش المهم وبعدين نرجعه ديسيمال وخلاص
        else {

            if (bin2TowsCompLen < bin1.length()) {
                finalResultStr = finalResultStr.substring(result.length() - bin2TowsCompLen, result.length());
            }

            int binFinalResult = Integer.valueOf(finalResultStr, 2);

            return binFinalResult;

        }
    }



}
