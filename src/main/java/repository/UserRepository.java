package repository;

import java.util.Arrays;
import java.util.List;
import model.User;

public class UserRepository {
  private final static List<User> USERS = Arrays.asList(
          new User("Oleg", "123@qwe.com", "qwerty"),
          new User("Vasa", "ololo@mail.ua", "rewq"),
          new User("Ivan", "oleris@sarel.tel", "Aboba"),
          new User("admin", "admin", "admin")
  );

  public static List<User> getUsers() {
    return USERS;
  }
}
