import java.util.Arrays;

public class Problem452 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue(new int[] { 2, 3, 43, 2, 53, 6, 75, 10 });
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
		System.out.println(pq.pop());
	}
}

/** 
 * 優先度付きキューを最大ヒープで実装
 */
class PriorityQueue {
	public static int[] maxHeap = null;

	public PriorityQueue(int[] maxHeap) {
		// 配列は参照型なのでディープコピーして元の配列の変更を防ぐ。
		this.maxHeap = maxHeap.clone();
		buildMaxHeap(maxHeap);
	}

	/** 
	* 配列のとある要素に対する最大ヒープ化を実施
	* もしも交換する要素があればその交換された別ノードについても同様に最大ヒープ化して
	* 移動するノードがなくなるまで見ていく
	*/
	public static void buildMaxHeapIndex(int[] input, int index) {
		int indexLeftChild = left(index);
		int indexRightChild = right(index);

		// leftとrightが両方ともある場合
		if (indexRightChild <= input.length - 1) {
			if (maxHeap[index] < Math.max(maxHeap[indexLeftChild], maxHeap[indexRightChild])) {
				int temp = maxHeap[index];
				if (maxHeap[indexLeftChild] > maxHeap[indexRightChild]) {
					maxHeap[index] = maxHeap[indexLeftChild];
					maxHeap[indexLeftChild] = temp;
					buildMaxHeapIndex(maxHeap, indexLeftChild);
				} else {
					maxHeap[index] = maxHeap[indexRightChild];
					maxHeap[indexRightChild] = temp;
					buildMaxHeapIndex(maxHeap, indexRightChild);
				}
			}
		}
		// leftにのみ要素がある場合
		if (indexLeftChild <= maxHeap.length - 1 && indexRightChild > maxHeap.length - 1) {
			// もしも子ノードのほうが大きかったら入れ替えて終わり。
			if (maxHeap[index] < maxHeap[indexLeftChild]) {
				int temp = maxHeap[index];
				maxHeap[index] = maxHeap[indexLeftChild];
				maxHeap[indexLeftChild] = temp;
				buildMaxHeapIndex(maxHeap, indexLeftChild);
			}
		}
		// rightにのみ要素がある場合→これは2分木の構造上あり得ないので無視しておｋ。
		// leftとrightが両方ともない場合→これは無視しておｋ。というか何も操作する必要ない。
	}

	// 実際には配列の高々半分まで見れれば問題なし。それ以降は根ノードだし。
	// だけどfor文のループを半分にしたところで時間計算量は同じだし、一見みたら「なんで/2」と
	// なってしまうので書かないほうが無難。
	public static void buildMaxHeap(int[] input) {
		for (int i = input.length - 1; i >= 0; i--) {
			buildMaxHeapIndex(input, i);
		}
	}

	public Integer pop() {
		if (maxHeap.length > 0) {
			// これおかしいわ。最初に結果変数を用意して限られた範囲で最大ヒープ化が正しい。
			// でよく見たら結果の配列がおかしいことになってるので最大ヒープ化がうまくいってない
			// 上記事象は解決済み。
			int result = maxHeap[0];
			maxHeap = Arrays.copyOfRange(maxHeap, 1, maxHeap.length);
			buildMaxHeap(maxHeap);
			return Integer.valueOf(result);
		}
		return 0;
	}

	public static int left(int i) {
		return 2 * i + 1;
	}

	public static int right(int i) {
		return 2 * i + 2;
	}
}