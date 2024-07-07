/*
 * 整数によって構成される intArr が与えられるので、最小値が先頭に配置される最小ヒープを表す配列を返す、buildMinHeap という関数を作成してください。
 */
public class Problem217 {
	public static int[] buildMinHeap(int[] arr){
		int n = arr.length;

		// ヒープ配列の中央から開始し、すべてのノードを下方向に maxHeapify します。
		for (int i = n / 2 - 1; i >= 0; i--) {
			minHeapify(arr, n - 1, i);
		}
		return arr;
	}

	public static void minHeapify(int[] arr, int heapEnd, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		// 左の子と比較し、最大値を更新します。
		if (left <= heapEnd && arr[left] < arr[largest]) {
			largest = left;
		}

		// 右の子と比較し、最大値を更新します。
		if (right <= heapEnd && arr[right] < arr[largest]) {
			largest = right;
		}

		// 親ノードが最大でない場合、子ノードと交換し、再帰的に minHeapify を呼び出します。
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			minHeapify(arr, heapEnd, largest);
		}
	}
}
