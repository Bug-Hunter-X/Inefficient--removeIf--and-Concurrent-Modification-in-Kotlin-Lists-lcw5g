# Inefficient removeIf and Concurrent Modification in Kotlin Lists

This repository demonstrates a potential performance issue with Kotlin's `removeIf` function when used on large lists, and the pitfalls of modifying a collection while iterating over it. 

The `bug.kt` file contains code that removes even numbers from a list using `removeIf`. This approach, while concise, can be inefficient for larger datasets.  The solution demonstrates a more performant approach.

The `bugSolution.kt` file provides an optimized solution using list comprehension and a filter approach.

## How to run:
1. Clone the repository.
2. Open the project in your preferred Kotlin IDE (IntelliJ IDEA is recommended).
3. Run the `main` function in both files to observe the different performance characteristics and behavior.