package ru.bck.train.model;

import java.util.UUID;
import javax.persistence.Id;
import lombok.Data;
import ru.bck.train.model.enums.Roles;

@Data
public class User {
  @Id
  private UUID id;
  private String login;
  private String password;
  private Roles role;

}
