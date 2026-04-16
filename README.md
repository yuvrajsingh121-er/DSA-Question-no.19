# 🚀 DSA Question No. 19: Linear Search

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![DSA](https://img.shields.io/badge/Topic-Data%20Structures-blue?style=for-the-badge)

## 📝 Problem Description
Linear Search ek simple algorithm hai jo array ke har element ko sequence mein check karta hai jab tak target element mil na jaye ya array khatam na ho jaye.

### 🔍 How it Works:
1. Array ke pehle element se shuru karein.
2. Current element ko *Target Value* se compare karein.
3. Agar match mil jata hai, toh index return karein.
4. Agar match nahi milta, toh agle element par jayein.
5. Agar poora array check karne ke baad bhi element nahi milta, toh return -1.

---

## 💻 Java Code Snippet

```java
public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        
        int result = search(numbers, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
