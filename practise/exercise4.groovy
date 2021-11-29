class User {
    String lastName;
    String firstName;

    public String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }
}

User[] users = [new User(firstName: "Dima", lastName: "Ivanov"),
                new User(firstName: "Anzhelika", lastName: "Vlasova"),
                new User(firstName: "Anna", lastName: "Akentieva"),
                new User(firstName: "Aleksey", lastName: "Lebedev"),
                new User(firstName: "Vlad", lastName: "Prokhorneko"),]

users.each(user -> println("UserName is ${user.UserName()}"))