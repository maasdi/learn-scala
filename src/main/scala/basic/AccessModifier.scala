package basic

/**
 * AccessModifier
 *
 * @author <a href="mailto:maas.dianto@gmail.com">Maas Dianto</a>
 *         created on 11/27/2014
 */
class AccessModifier {

  // 1. Private
  class PrivateOuter {

    class Inner {
      private def f() {
        println("f")
      }
    }

    // not accessibel because private method
    //new Inner().f()
  }

  class Super {
    protected def f(): Unit = {
      println("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    // not accessible
    //new Super().f()
  }

  class PublicOuter {
    class Inner() {
      def f(): Unit = {
        println("f")
      }
    }

    // public - should be accessible
    new Inner().f()
  }

}
