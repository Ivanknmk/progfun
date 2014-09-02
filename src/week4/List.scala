package week4

import java.util.NoSuchElementException

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Const[T](val head: T, val tail: List[T]) extends List[T]{
  override def isEmpty: Boolean = false
}

class Nil[T] extends List[T]{
  override def isEmpty = true

  override def tail =  throw new NoSuchElementException("Nil.tail")

  override def head = throw new NoSuchElementException("Nil.head")

}

object List {
  def apply[T](): List[T] = new Nil
  def apply[T](v1: T): List[T] = new Const(v1, List())
  def apply[T](v1: T, v2: T): List[T] = new Const(v1, List(v2))
}