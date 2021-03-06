abstract class User {
    String lastName;
    String firstName;

    public String UserName() {
        return getUserName(this.firstName, this.lastName)
    }

    private String getUserName(String firstName, String lastName) {
        return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase()
    }
}

class Artist extends User {
    public String[] Songs

}

class Producer extends User {
    public void Produce() {
        println("Album COMPLETE")
    }
}

User[] users = [new Artist(firstName: "Bob", lastName: "Dylan", Songs: ["It's Alright Ma"]),
                new Producer (firstName: "Jeff", lastName: "Lynne"),
                new Artist(firstName: "Jeff", lastName: "Lynne", Songs: ["Fire on High"]),
                new Artist(firstName: "Roy", lastName: "Orbison", Songs: ["Crying"]),
                new Artist(firstName: "George", lastName: "Harrison", Songs: ["Wah Wah"]),
                new Artist(firstName: "Tom", lastName: "Petty", Songs: ["Running Down the Dream"])]

users.each { user ->
    if (user instanceof Artist) {
        println("UserName is ${user.UserName()}")
        user.Songs.each {
            println("${it}")
        }
    } else {
        user.Produce()
    }
}