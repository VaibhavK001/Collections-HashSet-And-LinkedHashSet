# ☕ Java Sets – Quick Revision Guide

> Concise notes on `Set` Interface, `HashSet`, `LinkedHashSet`, and `TreeSet` for interview prep.

---

## 📌 What is a Set?

- A **Set** is a **Collection that does not allow duplicate elements**.
- Part of `java.util` package, extends the `Collection` interface.
- Allows **at most one `null`** (except `TreeSet` — no `null` allowed).

---

## 🔷 Set Interface – Key Methods

| Method | Description |
|---|---|
| `add(E e)` | Adds element; returns `false` if duplicate |
| `remove(Object o)` | Removes the specified element |
| `contains(Object o)` | Returns `true` if element exists |
| `size()` | Returns number of elements |
| `isEmpty()` | Returns `true` if set is empty |
| `clear()` | Removes all elements |
| `iterator()` | Returns an iterator |
| `addAll(Collection c)` | Union of sets |
| `retainAll(Collection c)` | Intersection of sets |
| `removeAll(Collection c)` | Difference of sets |

---

## 🟠 HashSet

### Key Points
- Backed by a **HashMap** internally.
- **No guaranteed order** of elements.
- Allows **one `null`**.
- **O(1)** average time for `add`, `remove`, `contains`.
- Not synchronized (not thread-safe).

### Internal Working
Uses **`hashCode()`** to find bucket, then **`equals()`** to check duplicates.

```java
HashSet<String> set = new HashSet<>();
set.add("Mango");
set.add("Apple");
set.add("Banana");
set.add("Apple");   // duplicate – ignored

System.out.println(set);        // [Banana, Apple, Mango] – order not guaranteed
System.out.println(set.size()); // 3
```

### When to use?
> When you need **fast lookups** and **don't care about order**.

---

## 🟡 LinkedHashSet

### Key Points
- Extends `HashSet`, backed by **LinkedHashMap** internally.
- Maintains **insertion order**.
- Allows **one `null`**.
- Slightly **slower than HashSet** due to linked list overhead.
- Not synchronized.

```java
LinkedHashSet<String> set = new LinkedHashSet<>();
set.add("Mango");
set.add("Apple");
set.add("Banana");
set.add("Apple");   // duplicate – ignored

System.out.println(set); // [Mango, Apple, Banana] – insertion order maintained
```

### When to use?
> When you need **no duplicates + insertion order preserved**.

---

## 🔴 TreeSet

### Key Points
- Implements **`SortedSet`** and **`NavigableSet`**.
- Backed by a **Red-Black Tree** (self-balancing BST).
- Elements stored in **natural sorted order** (or custom `Comparator`).
- Does **NOT allow `null`** → throws `NullPointerException`.
- **O(log n)** for `add`, `remove`, `contains`.
- Not synchronized.

```java
TreeSet<Integer> set = new TreeSet<>();
set.add(50);
set.add(10);
set.add(30);
set.add(10);   // duplicate – ignored

System.out.println(set);          // [10, 30, 50] – sorted order
System.out.println(set.first());  // 10
System.out.println(set.last());   // 50
System.out.println(set.headSet(30)); // [10] – elements < 30
System.out.println(set.tailSet(30)); // [30, 50] – elements >= 30
```

### Custom Comparator (Reverse Order)
```java
TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
set.add(50); set.add(10); set.add(30);
System.out.println(set); // [50, 30, 10]
```

### When to use?
> When you need **sorted unique elements** or **range-based queries**.

---

## ⚡ Quick Comparison Table

| Feature | HashSet | LinkedHashSet | TreeSet |
|---|---|---|---|
| **Order** | No order | Insertion order | Sorted (natural/custom) |
| **Null allowed** | One `null` | One `null` | ❌ No `null` |
| **Performance** | O(1) avg | O(1) avg | O(log n) |
| **Backed by** | HashMap | LinkedHashMap | Red-Black Tree |
| **Implements** | Set | Set | SortedSet, NavigableSet |
| **Use case** | Fast lookup | Ordered + unique | Sorted + unique |

---

## 🧠 Interview Must-Know Points

1. **HashSet vs LinkedHashSet** → Only difference: LinkedHashSet maintains insertion order.
2. **HashSet vs TreeSet** → HashSet is O(1), TreeSet is O(log n) but sorted.
3. **Why no duplicates?** → `add()` internally calls `hashCode()` + `equals()` to detect duplicates.
4. **TreeSet with custom objects** → Object must implement `Comparable` OR pass a `Comparator`.
5. **TreeSet null** → Adding `null` throws `NullPointerException` because `null` can't be compared.
6. **Thread safety** → All three are **not synchronized**. Use `Collections.synchronizedSet()` if needed.
7. **HashSet initial capacity** → Default `16`, load factor `0.75`.

---

## 🔁 Set Operations (Union, Intersection, Difference)

```java
HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4));
HashSet<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5, 6));

// Union
Set<Integer> union = new HashSet<>(a);
union.addAll(b);              // [1, 2, 3, 4, 5, 6]

// Intersection
Set<Integer> intersection = new HashSet<>(a);
intersection.retainAll(b);    // [3, 4]

// Difference
Set<Integer> difference = new HashSet<>(a);
difference.removeAll(b);      // [1, 2]
```
