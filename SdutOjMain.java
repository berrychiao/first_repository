import java.util.Scanner;

public class SdutOjMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] strs = temp.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=1;i< strs.length;i++){
            if(i == strs.length-1){
                char[] a = strs[i].toCharArray();
                for(int j=0;j<a.length-1;j++){
                    sb.append(a[j]);
                }
            }else {
                sb.append(strs[i]+" ");
            }
        }
        if(strs[0].equals("What")){
            System.out.println(sb.toString() + " is Genshin Impact!");
        }else if(strs[0].equals("Why")){
            System.out.println("Because "+sb.toString() + " not as good as Genshin Impact!");
        }else if(strs[0].equals("Where")){
            System.out.println(sb.toString() + " is in Genshin Impact!");
        }else if(strs[0].equals("When")){
            System.out.println(sb.toString() + ", it's time to start Genshin Impact!");
        }else if(strs[0].equals("Who")){
            System.out.println(sb.toString() + " names Genshin Impact!");
        }else if(strs[0].equals("How")){
            System.out.println(sb.toString() + " need to start Genshin Impact!");
        }
    }
}
