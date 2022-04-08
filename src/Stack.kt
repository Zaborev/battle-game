class Stack<T>  {
    var item = mutableListOf<T>()

    fun push(valuePush: T): MutableList<T> {
        item.add(valuePush)
        return item
    }
    fun isEmpty(): Boolean {
        return item.size == 0
    }
    fun pop(): T? {
        if (isEmpty()) {
            println("Stack is empty")
            return null
        } else return item.removeLast()

    }

}
