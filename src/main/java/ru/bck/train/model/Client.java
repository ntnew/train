package ru.bck.train.model;

import javax.persistence.OneToOne;
import lombok.Data;

import javax.persistence.Id;
import java.util.UUID;

@Data
public class Client {

  @Id
  private UUID id;
  private String login;
  private String password;
  private String name;
  private String Surname;

  @OneToOne
  private UUID trainerId;
}
