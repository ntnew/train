package ru.bck.train.model;

import lombok.Data;

import javax.persistence.Id;
import java.util.UUID;

@Data
public class Trainer {

  @Id
  private UUID id;
  private String login;
  private String password;
  private String name;
  private String surname;
}
