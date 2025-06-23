package com.blog.api.models;
import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name= "Posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Usuario criado_por;
    @Temporal(value = TemporalType.TIMESTAMP)
    private OffsetDateTime criado_em;

}
