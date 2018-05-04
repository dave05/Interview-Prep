public String stringComp(String s)
{
  //int originalLen = s.length();
  //int compLen = 0;
  if(s.isEmpty())
  {
    return s;
  }
  int runs = 1;
  char current = s.charAt(0);
  StringBuilder comp = new stringBuilder();
  for (int i =1; i < s.length(); i++)
  {
    if(current=s.charAt(i) )
    {
      runs++;
    }
    else
    {

      comp.append(current);
      comp.append(runs);
      current=s.chatAt(i);
      runs=1;
    }

    if (comp.length()<s.length)
    {
      return s;
    }

  }
comp.append(s.charAt(i));
comp.append(runs);
if (comp.length()<s.length)
{
  return s;
}
return comp;
}
