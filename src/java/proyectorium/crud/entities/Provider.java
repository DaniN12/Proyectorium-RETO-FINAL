/*
Entity class for providers
 */
package proyectorium.crud.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dani
 */
@Entity
@Table(name="proyectorum", schema="provider")
@XmlRootElement
public class Provider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer idProvider;



    private String email;

    private String name;

    private Integer phone;

    private Date contactIn;

    private Date contactEnd;

    private Float price;

    
    public Provider(){
    
    }
    
    public Integer getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Integer idProvider) {
        this.idProvider = idProvider;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getContactIn() {
        return contactIn;
    }

    public void setContactIn(Date contactIn) {
        this.contactIn = contactIn;
    }

    public Date getContactEnd() {
        return contactEnd;
    }

    public void setContactEnd(Date contactEnd) {
        this.contactEnd = contactEnd;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
