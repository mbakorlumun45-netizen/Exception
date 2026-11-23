package ConstructorFailure;

public class Failure {

//    11.15

//1: They are the only clean way to signal failure from a constructor

//Since there is no return value, throwing an exception is the one
//mechanism that reliably communicates "construction did not succeed."

//    2. They prevent invalid objects from ever existing

//    When a constructor throws, the new expression never completes. The caller never
//    receives a reference to the half-built object, so it's impossible to accidentally use it.

//    3. They separate error handling from normal logic

//    The caller doesn't have to check a status after
//    every new. The normal path stays clean, and failures are handled in one place:

//    4. They carry detailed information about what went wrong

//    An exception includes a message, a type, and a stack trace.
//    A failed constructor
//    can say exactly which argument was bad and why, which a boolean
//    flag or status code can't do.

//    5. They propagate automatically

//    If a constructor is called inside another constructor or method
//    that doesn't know how to handle the failure, the exception passes
//    up the call stack until something that can handle it catches it.
//    No manual error-code forwarding is needed.

//    6. They let you use the right kind of exception

//    Unchecked exceptions (IllegalArgumentException, NullPointerException)
//    suit programming errors such as bad arguments.
//    Checked exceptions (IOException, SQLException) suit recoverable conditions
//    such as a missing file or failed connection, and force the caller to deal with them.
}
