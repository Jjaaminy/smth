package ch.bbw.jokebook;

import lombok.*;
import javax.persistence.*;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity
    @Getter // lombok library
    @Setter // lombok library
    //@NoArgsConstructor
    //@AllArgsConstructor

public class Joke {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String text;
    private int rating;
    private Date date;

}
