package in.adgebra.microServices3.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "m_UserRating")
public class UserRating {

    @Column(name = "userId")
    private String userId;
    @Column(name = "ratings")
    private List<Rating> ratings;

    public void initData(String userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating("100", 3),
                new Rating("220", 4),
                new Rating("200", 7),
                new Rating("440", 3),
                new Rating("120", 5)
        ));
    }

}
