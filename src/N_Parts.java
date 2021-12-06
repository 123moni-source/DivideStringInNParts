public class N_Parts {
    public static void main(String[] args) {
        String str="aanbvcccgfhhhjk";
        int l=str.length();//for storing the length of a string.
        //n determines the variable that divide the string in 'n' equal parts
        int n=3;
        int temp=0,c=l/n;
        String[] s1=new String [n];
        if(l%n!=0){
            System.out.println("this string cannot be divided into "+ n +" equal parts.");
        }
        else{
            for(int i=0;i<l;i=i+c) {
                String s2=str.substring(i, i+c);
                s1[temp]=s2;
                temp++;
            }
            System.out.println(n + " equal parts of given string are ");
            for(int i=0;i<s1.length;i++) {
                System.out.println(s1[i]);
            }
        }
    }
}
