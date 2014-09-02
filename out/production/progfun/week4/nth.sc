import week4._
object nth{
  def nth[T](n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n==0) xs.head
    else nth(n-1, xs.tail)
  val c: List[Int] = new Const(1, new Const(2, new Const(3, new Nil)))
  /*nth(2, c)
  nth(4, c)
  nth(-1, c)*/
  val l = List(1,2)
  l.head
  l.tail.head

}

