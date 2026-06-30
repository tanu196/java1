
public class Ens52_challenge1 {

	public static void main(String[] args) {
		double[] heights = {170.5, 165.2, 180.1, 155.8, 172.0}; 
		
		System.out.println("――ソート前ーー");
		for(int i = 0 ; i <heights.length ; i++) {
			System.out.print(heights[i] + " ");
		}
		System.out.println();
		
		for(int i = 0 ; i < heights.length-1 ; i++) {
			int minIndex = i;
			for(int j = i ; j < heights.length ; j++) {
				if(heights[j] < heights[minIndex]) {
					minIndex = j;
				}
			}
			
			double temp = heights[i];
			heights[i] = heights[minIndex];
			heights[minIndex] = temp;
		}
		System.out.println("――ソート後（昇順）ーー");
		for(int i = 0 ; i <heights.length ; i++) {
			System.out.print(heights[i] + " ");
		}
		System.out.println();
		
		
		for(int i = 0 ; i < heights.length-1 ; i++) {
			int maxIndex = i;
			for(int j = i ; j < heights.length ; j++) {
				if(heights[j] > heights[maxIndex]) {
					maxIndex = j;
				}
			}
			
			double temp = heights[i];
			heights[i] = heights[maxIndex];
			heights[maxIndex] = temp;
		}
		System.out.println("――ソート後（降順）ーー");
		for(int i = 0 ; i <heights.length ; i++) {
			System.out.print(heights[i] + " ");
		}
	}

}
