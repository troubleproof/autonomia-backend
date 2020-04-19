package br.com.troubleproof.entity;

import br.com.troubleproof.enums.Genero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity @SequenceGenerator(name = "usuario", sequenceName = "usuario_seq", allocationSize = 1)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "usuario")
    private Integer id;
    private String nome;
    private String apelido;
    private String usuario;
    private Integer cpf;
    private String email;
    private String senha;
    private Calendar nascimento;
    private Genero genero;
    private String foto;
    private Integer celular;
    private String biografia;
    private Integer nota;

}
