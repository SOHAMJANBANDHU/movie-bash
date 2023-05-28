package in.adgebra.microServices.DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "m_Catalog")
public class CatalogItem {
    @Column(name = "name")
    private String name;
    @Column(name = "desc")

    private String desc;
    @Column(name = "rating")
    private int rating;

}


