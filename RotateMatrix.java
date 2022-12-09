package tranning;

public class RotateMatrix {

	public void rotateMatrix90(int[][] matrix) {
		int row = 0;
		int col = 0;
		int len = matrix.length - 1;
		int temp = matrix[row][col];

		while (row < len / 2+1) {
			while (col < len-row) {
				temp = matrix[row][col];
				matrix[row][col] = matrix[len - col][row];
				matrix[len - col][row] = matrix[len - row][len - col];
				matrix[len - row][len - col] = matrix[col][len - row];
				matrix[col][len - row] = temp;
				col++;
			}
			row++;
			col = row;
		}

	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		RotateMatrix rm = new RotateMatrix();
		rm.rotateMatrix90(matrix);

		for (int[] i : matrix) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
