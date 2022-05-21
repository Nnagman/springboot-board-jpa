package com.kdt.prgrms.board.entity.user;

import com.kdt.prgrms.board.entity.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Hobby hobby;

    protected User() {

    }

    private User(UserBuilder builder) {

        this.name = builder.name;
        this.age = builder.age;
        this.hobby = builder.hobby;
    }

    public static class UserBuilder {

        private String name;
        private int age;
        private Hobby hobby;

        public UserBuilder name(String value) {

            this.name = value;
            return this;
        }

        public UserBuilder age(int value) {

            this.age = value;
            return this;
        }

        public UserBuilder hobby(Hobby value) {

            this.hobby = value;
            return this;
        }

        public User build() {

            return new User(this);
        }
    }

    public static UserBuilder builder() {

        return new UserBuilder();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
