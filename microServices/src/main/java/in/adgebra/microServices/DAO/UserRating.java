package in.adgebra.microServices.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "m_userRating")
public class UserRating {

    @Column(name = "userId")
    private String userId;
    @Column(name = "ratings")
    private List<Rating> ratings;

}

