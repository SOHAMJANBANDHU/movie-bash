package in.adgebra.microServices.DAO;

import lombok.AllArgsConstructor;
import lombok.CustomLog;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "m_rating")
public class Rating {

    @Column(name = "movieId")
    private String movieId;
    @Column(name = "rating")
    private int rating;


}
