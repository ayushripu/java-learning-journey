package sort;

public class SelectionSort {

//	public static void print(int arr[])
//	{
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			System.out.println(arr[i] + " ");
//		}
//		System.out.println();
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,8,3,1,2};
		int n=5;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			int smallest=arr[i];
//			for(int j=i+1; j<arr.length-1;j++)
//			{
//				if(smallest >= arr[j])
//				{
//					int temp = smallest;
//					smallest = arr[j];
//					arr[j]=temp;
//					
//				}
//			}
			
//		}
//		for(int i=0;i<n;i++)
//		{
////			System.out.println(i);
//			for(int j=i+1;j<n;j++)
//			{
//				if(arr[i]<=arr[j])
//				{
//					int  t=arr[i];
//					arr[i]=arr[j];
//					arr[j]=t;
//				}
//			}
//		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]);
//		}
//		print(arr);
		System.out.println("before sorting");
		for(int  i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
//		soting 
		for(int i=0;i<n;i++)
		{
			int minidx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[minidx]>arr[j])
				{
					minidx=j;
				}
			}
			int t=arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=t;
		}
		System.out.println("after sorting");
		for(int  i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
