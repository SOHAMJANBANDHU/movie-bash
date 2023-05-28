package in.adgebra.microServices.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "m_movie")
public class Movie {
    @Column(name = "movieId")
    private String movieId;
    @Column(name = "name")

    private String name;
    @Column(name = "description")

    private String description;

}
