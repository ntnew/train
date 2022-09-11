package ru.bck.train.model;

import java.util.List;
import java.util.UUID;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
public class Trainer {

  @Id
  private UUID id;

  @OneToOne
  @JoinColumn(name = "id")
  private User user;
  private String name;
  private String surname;

  @OneToMany
  @JoinColumn(name = "id")
  private List<Client> clients;
}
