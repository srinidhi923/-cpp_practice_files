class HelloWorld {
    public static void main(String[] args) {
        String s="madam";
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ans=ans  +  s.charAt(i);
        }
        if(ans.equals(s))
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
        System.out.println(ans);
    }
}
