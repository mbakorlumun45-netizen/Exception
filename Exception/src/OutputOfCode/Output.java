package OutputOfCode;

public class Output {

//    11.18

//    There is no output, because the code does not compile.
//
//            Why
//
//    NullPointerException is a subclass of RuntimeException:
//
//    Exception → RuntimeException → NullPointerException
//
//    The first catch block, catch (RuntimeException e),
//    already handles every RuntimeException and all of
//    its subclasses, including NullPointerException. The
//    second catch block can therefore never be reached,
//    and Java treats an unreachable catch clause as a
//    compile-time error:
//
//    error: exception NullPointerException has already been caught
//
//            (The same rule I mentioned earlier: put
//                    the most specific type first, the most general last.)
//
//    A second problem
//
//    The string literal in the second handler is split across two lines:
//
//    java
//System.out.println("Null Pointer
//    Exception");
//
//    A string literal can't contain a raw line break, so this also
//    produces a compile error ("unclosed string literal"). This may
//    just be a formatting slip from copying the question.
}
