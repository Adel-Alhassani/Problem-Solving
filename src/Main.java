import coder_hub.CoderHubEasy;
import coder_hub.CoderHubHard;
import coder_hub.CoderHubMedium;

public class Main {
    public static void main(String[] args) {
//                testPrint();
        String [] arr = new String[] { "A", "B"};

        System.out.println(CoderHubMedium.str_len_comparison(arr));
    }

    static void  testPrint (){
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("abcd","efgh","aebfcgdh"));
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("wxyz","mnop","wmxynzop"));
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("1234","5678","15263748"));
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("qazx","swed","qsawzxed"));

        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("abcd","efgh","aebcfhdg"));
        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("mnop","qrst","mqrnpots"));
        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("1234","5678","12653478"));
        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("abcd","wxyz","awbcxdzy"));

        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("rtyh","mnup","rmntyuhp"));
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("xzaq","plwe","xpzlwaqe"));
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("bnmk","yutg","bynutmgk"));

        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("qwer","tyui","qwetyrui"));
        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("abcd","efgh","aebcfhdg"));

        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("r","fa","raf"));
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("wysn","showus","shwysowuns"));
        System.out.println("suppose to be true: "+CoderHubHard.isInterleave("hsbxib","ywssg","hsywbxsisgb"));
        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("zh2g","wts","shwt2gs"));
        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("hsyhag","2b12","hsy2bhag1"));
        System.out.println("suppose to be false: "+CoderHubHard.isInterleave("USfMSU","5YgZ9N5mR6ppfggzbzh7HTox85MwFtaIQDHfzJW8vc2G","5YgUSZf9NM5SmR6Uppfggzbzh7HTox84MwFtaIQDHfzJW8vc2G"));
    }
}
