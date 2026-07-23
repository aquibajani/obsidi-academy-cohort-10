package com.bptn.course.day_12;

public class SortingExample {
	
	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};
//		selectionSort(arr);
//		insertionSort(arr);
		bubbleSort(arr);
		System.out.println("Sorted array: ");
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static void selectionSort(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		
		// Visualizer link - https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=%0Apublic+class+SortingExample+%7B%0A%09%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09int%5B%5D+arr+%3D+%7B64,+25,+12,+22,+11%7D%3B%0A%09%09selectionSort(arr)%3B%0A%09%09System.out.println(%22Sorted+array%3A+%22)%3B%0A%09%09printArray(arr)%3B%0A%09%7D%0A%0A%09public+static+void+selectionSort(int%5B%5D+arr)+%7B%0A%09%09//+Time+complexity%3A+O(n%5E2)%0A%09%09//+Space+complexity%3A+O(1)%0A%09%09%0A%09%09int+n+%3D+arr.length%3B%0A%0A%09%09for+(int+i+%3D+0%3B+i+%3C+n+-+1%3B+i%2B%2B)+%7B%0A%09%09%09int+minIndex+%3D+i%3B%0A%09%09%09for+(int+j+%3D+i+%2B+1%3B+j+%3C+n%3B+j%2B%2B)+%7B%0A%09%09%09%09if+(arr%5Bj%5D+%3C+arr%5BminIndex%5D)+%7B%0A%09%09%09%09%09minIndex+%3D+j%3B%0A%09%09%09%09%7D%0A%09%09%09%7D%0A%09%09%09//+Swap+the+found+minimum+element+with+the+first+element%0A%09%09%09int+temp+%3D+arr%5BminIndex%5D%3B%0A%09%09%09arr%5BminIndex%5D+%3D+arr%5Bi%5D%3B%0A%09%09%09arr%5Bi%5D+%3D+temp%3B%0A%09%09%7D%0A%09%7D%0A%0A%09public+static+void+printArray(int%5B%5D+arr)+%7B%0A%09%09for+(int+value+%3A+arr)+%7B%0A%09%09%09System.out.print(value+%2B+%22+%22)%3B%0A%09%09%7D%0A%09%09System.out.println()%3B%0A%09%7D%0A%7D%0A&mode=display&curInstr=94
		
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the found minimum element with the first element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void insertionSort(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		
		// Visualizer link - https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=%0A%0Apublic+class+SortingExample+%7B%0A%09%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09int%5B%5D+arr+%3D+%7B64,+25,+12,+22,+11%7D%3B%0A//%09%09selectionSort(arr)%3B%0A%09%09insertionSort(arr)%3B%0A%09%09System.out.println(%22Sorted+array%3A+%22)%3B%0A%09%09printArray(arr)%3B%0A%09%7D%0A%09%0A%09public+static+void+printArray(int%5B%5D+arr)+%7B%0A%09%09for+(int+value+%3A+arr)+%7B%0A%09%09%09System.out.print(value+%2B+%22+%22)%3B%0A%09%09%7D%0A%09%09System.out.println()%3B%0A%09%7D%0A%0A%09%0A%09public+static+void+insertionSort(int%5B%5D+arr)+%7B%0A%09%09//+Time+complexity%3A+O(n%5E2)%0A%09%09//+Space+complexity%3A+O(1)%0A%09%09%0A%09%09int+n+%3D+arr.length%3B%0A%09%09for+(int+i+%3D+1%3B+i+%3C+n%3B+%2B%2Bi)+%7B%0A%09%09%09int+key+%3D+arr%5Bi%5D%3B%0A%09%09%09int+j+%3D+i+-+1%3B%0A%0A%09%09%09//+Move+elements+of+arr%5B0..i-1%5D,+that+are+greater+than+key,%0A%09%09%09//+to+one+position+ahead+of+their+current+position%0A%09%09%09while+(j+%3E%3D+0+%26%26+arr%5Bj%5D+%3E+key)+%7B%0A%09%09%09%09arr%5Bj+%2B+1%5D+%3D+arr%5Bj%5D%3B%0A%09%09%09%09j+%3D+j+-+1%3B%0A%09%09%09%7D%0A%09%09%09arr%5Bj+%2B+1%5D+%3D+key%3B%0A%09%09%7D%0A%09%7D%0A%0A%09%0A%7D%0A&mode=display&curInstr=0
		
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			// Move elements of arr[0..i-1], that are greater than key,
			// to one position ahead of their current position
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void bubbleSort(int[] arr) {
		// Time complexity: O(n^2)
		// Space complexity: O(1)
		
		// Visualizer link - https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=%0A%0Apublic+class+SortingExample+%7B%0A%09%0A%09public+static+void+main(String%5B%5D+args)+%7B%0A%09%09int%5B%5D+arr+%3D+%7B64,+25,+12,+22,+11%7D%3B%0A//%09%09selectionSort(arr)%3B%0A//%09%09insertionSort(arr)%3B%0A%09%09bubbleSort(arr)%3B%0A%09%09System.out.println(%22Sorted+array%3A+%22)%3B%0A%09%09printArray(arr)%3B%0A%09%7D%0A%09%0A%09public+static+void+printArray(int%5B%5D+arr)+%7B%0A%09%09for+(int+value+%3A+arr)+%7B%0A%09%09%09System.out.print(value+%2B+%22+%22)%3B%0A%09%09%7D%0A%09%09System.out.println()%3B%0A%09%7D%0A%0A%09public+static+void+selectionSort(int%5B%5D+arr)+%7B%0A%09%09//+Time+complexity%3A+O(n%5E2)%0A%09%09//+Space+complexity%3A+O(1)%0A%09%09%0A%09%09//+Visualizer+link+-+https%3A//cscircles.cemc.uwaterloo.ca/java_visualize/%23code%3D%250Apublic%2Bclass%2BSortingExample%2B%257B%250A%2509%250A%2509public%2Bstatic%2Bvoid%2Bmain(String%255B%255D%2Bargs)%2B%257B%250A%2509%2509int%255B%255D%2Barr%2B%253D%2B%257B64,%2B25,%2B12,%2B22,%2B11%257D%253B%250A%2509%2509selectionSort(arr)%253B%250A%2509%2509System.out.println(%2522Sorted%2Barray%253A%2B%2522)%253B%250A%2509%2509printArray(arr)%253B%250A%2509%257D%250A%250A%2509public%2Bstatic%2Bvoid%2BselectionSort(int%255B%255D%2Barr)%2B%257B%250A%2509%2509//%2BTime%2Bcomplexity%253A%2BO(n%255E2)%250A%2509%2509//%2BSpace%2Bcomplexity%253A%2BO(1)%250A%2509%2509%250A%2509%2509int%2Bn%2B%253D%2Barr.length%253B%250A%250A%2509%2509for%2B(int%2Bi%2B%253D%2B0%253B%2Bi%2B%253C%2Bn%2B-%2B1%253B%2Bi%252B%252B)%2B%257B%250A%2509%2509%2509int%2BminIndex%2B%253D%2Bi%253B%250A%2509%2509%2509for%2B(int%2Bj%2B%253D%2Bi%2B%252B%2B1%253B%2Bj%2B%253C%2Bn%253B%2Bj%252B%252B)%2B%257B%250A%2509%2509%2509%2509if%2B(arr%255Bj%255D%2B%253C%2Barr%255BminIndex%255D)%2B%257B%250A%2509%2509%2509%2509%2509minIndex%2B%253D%2Bj%253B%250A%2509%2509%2509%2509%257D%250A%2509%2509%2509%257D%250A%2509%2509%2509//%2BSwap%2Bthe%2Bfound%2Bminimum%2Belement%2Bwith%2Bthe%2Bfirst%2Belement%250A%2509%2509%2509int%2Btemp%2B%253D%2Barr%255BminIndex%255D%253B%250A%2509%2509%2509arr%255BminIndex%255D%2B%253D%2Barr%255Bi%255D%253B%250A%2509%2509%2509arr%255Bi%255D%2B%253D%2Btemp%253B%250A%2509%2509%257D%250A%2509%257D%250A%250A%2509public%2Bstatic%2Bvoid%2BprintArray(int%255B%255D%2Barr)%2B%257B%250A%2509%2509for%2B(int%2Bvalue%2B%253A%2Barr)%2B%257B%250A%2509%2509%2509System.out.print(value%2B%252B%2B%2522%2B%2522)%253B%250A%2509%2509%257D%250A%2509%2509System.out.println()%253B%250A%2509%257D%250A%257D%250A%26mode%3Ddisplay%26curInstr%3D94%0A%09%09%0A%09%09int+n+%3D+arr.length%3B%0A%0A%09%09for+(int+i+%3D+0%3B+i+%3C+n+-+1%3B+i%2B%2B)+%7B%0A%09%09%09int+minIndex+%3D+i%3B%0A%09%09%09for+(int+j+%3D+i+%2B+1%3B+j+%3C+n%3B+j%2B%2B)+%7B%0A%09%09%09%09if+(arr%5Bj%5D+%3C+arr%5BminIndex%5D)+%7B%0A%09%09%09%09%09minIndex+%3D+j%3B%0A%09%09%09%09%7D%0A%09%09%09%7D%0A%09%09%09//+Swap+the+found+minimum+element+with+the+first+element%0A%09%09%09int+temp+%3D+arr%5BminIndex%5D%3B%0A%09%09%09arr%5BminIndex%5D+%3D+arr%5Bi%5D%3B%0A%09%09%09arr%5Bi%5D+%3D+temp%3B%0A%09%09%7D%0A%09%7D%0A%09%0A%09public+static+void+insertionSort(int%5B%5D+arr)+%7B%0A%09%09//+Time+complexity%3A+O(n%5E2)%0A%09%09//+Space+complexity%3A+O(1)%0A%09%09%0A%09%09//+Visualizer+link+-+https%3A//cscircles.cemc.uwaterloo.ca/java_visualize/%23code%3D%250A%250Apublic%2Bclass%2BSortingExample%2B%257B%250A%2509%250A%2509public%2Bstatic%2Bvoid%2Bmain(String%255B%255D%2Bargs)%2B%257B%250A%2509%2509int%255B%255D%2Barr%2B%253D%2B%257B64,%2B25,%2B12,%2B22,%2B11%257D%253B%250A//%2509%2509selectionSort(arr)%253B%250A%2509%2509insertionSort(arr)%253B%250A%2509%2509System.out.println(%2522Sorted%2Barray%253A%2B%2522)%253B%250A%2509%2509printArray(arr)%253B%250A%2509%257D%250A%2509%250A%2509public%2Bstatic%2Bvoid%2BprintArray(int%255B%255D%2Barr)%2B%257B%250A%2509%2509for%2B(int%2Bvalue%2B%253A%2Barr)%2B%257B%250A%2509%2509%2509System.out.print(value%2B%252B%2B%2522%2B%2522)%253B%250A%2509%2509%257D%250A%2509%2509System.out.println()%253B%250A%2509%257D%250A%250A%2509%250A%2509public%2Bstatic%2Bvoid%2BinsertionSort(int%255B%255D%2Barr)%2B%257B%250A%2509%2509//%2BTime%2Bcomplexity%253A%2BO(n%255E2)%250A%2509%2509//%2BSpace%2Bcomplexity%253A%2BO(1)%250A%2509%2509%250A%2509%2509int%2Bn%2B%253D%2Barr.length%253B%250A%2509%2509for%2B(int%2Bi%2B%253D%2B1%253B%2Bi%2B%253C%2Bn%253B%2B%252B%252Bi)%2B%257B%250A%2509%2509%2509int%2Bkey%2B%253D%2Barr%255Bi%255D%253B%250A%2509%2509%2509int%2Bj%2B%253D%2Bi%2B-%2B1%253B%250A%250A%2509%2509%2509//%2BMove%2Belements%2Bof%2Barr%255B0..i-1%255D,%2Bthat%2Bare%2Bgreater%2Bthan%2Bkey,%250A%2509%2509%2509//%2Bto%2Bone%2Bposition%2Bahead%2Bof%2Btheir%2Bcurrent%2Bposition%250A%2509%2509%2509while%2B(j%2B%253E%253D%2B0%2B%2526%2526%2Barr%255Bj%255D%2B%253E%2Bkey)%2B%257B%250A%2509%2509%2509%2509arr%255Bj%2B%252B%2B1%255D%2B%253D%2Barr%255Bj%255D%253B%250A%2509%2509%2509%2509j%2B%253D%2Bj%2B-%2B1%253B%250A%2509%2509%2509%257D%250A%2509%2509%2509arr%255Bj%2B%252B%2B1%255D%2B%253D%2Bkey%253B%250A%2509%2509%257D%250A%2509%257D%250A%250A%2509%250A%257D%250A%26mode%3Ddisplay%26curInstr%3D0%0A%09%09%0A%09%09int+n+%3D+arr.length%3B%0A%09%09for+(int+i+%3D+1%3B+i+%3C+n%3B+%2B%2Bi)+%7B%0A%09%09%09int+key+%3D+arr%5Bi%5D%3B%0A%09%09%09int+j+%3D+i+-+1%3B%0A%0A%09%09%09//+Move+elements+of+arr%5B0..i-1%5D,+that+are+greater+than+key,%0A%09%09%09//+to+one+position+ahead+of+their+current+position%0A%09%09%09while+(j+%3E%3D+0+%26%26+arr%5Bj%5D+%3E+key)+%7B%0A%09%09%09%09arr%5Bj+%2B+1%5D+%3D+arr%5Bj%5D%3B%0A%09%09%09%09j+%3D+j+-+1%3B%0A%09%09%09%7D%0A%09%09%09arr%5Bj+%2B+1%5D+%3D+key%3B%0A%09%09%7D%0A%09%7D%0A%09%0A%09public+static+void+bubbleSort(int%5B%5D+arr)+%7B%0A%09%09//+Time+complexity%3A+O(n%5E2)%0A%09%09//+Space+complexity%3A+O(1)%0A%09%09%0A%09%09int+n+%3D+arr.length%3B%0A%0A%09%09for+(int+i+%3D+0%3B+i+%3C+n+-+1%3B+i%2B%2B)+%7B%0A%09%09%09for+(int+j+%3D+0%3B+j+%3C+n-i-1%3B+j%2B%2B)+%7B%0A%09%09%09%09if+(arr%5Bj%5D+%3E+arr%5Bj%2B1%5D)+%7B%0A%09%09%09%09%09int+temp+%3D+arr%5Bj%5D%3B%0A%09%09%09%09%09arr%5Bj%5D+%3D+arr%5Bj%2B1%5D%3B%0A%09%09%09%09%09arr%5Bj%2B1%5D+%3D+temp%3B%0A%09%09%09%09%7D%0A%09%09%09%7D%0A%09%09%7D%0A%09%7D%0A%0A%09%0A%7D%0A&mode=display&curInstr=82
		
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	

	
}
