public boolean isInDict(String s)
{
  Set<String> dictionary = new HashSet<>({...});
  if (s.isEmpty && s==null)
  {
    throw new IllegalArgumentException(" Ivalid Input");

  }
  int wStart=0;
  int wEnd=0;
  for (int i =0 ; i<s.length(); i++)
  {
    wEnd =i;
    if(dictionary.contains(s.subString(wStart,wEnd)))
    {
      wStart=i+1;
      return true && isInDict(s.subString(wStart,s.length()));
    }
  }
  if(wEnd==s.length-1)
  {
    return false;
  }


}
