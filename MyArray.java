package TH1;

import java.util.HashSet;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	/**
	 * neu trong mirror co static thi se khong dung duoc int[] array input: [1, 2,
	 * 3]
	 * 
	 * @return [1, 2, 3, 3, 2, 1]
	 */
	public int[] mirror() {
		// mang luu tru ket qua tra ve la bang array*2
		int[] result = new int[this.array.length * 2];

		for (int i = 0; i < array.length; i++) {
			// lay result vi tri i gan bang array vi tri i
			result[i] = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			result[array.length * 2 - i - 1] = array[i];
		}
		return result;
	}

	// dung mang tam
	public int[] removeDuplicates(int n) {
		int[] result = new int[array.length];
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[j++] = array[i];
			}
		}
		temp[j++] = array[n - 1];

		for (int i = 0; i < j; i++) {
			array[i] = temp[i];
		}
		return result;
	}

	// Task 1_2
	// Input: 10 11 12 13 14 16 17 19 20
	// Output: 15 18
	public int[] getMissingValues() {
		// Tạo một mảng để lưu trữ các giá trị thiếu.
		int[] missingValues = new int[array.length];

		// Đếm số lượng giá trị thiếu.
		int missingCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i) {
				missingCount++;
			}
		}

		// Lưu trữ các giá trị thiếu vào mảng.
		int[] missingValues = new int[missingCount];
		int missingIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i) {
				missingValues[missingIndex++] = i;
			}
		}

		// Trả về mảng các giá trị thiếu.
		return missingValues;
	}

	public int[] fillMissingValues(int k) {
		// Tạo một mảng mới để lưu trữ kết quả.
		int[] result = new int[array.length];

		// Đếm số lượng giá trị thiếu.
		int missingCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1) {
				missingCount++;
			}
		}

		// Kiểm tra xem số lượng giá trị thiếu có vượt quá k hay không.
		if (missingCount > k) {
			return null;
		}

		// Lưu trữ các giá trị thiếu vào mảng mới.
		int missingIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1) {
				result[i] = array[i];
			} else {
				// Chèn giá trị thiếu tiếp theo vào mảng mới.
				result[i] = array[missingIndex++];
			}
		}

		// Trả về mảng mới.
		return result;
	}

	public static void main(String[] args) {
		// int[] array = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		// Trả về mảng các giá trị thiếu.
		// int[] missingValues = getMissingValues(array);
		// In mảng các giá trị thiếu.
		// for (int i = 0; i < missingValues.length; i++) {
		// System.out.println(missingValues[i]);
		int[] array = { 10, 11, 12, -1, 14, 10, 17, 19, 20 };

		// Điền các giá trị thiếu vào mảng, với k = 3.
		int[] result = fillMissingValues(3);

		// In mảng kết quả.
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
