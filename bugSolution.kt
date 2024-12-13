fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }
    println(newList)
}
This improved code snippet uses a filter operation to create a new list containing only the odd numbers. The filter operation is generally more efficient for larger lists because it avoids in-place modification, which is often the cause of unexpected behavior. This approach creates a new list, thus avoiding concurrent modification issues.