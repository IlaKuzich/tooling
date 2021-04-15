package sort

import scala.collection.mutable.ArrayBuffer

object Sort extends App {
  val sequence = Vector(4,2,1,9,34,23,4,18,5,2,4,2,65,4,2,7,23,12,34,76,45,94,34,8,64,3,4,6,76,3,4,6,2,3,4,5,6)

  println(mergeSort(sequence))

  def mergeSort(vector: Seq[Int]): Seq[Int] = {
    if (vector.size > 1) {
      val (first, second) = vector.splitAt(vector.size / 2)
      val left = mergeSort(first)
      val right = mergeSort(second)

      val sorted = ArrayBuffer[Int]()

      var i, j = 0

      while (i < left.size && j < right.size) {
        if (left(i) > right(j)) {
          sorted.append(right(j))
          j += 1
        } else {
          sorted.append(left(i))
          i += 1
        }
      }
      while (i < left.size) {
        sorted.append(left(i))
        i += 1
      }
      while (j < right.size) {
        sorted.append(right(j))
        j += 1
      }
      sorted
    } else {
      vector
    }
  }
}
