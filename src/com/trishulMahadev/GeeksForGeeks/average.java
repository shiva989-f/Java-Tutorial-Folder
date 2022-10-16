class average{
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,345,234,2342,546,233,67,23};
		int add = 0;
		System.out.println(add);
		System.out.println(arr.length);

		String S = String.valueOf(add);
		System.out.println(S);
        float average = 0;
        
        for(int a : arr){
            add += a;
        }
        
        average = (float) (add*1.0/arr.length);
        String avg = String.format("%.2f", average);
        
        System.out.println(average);
        System.out.println(avg);

	}
}