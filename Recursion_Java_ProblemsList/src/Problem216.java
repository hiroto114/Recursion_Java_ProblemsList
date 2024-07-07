/*
 * 整数によって構成される intArr が与えられるので、
 * 最大値が先頭に配置される最大ヒープを表す配列を返す、buildMaxHeap という関数を作成してください。
 * 
 * buildMaxHeap([1,2,3]) --> [3,2,1]
 * buildMaxHeap([-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10]) --> [10,7,9,5,6,8,3,4,0,-2,1,-3,2,-1]
 * buildMaxHeap([7,8,2,3,1,4,3,2]) --> [8,7,4,3,1,2,3,2]
 * buildMaxHeap([8,4,13,10,18]) --> [18,10,13,8,4]
 * buildMaxHeap([3,100,201,56,8,591,985,291]) --> [985,291,591,100,8,3,201,56]
 * buildMaxHeap([879,487,98,397,610,150,474,977,404,478,623,554,306]) --> [977,879,554,487,623,306,474,397,404,478,610,150,98]
 * 
 */
public class Problem216 {
	public static int[] buildMaxHeap(int[] arr){
		int n = arr.length;

		// ヒープ配列の中央から開始し、すべてのノードを下方向に maxHeapify します。
		for (int i = n / 2 - 1; i >= 0; i--) {
			maxHeapify(arr, n - 1, i);
		}
		return arr;
	}

	public static void maxHeapify(int[] arr, int heapEnd, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		// 左の子と比較し、最大値を更新します。
		if (left <= heapEnd && arr[left] > arr[largest]) {
			largest = left;
		}

		// 右の子と比較し、最大値を更新します。
		if (right <= heapEnd && arr[right] > arr[largest]) {
			largest = right;
		}

		// 親ノードが最大でない場合、子ノードと交換し、再帰的に maxHeapify を呼び出します。
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			maxHeapify(arr, heapEnd, largest);
		}
	}
}
