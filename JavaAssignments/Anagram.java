static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        int len = a.length();
        int len1 = b.length();
        if(len >50 || len1>50)
            return false;
        int i,pos1,pos,flag;
        char ch1,ch;
        flag = 0;
        
        if(len!=len1)
            {
            
           return false;
        }
        
        int count[]=new int[26];
        int count1[]=new int[26];
        a= a.toLowerCase();
        b =b.toLowerCase();
        for (i = 0;i<26;i++)
        {
            count[i]=0;
            count1[i]=0;
        }
        for(i=0;i<len;i++)
        {
            ch = a.charAt(i);
            ch1 = b.charAt(i);
            pos = (int)ch - 97;
            pos1 = (int)ch1 - 97;
            count[pos]=count[pos]+1;
            count1[pos1]=count1[pos1]+1;
        }
        for (i=0;i<26;i++)
        {
            if(count[i]!=count1[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
        
    }