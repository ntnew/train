package ru.bck.train.model;

import javax.persistence.Id;
import java.util.UUID;

public class User {
    @Id
    private UUID id;
    private String login;
    private String password;
}
