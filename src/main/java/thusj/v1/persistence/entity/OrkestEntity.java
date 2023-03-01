package thusj.v1.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "orkest")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrkestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @NotBlank
    @Length(min=3, max=50)
    @Column(name="naam")
    private String naam;

    @NotBlank
    @Length(min=3, max=50)
    @Column(name="plaats")
    private String plaats;
}
