
import java.util.Map;
public int longestSubString(String s)
{
  if (s.isEmpty())
  {
    throw new IllegalArgumentException("Empty Input");
  }
  Map<Character,Integer> visted = new HashMap<>();
  int runs=0;
  int start=0;
  for (int i = 0; i< s.lenghth(); i++)
  {
    if(visted.containsKey(s.charAt(i)))
    {
      start= Math.max(visted.get(s.charAt(i))),start);
    }
      runs=Math.max(runs,i-start+1);
      visted.put(s.charAt(i),i+1) ;
      }


  return runs;
}
