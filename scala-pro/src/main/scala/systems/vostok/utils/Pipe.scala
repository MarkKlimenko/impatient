package systems.vostok.utils

class Pipe[A](a: A) {
  def pipe[B](f: A => B) = f(a)
}

object Pipe {
  def apply[A](v: A) = new Pipe(v)
}

object PipeOps {
  implicit def toPipe[A](a: A) = Pipe(a)
}
