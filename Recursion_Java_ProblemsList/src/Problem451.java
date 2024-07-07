import java.util.Arrays;

/*
 * PriorityQueue クラスの作成：
 * 
 * array maxHeap
 * PriorityQueue クラスを作成し、最大ヒープを動的配列で管理します。
 * この動的配列 maxHeap は、優先度付きキューの要素を保持します。
 * コンストラクタでは、入力として与えられた配列 arr のディープコピーを作成し、元の配列の変更を防ぎつつ、
 * HeapLibrary の buildMaxHeap 関数を使用して、このコピーを最大ヒープに変換します。
 * 
 * int top()
 * 最大ヒープの最大値を返します。
 * 
 * pq1 = new PriorityQueue([2,3,43,2,53,6,75,10])
 * pq1.top() --> 75
 * 
 * pq2 = new PriorityQueue([3,12,0,2,9,1,65,32])
 * pq2.top() --> 65
 * 
 * pq3 = new PriorityQueue([1,2,3,4,8,2,1,9,7,3,4])
 * pq3.top() --> 9
 * 
 */
public class Problem451 {
	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue(new int[] { 2, 3, 43, 2, 53, 6, 75, 10 });
		System.out.println(pq1.top());
		PriorityQueue pq2 = new PriorityQueue(new int[] { 3, 12, 0, 2, 9, 1, 65, 32 });
		System.out.println(pq2.top());
		PriorityQueue pq3 = new PriorityQueue(new int[] { 1, 2, 3, 4, 8, 2, 1, 9, 7, 3, 4 });
		System.out.println(pq3.top());
	}
}

class PriorityQueue {
	public static int[] maxHeap = null;

	public PriorityQueue(int[] maxHeap) {
		// ディープコピーして元の配列の変更を防ぐ。配列は参照型なので。
		this.maxHeap = maxHeap.clone();
		buildMaxHeap(maxHeap);
	}

	// 実際には配列の高々半分まで見れれば問題なし。それ以降は根ノードだし。
	// だけどfor文のループを半分にしたところで時間計算量は同じだし、一見みたら「なんで/2」と
	// なってしまうので書かないほうが無難。
	public static void buildMaxHeap(int[] input) {
		for (int i = input.length - 1; i >= 0; i--) {
			buildMaxHeapIndex(input, i);
		}
	}

	public static void buildMaxHeapIndex(int[] input, int index) {
		int indexLeftChild = left(index);
		int indexRightChild = right(index);

		// leftとrightが両方ともある場合
		if (indexRightChild <= input.length - 1) {
			if (maxHeap[index] < maxHeap[indexLeftChild] || maxHeap[index] < maxHeap[indexRightChild]) {
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
	}

	public int top() {
		if (maxHeap.length > 0) {
			// これおかしいわ。最初に結果変数を用意して限られた範囲で最大ヒープ化が正しい。
			// でよく見たら結果の配列がおかしいことになってるので最大ヒープ化がうまくいってない
			int result = maxHeap[0];
			maxHeap = Arrays.copyOfRange(maxHeap, 1, maxHeap.length);
			buildMaxHeap(maxHeap);
			return result;
		}
		return 0;
	}

	public static int left(int i) {
		return 2 * i + 1;
	}

	public static int right(int i) {
		return 2 * i + 2;
	}

	public static int parent(int i) {
		if (i % 2 == 0)
			return i / 2 - 1;
		return i / 2;
	}
}