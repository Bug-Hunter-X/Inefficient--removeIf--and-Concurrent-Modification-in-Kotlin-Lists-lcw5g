fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code snippet uses the `removeIf` method to remove even numbers from a mutable list. However, this is not always the most efficient approach for large lists. The `removeIf` method iterates through the list and performs an operation for each element. For very large lists, this can become computationally expensive.  Another common issue is modifying a collection while iterating over it which can lead to unexpected behavior.