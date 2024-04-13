class Example {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int n = arr.length;
      int last,i;
      System.out.print("The original array is: ");
      for (i = 0; i < n; ++i)
      System.out.println(arr[i]+" ");
      last = arr[n-1];
      for (i = n-1; i > 0; i--)
      arr[i] = arr[i-1];
      arr[0] = last;
      System.out.print("The rotated Array is: ");
            System.out.println(arr[i]+" ");
   }
}