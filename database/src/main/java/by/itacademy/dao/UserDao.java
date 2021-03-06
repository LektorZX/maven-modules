package by.itacademy.dao;

import by.itacademy.model.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDao {

    private static final UserDao INSTANCE = new UserDao();

    public User getDefaultUser() {

            return User.builder()
//                .id(25L)
                    .username("Ivan")
                    .build();
            //

    }

    public static UserDao getInstance() {
        return INSTANCE;
    }
}
