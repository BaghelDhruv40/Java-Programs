//binary search
import java.util.Random; 
import java.lang.Math; 
class Main { 
static void binarySearch(int[] arr, int key) { 
long start = System.currentTimeMillis(); 
int low = 0; 
int high = arr.length - 1; 
while (low <= high) { 
int middle = (low + high) / 2; 
if (key < arr[middle]) { 
high = middle - 1; 
} else if (key > arr[middle]) { 
low = middle + 1; 
} else { 
break; 
} 
} 
long end = System.currentTimeMillis(); 
long time = end - start; 
System.out.print(time + " "); 
} 
static class AverageCase { 
int[] arr; 
AverageCase(int n) { 
arr = new int[n]; 
Random rand = new Random(); 
for (int i = 0; i < n; i++) { 
arr[i] = Math.abs(rand.nextInt()); 
} 
} 
}
static class bestCase { 
int[] arr; 
bestCase(int n) { 
arr = new int[n]; 
for (int i = 0; i < n; i++) { 
arr[i] = i; 
} 
} 
} 
public static void main(String[] args) { 
for (int n = 1000000; n <= 10000000; n += 1000000) { 
AverageCase avgArray = new AverageCase(n); 
bestCase bestArray = new bestCase(n); 
System.out.print(n + " "); 
binarySearch(bestArray.arr, bestArray.arr[n / 2]); 
binarySearch(bestArray.arr, bestArray.arr[0]); 
binarySearch(bestArray.arr, -10); 
System.out.println(); 
} 
} 
}