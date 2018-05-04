public String longestSubSequence(String[] words, String s)
{
  int maxLen=0;
  int maxIndex=-1;
  for (int i= 0 ; i<words.length;i++)
  {
    int seqLen = longestSubSequence(words[i],s);
    if(seqLen>maxLen)
    {
     maxIndex=i;
      maxLen=seqLen;
    }
  }
  return words[maxIndex];


}
private int longestSubSequence(String s, String t)
{
  for(int i=0,int j =0; i<s.length();i++)
  {
  if(((t.subString(j)).contains(s.charAt(i))))
  {
    j=t.indexOf(s.charAt(i))+1
  }
  else
  {
    return -1
  }

  }
  return s.length()
}
