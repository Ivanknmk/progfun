object overrides{

}

abstract class Base{
  def foo = 1
  def bar: Int
}

abstract class Sub extends Base{
  override def foo = 2
  def bar = 3
}