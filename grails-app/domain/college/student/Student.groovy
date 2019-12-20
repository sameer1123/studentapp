package college.student

class Student {
    String firstName
    String lastName
    String email
    Long age
    String city

    static constraints = {
        firstName blank: false, nullable: false
        lastName blank: false, nullable: false
        email blank: false, nullable: false
    }
}
