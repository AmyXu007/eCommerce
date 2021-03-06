/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityClasses;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author amy
 */
@Entity
@Table(name = "Orderdetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdetails.findAll", query = "SELECT o FROM Orderdetails o"),
    @NamedQuery(name = "Orderdetails.findByDetailID", query = "SELECT o FROM Orderdetails o WHERE o.detailID = :detailID"),
    @NamedQuery(name = "Orderdetails.findByDetailOrderID", query = "SELECT o FROM Orderdetails o WHERE o.detailOrderID = :detailOrderID"),
    @NamedQuery(name = "Orderdetails.findByDetailProductID", query = "SELECT o FROM Orderdetails o WHERE o.detailProductID = :detailProductID"),
    @NamedQuery(name = "Orderdetails.findByDetailName", query = "SELECT o FROM Orderdetails o WHERE o.detailName = :detailName"),
    @NamedQuery(name = "Orderdetails.findByDetailPrice", query = "SELECT o FROM Orderdetails o WHERE o.detailPrice = :detailPrice"),
    @NamedQuery(name = "Orderdetails.findByDetailQuantity", query = "SELECT o FROM Orderdetails o WHERE o.detailQuantity = :detailQuantity")})
public class Orderdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Detail_ID")
    private Integer detailID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Detail_OrderID")
    private int detailOrderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Detail_ProductID")
    private int detailProductID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Detail_Name")
    private String detailName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Detail_Price")
    private float detailPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Detail_Quantity")
    private int detailQuantity;

    public Orderdetails() {
    }

    public Orderdetails(Integer detailID) {
        this.detailID = detailID;
    }

    public Orderdetails(Integer detailID, int detailOrderID, int detailProductID, String detailName, float detailPrice, int detailQuantity) {
        this.detailID = detailID;
        this.detailOrderID = detailOrderID;
        this.detailProductID = detailProductID;
        this.detailName = detailName;
        this.detailPrice = detailPrice;
        this.detailQuantity = detailQuantity;
    }

    public Integer getDetailID() {
        return detailID;
    }

    public void setDetailID(Integer detailID) {
        this.detailID = detailID;
    }

    public int getDetailOrderID() {
        return detailOrderID;
    }

    public void setDetailOrderID(int detailOrderID) {
        this.detailOrderID = detailOrderID;
    }

    public int getDetailProductID() {
        return detailProductID;
    }

    public void setDetailProductID(int detailProductID) {
        this.detailProductID = detailProductID;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public float getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(float detailPrice) {
        this.detailPrice = detailPrice;
    }

    public int getDetailQuantity() {
        return detailQuantity;
    }

    public void setDetailQuantity(int detailQuantity) {
        this.detailQuantity = detailQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detailID != null ? detailID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetails)) {
            return false;
        }
        Orderdetails other = (Orderdetails) object;
        if ((this.detailID == null && other.detailID != null) || (this.detailID != null && !this.detailID.equals(other.detailID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EntityClasses.Orderdetails[ detailID=" + detailID + " ]";
    }
    
}
