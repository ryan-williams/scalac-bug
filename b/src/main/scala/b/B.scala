package b

@a.AddImplicit
trait B1 {}

object B2 extends B1 {
  val s: String = 4
}

object B3 extends B1
