import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        fillRandomColors(colors);
        printMatrix(colors);
        System.out.println();
        int[][] rotatedColors = getRotatedMatrix90(colors);
        printMatrix(rotatedColors);

    }

    public static void fillRandomColors(int[][] colors) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] getRotatedMatrix90(int[][] matrix) {
        int[][] rotatedMatrix = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedMatrix[i][j] = matrix[SIZE - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }
}
