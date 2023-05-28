package in.adgebra.microServices2.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "m_MovieSummary")
public class MovieSummary {

    @Column(name = "id")
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "overview")
    private String overview;


}

