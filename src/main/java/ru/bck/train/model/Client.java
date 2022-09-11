package ru.bck.train.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;

import javax.persistence.Id;
import java.util.UUID;

@Data
public class Client {

  @Id
  private UUID id;
  @OneToOne
  @JoinColumn(name = "id")
  private User user;
  private String name;
  private String surname;

  @OneToOne
  @JoinColumn(name = "id")
  private Trainer trainer;
}
