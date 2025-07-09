package com.igorwojda.linkedlist.singly.midpoint

class Node<T>(val data: T) {
    var next: Node<T>? = null
}

fun <T> findMidpoint(head: Node<T>?): Node<T>? {
    var slow = head
    var fast = head

    while (fast?.next != null && fast.next?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }
    return slow
}

// Example Usage
fun main() {
    val head = Node(1)
    head.next = Node(2)
    head.next?.next = Node(3)
    head.next?.next?.next = Node(4)
    head.next?.next?.next?.next = Node(5)

    val middle = findMidpoint(head)
    println("Middle node is: ${middle?.data}")
}
