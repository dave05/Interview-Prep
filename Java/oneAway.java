public boolean oneAway(String s1, String s2)
{
  if (s1.equals(s2))
  {
    return true;
  }
  else
  {
    if (sl.length()==s2.length())
    {
      return isOneReplace(s1,s2);
    }
    else
    if (abs(sl.length()-s2.lenght())==1)
    {
      if s1.length()>s2.length()
      {
        return isOneRemove(s1,s2);
      }
      else  {
          return isOneRemove(s2,s1)
        }
      }
      else
      {
        return false;
      }
    }
  }

public boolean isOneReplace(String s1, String s2)
{
  int offs = 0;
  for (int i = 0; i<s1.lenght();i++)
  {
    if(s1.charAt(i)!=s2.charAt(i))
    {
      offs++;
    }
  }
  return offs <=1;
}
public boolean isOneRemove(String s1,String s2)
{
  int offs=0;
  for(int i=0;i<s2.length();i++)
  {
    if(s1.charAt(i)!=s2.charAt(i))
    {
      offs++;
    }
  }
  return offs==0;
}
