package home.Practice;

class CompressString {
    public static void main(String[] args) {
        String str = "dine   sh";
        int n = str.length();
        int count = 1;
        for(int i=1; i<n; i++){
            if(str.charAt(i) != str.charAt(i-1)){
                System.out.print(str.charAt(i-1) + "" + (count));
                count=1;
            }
            else{
                count++;
            }
        }
        System.out.print(str.charAt(n-1)+""+(count));
    }
    private static String hexValue(int num){
        String[] hexarr = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        StringBuffer  s1 = new StringBuffer();
        while(num != 0){
            s1.append(hexarr[num%16]);
            num = num/16;
        }
        return s1.reverse().toString();
    }
    private static String octValue(int num){
        StringBuffer s1 = new StringBuffer();
        while(num != 0){
            s1.append(num%8);
            num = num/8;
        }
        return s1.reverse().toString();
    }
}