```java

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class unionBrute {

public static List<Integer> union(int arr1[], int arr2[]) {
    List<Integer> ll = new ArrayList<>();
    for (int num : arr1) {
        ll.add(num);
    }
    for (int num : arr2) {
        ll.add(num);
    }
    Set<Integer> set = new HashSet<>(ll);
    List<Integer> result = new ArrayList<>(set);
    Collections.sort(result);
    return result;

}
```
---
```java

public static void main(String[] args) {
    int arr1[] = { 1, 2, 2, 3, 4 };
    int arr2[] = { 2, 3, 5, 6 };
    System.out.println(union(arr1, arr2));// [1, 2, 3, 4, 5, 6]
}
}import java.util.*;

public class unionBetter {

public static List<Integer> Better(int arr1[], int arr2[]) {
    Set<Integer> set = new TreeSet();
    for (int num : arr1) {
        set.add(num);
    }
    for (int num : arr2) {
        set.add(num);
    }
    return new ArrayList<>(set);
}
```
---
```java

public static void main(String[] args) {
    int arr1[] = { 1, 2, 2, 3, 4 };
    int arr2[] = { 2, 3, 5, 6 };
    System.out.println(Better(arr1, arr2));// [1, 2, 3, 4, 5, 6]

}
}
import java.util.ArrayList;
import java.util.List;

public class optimal {
public static List<Integer> union(int[] arr1, int[] arr2) {
List<Integer> result = new ArrayList<>();
int i = 0, j = 0;
int n = arr1.length, m = arr2.length;

    while (i < n && j < m) {
        int val1 = arr1[i];
        int val2 = arr2[j];

        if (val1 < val2) {
            if (result.isEmpty() || result.get(result.size() - 1) != val1)
                result.add(val1);
            i++;
        } else if (val1 > val2) {
            if (result.isEmpty() || result.get(result.size() - 1) != val2)
                result.add(val2);
            j++;
        } else {
            if (result.isEmpty() || result.get(result.size() - 1) != val1)
                result.add(val1);
            i++;
            j++;
        }
    }

    while (i < n) {
        if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
            result.add(arr1[i]);
        i++;
    }

    while (j < m) {
        if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
            result.add(arr2[j]);
        j++;
    }

    return result;
}
```
---
```java
public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2, 3, 4 };
    int[] arr2 = { 2, 3, 5, 6 };

    List<Integer> unionResult = union(arr1, arr2);
    System.out.println("Optimal Union: " + unionResult);// Optimal Union: [1, 2, 3, 4, 5, 6]
}
}
```
```java
import java.util.*;

public class InterBrute {

public static List<Integer> brute(int arr1[], int arr2[]) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < arr1.length; i++) {
        if (i > 0 && arr1[i] == arr1[i - 1]) {
            continue;
        }
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                break;
            }
        }
    }
    return result;

}
```
---
```java
public static void main(String[] args) {

    int arr1[] = { 1, 2, 2, 3, 4 };
    int arr2[] = { 2, 2, 3, 5 };
    System.out.println(brute(arr1, arr2));// [2, 3]
}
}import java.util.*;

public class Betterineter {

public static List<Integer> Better(int arr1[], int arr2[]) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> resultset = new HashSet<>();
    for (int num : arr1) {
        set.add(num);
    }
    for (int num : arr2) {
        if (set.contains(num)) {
            resultset.add(num);
        }
    }
    return new ArrayList<>(resultset);

}

public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2, 3, 4 };
    int[] arr2 = { 2, 2, 3, 5 };
    System.out.println("Better: " + Better(arr1, arr2));// [2, 3]

}
}
import java.util.*;

public class optimalInterSection {

public static List<Integer> optimal(int arr1[], int arr2[]) {
    List<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    int n = arr1.length, m = arr2.length;
    while (i < n && j < m) {
        if (i > 0 && arr1[i] == arr1[i - 1]) {
            i++;
            continue;
        }
        if (arr1[i] < arr2[j]) {
            i++;
        } else if (arr1[i] > arr2[j]) {
            j++;
        } else {
            result.add(arr1[i]);
            i++;
            j++;
        }
    }
    return result;
}

public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2, 3, 4 };
    int[] arr2 = { 2, 2, 3, 5 };
    System.out.println("Optimal: " + optimal(arr1, arr2));// Optimal: [2, 3]

}
}
```