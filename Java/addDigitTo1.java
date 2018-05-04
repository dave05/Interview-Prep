public sumUpToOne(int n)
{
  while(n/10!=0)
  {
    int temp = n;
    int sum =0;
    while (temp/10!=0){
      sum +=temp%10;
      temp /=10;
    }
    n=sum;
  }
}
