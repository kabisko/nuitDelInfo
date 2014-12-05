/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package position;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "positon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Positon.findAll", query = "SELECT p FROM Positon p"),
    @NamedQuery(name = "Positon.findById", query = "SELECT p FROM Positon p WHERE p.id = :id"),
    @NamedQuery(name = "Positon.findByLongitude", query = "SELECT p FROM Positon p WHERE p.longitude = :longitude"),
    @NamedQuery(name = "Positon.findByLatitude", query = "SELECT p FROM Positon p WHERE p.latitude = :latitude"),
    @NamedQuery(name = "Positon.findByIdTypeMarker", query = "SELECT p FROM Positon p WHERE p.idTypeMarker = :idTypeMarker"),
    @NamedQuery(name = "Positon.findByRadius", query = "SELECT p FROM Positon p WHERE p.radius = :radius")})
public class Positon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitude")
    private double longitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitude")
    private double latitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTypeMarker")
    private int idTypeMarker;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "radius")
    private Double radius;

    public Positon() {
    }

    public Positon(Integer id) {
        this.id = id;
    }

    public Positon(Integer id, double longitude, double latitude, int idTypeMarker) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.idTypeMarker = idTypeMarker;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getIdTypeMarker() {
        return idTypeMarker;
    }

    public void setIdTypeMarker(int idTypeMarker) {
        this.idTypeMarker = idTypeMarker;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Positon)) {
            return false;
        }
        Positon other = (Positon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "position.Positon[ id=" + id + " ]";
    }
    
}
