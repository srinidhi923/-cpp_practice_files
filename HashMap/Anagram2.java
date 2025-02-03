import java.util.*;
class Anagram2
{
    public static boolean fun(HashMap<Character,Integer> hms,HashMap<Character,Integer> hmp)
    {
        if(hms.size()!=hmp.size())
        {
            return false;
        }
        for(char key:hms.keySet())
        {
            if(!hmp.containsKey(key))
            {
                return false;
            }
            int a=hms.get(key);
            int b=hmp.get(key);
            if(a!=b)
            {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args)
    {
        String s="bcaebabacd";
        String p="abc";
        int k=p.length();
        int l=0;
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer> hmp=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            char ch1=p.charAt(i);
            hmp.put(ch1,hmp.getOrDefault(ch1,0)+1);
        }
        
        HashMap<Character,Integer> hms=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            char ch2=s.charAt(r);
            hms.put(ch2,hms.getOrDefault(ch2,0)+1);
            
            while(r-l==k)
            {
                char chl=s.charAt(l);
                hms.put(chl,hms.get(chl)-1);
                if(hms.get(chl)==0)
                {
                    hms.remove(chl);
                }
                l++;
            }
            if(r-l+1==k)
            {
                boolean valid=fun(hms,hmp);
                if(valid)
                {
                    ans.add(l);
                }
            }
        }
        System.out.println(ans);
    }
}
