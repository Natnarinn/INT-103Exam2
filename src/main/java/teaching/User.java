package teaching;

import java.util.List;

public class User {
    private String username;
    private UserStatus status;

    public User(String username, UserStatus status) {
        this.username = username;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public UserStatus getStatus() {
        return status;
    }
}

class Test {
    public static void main(String[] args) {
        User u1 = new User("Username 1", UserStatus.ACTIVE);
        User u2 = new User("Username 2", UserStatus.ACTIVE);
        User u3 = new User("Username 3", UserStatus.valueOf("BLOCKED"));

//        System.out.println(u1.getStatus().equals(UserStatus.valueOf("ACTIVE")) ? u1.getUsername() : "");
//        System.out.println(u2.getStatus().equals(UserStatus.valueOf("ACTIVE")) ? u2.getUsername() : "");
//        System.out.println(u3.getStatus().equals(UserStatus.valueOf("ACTIVE")) ? u3.getUsername() : "");

        if(u1.getStatus().equals(UserStatus.valueOf("ACTIVE"))) {
            System.out.println(u1.getUsername());
        } else {
            System.out.println("");
        }

        if(u2.getStatus().equals(UserStatus.ACTIVE)) {
            System.out.println(u2.getUsername());
        } else {
            System.out.println("");
        }

        if(u3.getStatus().equals(UserStatus.valueOf("ACTIVE"))) {
            System.out.println(u3.getUsername());
        } else {
            System.out.println("");
        }
    }
}
