package kro.ex01;

public class HeapSize {

	public static void main(String[] args) {
        long heapSize = Runtime.getRuntime().totalMemory();

        System.out.println("Heap Size : " + heapSize);

        System.out.println("Heap Size(M) : " + heapSize / (1024 * 1024) + " MB");

	}

}
