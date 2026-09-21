# Login and Registration System

## Overview

This is a simple Java Login and Registration System created using NetBeans.

The program allows a user to register an account and checks that the information entered follows the required rules.

## Features

The system checks:

* Username format
* Password complexity
* Cell phone number format
* User registration details
* User login details

## Username Validation

The `checkUserName()` method checks that:

* The username contains an underscore (`_`).
* The username is no more than 5 characters long.

Example of a valid username:

```text
kyl_1
```

Example of an invalid username:

```text
kylemitchell
```

## Password Validation

The `checkPasswordComplexity()` method checks whether the password meets the required password rules.

## Cell Phone Validation

The program checks whether the cell phone number follows the required format before allowing the user to register.

## Main Classes

### Login.java

The `Login` class contains the validation methods and stores the user's:

* Username
* Password
* First name
* Last name

### Main.java

The `Main` class runs the program and allows the user to enter their registration and login information.

## Technologies Used

* Java
* NetBeans IDE
* JUnit 4 for testing

## How to Run

1. Open the project in NetBeans.
2. Make sure `Login.java` and `Main.java` are in the same package.
3. Clean and build the project.
4. Run `Main.java`.
5. Follow the instructions shown in the Output window.

## Testing

JUnit tests are used to test whether the validation methods work correctly.

Example:

```java
assertTrue(account.checkUserName("kyl_1"));
assertFalse(account.checkUserName("kylemitchell"));
```

The first test checks that `kyl_1` is a valid username.

The second test checks that `kylemitchell` is an invalid username because it does not meet the username requirements.

## Author

**Precious Lamola**
# Project-
