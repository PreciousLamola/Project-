/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package quickchatapp;

public class Login {

    private String username;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;

    public boolean checkUserName(String username) {
        return username != null
                && username.contains("_")
                && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        return password != null
                && password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[^A-Za-z0-9].*");
    }

    public boolean checkCellPhoneNumber(String cellNumber) {
        return cellNumber != null
                && cellNumber.matches("^\\+\\d{2,12}$");
    }

    public String registerUser(String firstName, String lastName,
                               String username, String password,
                               String cellNumber) {

        if (firstName == null || firstName.trim().isEmpty()
                || lastName == null || lastName.trim().isEmpty()) {
            return "First name and last name are required.";
        }

        if (!checkUserName(username)) {
            return "Username must contain an underscore and be no more "
                    + "than five characters long.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password must have at least 8 characters, one uppercase "
                    + "letter, one number, and one special character.";
        }

        if (!checkCellPhoneNumber(cellNumber)) {
            return "Cellphone must start with + and contain 2 to 12 digits "
                    + "after the plus sign.";
        }

        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;

        return "User registered successfully.";
    }

    public boolean loginUser(String username, String password) {
        return this.username != null
                && this.password != null
                && this.username.equals(username)
                && this.password.equals(password);
    }

    public String returnLoginStatus(boolean loggedIn) {
        if (loggedIn) {
            return "Welcome " + firstName + " " + lastName
                    + ", it is great to see you again.";
        }

        return "Username or password incorrect, please try again.";
    }
}
