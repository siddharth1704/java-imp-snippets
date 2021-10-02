public class StringPalin extends TestString {

    @Override
    void palindrome() {
        boolean f=true;
       for(int i=0;i<str.length()/2;i++){
           if(str.charAt(i)!=str.charAt(str.length()-i-1))
           {
               System.out.println("Not a palindrone");
               f=false;
               break;
           }
       }
       if(f)
           System.out.println("Palindrome");
    }

    @Override
    void show() {
        System.out.println("The Value of String is"+str);
    }

    public static void main(String[] args) {
        StringPalin stringPalin=new StringPalin();
        stringPalin.inputString();
        stringPalin.palindrome();
        stringPalin.show();
    }
}
