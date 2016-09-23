package github.nisrulz.sample.learnkotlin

/* Converted the Java file to kotlin

 Constructor in Kotlin is defined as:

   class User constructor(firstName: String) {
    ..
   }

  however if the primary constructor does not have any annotations or visibility modifiers,
  the constructor keyword can be omitted:

  class User (firstName: String) {
    ..
   }

   NOTE : The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks, which are
          prefixed with the init keyword:

          class User(firstName: String) {
            init {
                logger.info("User initialized with value ${firstName}")
              }
            }



*/
class User(var fName: String, var lName: String) {
  /*
   When defining variables in Kotlin, there are two options:
    1. Mutable variables, defined by var keyword.
    2. Immutable variables, defined by val keyword.

   Note : 1. By default, properties are non-null types, meaning that they can’t accept null value.
          2. By default, everything is of public scope. You don’t have to write public keyword again.
             To define a variable to accept a null value, a question mark must be added after the type.
          3. by default, all getter and setter are implicitly available you dont need to define unless you want a custom version for the same.
   */

  // Initializing properties using constructor variables
  var firstName: String? = fName
  var lastName: String? = lName

  // Custom getter
  val fullName: String? get() = firstName + " " + lastName
}
