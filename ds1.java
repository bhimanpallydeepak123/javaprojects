class increment
{
public static void main(String[] args)
{
int[] arr={1,2,3,4,5};
int n =arr.length;
System.out.println("the original array is:");
for(i=0;i<n;++i)
System.out.println(arr[i]+" ");
last = arr[n-1];
for (i = n-1; i > 0; i--)
arr[i] = arr[i-1];
arr[0] = last;
System.out.println("the rotated array is:");
for(i=0;i<n;++i)
System.out.println(arr[i]+" ");
}
}

