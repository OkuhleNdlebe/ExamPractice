package za.ac.cput.Domain;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    //Private Constructor
    private User (Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String email;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder copy (User user){
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.email = user.email;
            return this;
        }
        public User build(){
            return  new User(this);
        }
    }
}
