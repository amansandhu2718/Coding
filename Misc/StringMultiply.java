public class StringMultiply {
    public static void main(String[] args) {
        String a="123456789";
        String b="98";

        int carry=0;
        int mul1=1;
        int sum1=0;
        for(int i=b.length()-1;i>=0;i--){
            carry=0;
            int mul2=1;
            int sum2=0;
            int ch1 = b.charAt(i)-'0';
            for (int j =  a.length()-1; j>=0 ; j--) {
                int ch2 = a.charAt(j)-'0';
                int res=ch1*ch2+carry;
                if(res>9){
                    
                    if(j==0){

                    }else{
                        carry=res/10;
                    }
                }else{
                    carry=0;
                }
                if(j!=0){
                    res=res%10;
                }
                sum2=sum2+(res)*mul2;
                mul2=mul2*10;
            }
            System.out.println(sum2);
            sum1=sum1+(sum2)*mul1;
            
            mul1=mul1*10;
        }
        System.out.println("res:"+sum1);

    }

}
