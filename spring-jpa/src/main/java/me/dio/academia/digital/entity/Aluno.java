package me.dio.academia.digital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data //Anotação Lombok abstrai getter, setter, equals e hashcode
@NoArgsConstructor //Anotação Lombok cria construtor vazio
@AllArgsConstructor //^
@Entity //Anotação javax.persistence diz que a classe é uma tabela
@Table(name = "tb_alunos") //nomeia a tabela
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //?
public class Aluno {

  @Id //Anotação javax.persistence p/ chave primária
  @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
  private Long id;

  private String nome;

  @Column(unique = true)
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) //relacionamento de cardinalidade 1*N
  @JsonIgnore //ignora exceção
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
