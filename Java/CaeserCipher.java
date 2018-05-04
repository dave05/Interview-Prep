class CaserCipher
{
  public static String encrypt(String s)
  {
    if (s.isEmpty())
    {
      throw new IllegalArgumentException("Empty String");
    }
    if(s.contains(":"))
    {
    if(!s.contains(":")||!Character.isDigit(s.subString(0,s.indexOf(":"))))
    {
      throw new IllegalArgumentException("Invalid Format");
    }
    int shift = s.subString(0,s.indexOf(":"));
    String s1 = s.subString(s.indexOf(":")+1, s.length());
    StringBuilder newString = new StringBuilder();

    for (int i = 0; i<s1.length();i++)
    {
      if (Character.isDigit(s1.charAt(i)))
      {
        newString.append((( int)s1.charAt(i)+shift)%10);
      }
      else
      {
        if (Character.isUpperCase(s1.charAt(i)))
        {
          int temp = int(s1.charAt(i))
          char ency =(char)(((temp-65)%26)+65)
          newString.append(ency);
        }
        else
        {
          int temp = int(s1.charAt(i))
          char ency =(char)(((temp-97)%26)+97)
          newString.append(ency);
        }
      }
    }

  }
}
