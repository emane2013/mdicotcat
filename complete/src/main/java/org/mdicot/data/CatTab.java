package org.mdicot.data;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author linux
 */
@Entity
@Table(name = "cat_tab")
public class CatTab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     
    private Integer id;
     
    private Integer art;
     
    private String fracc;
    
    private String inciso;
     
    private String descc;
     
    private Integer umaMin;
    
    private Integer umaMax;
    
    private Integer umas;

    
     
    private String reglamento;
    
    private Date fecmod;
     
    private Date feccre;
    
    private String adduser;
     
    private String moduser;

    public CatTab() {
    }

    public CatTab(Integer id) {
        this.id = id;
    }

    public CatTab(Integer id, Date fecmod, Date feccre) {
        this.id = id;
        this.fecmod = fecmod;
        this.feccre = feccre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArt() {
        return art;
    }

    public void setArt(Integer art) {
        this.art = art;
    }

    public String getFracc() {
        return fracc;
    }

    public void setFracc(String fracc) {
        this.fracc = fracc;
    }

    public String getInciso() {
        return inciso;
    }

    public void setInciso(String inciso) {
        this.inciso = inciso;
    }

    public String getDescc() {
        return descc;
    }

    public void setDescc(String descc) {
        this.descc = descc;
    }

    public Integer getUmaMin() {
        return umaMin;
    }

    public void setUmaMin(Integer umaMin) {
        this.umaMin = umaMin;
    }

    public Integer getUmaMax() {
        return umaMax;
    }

    public void setUmaMax(Integer umaMax) {
        this.umaMax = umaMax;
    }


    public Integer getUmas() {
        return umas;
    }

    public void setUmas(Integer umas) {
        this.umas = umas;
    }

    public String getReglamento() {
        return reglamento;
    }

    public void setReglamento(String reglamento) {
        this.reglamento = reglamento;
    }

    public Date getFecmod() {
        return fecmod;
    }

    public void setFecmod(Date fecmod) {
        this.fecmod = fecmod;
    }

    public Date getFeccre() {
        return feccre;
    }

    public void setFeccre(Date feccre) {
        this.feccre = feccre;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser;
    }

    public String getModuser() {
        return moduser;
    }

    public void setModuser(String moduser) {
        this.moduser = moduser;
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
        if (!(object instanceof CatTab)) {
            return false;
        }
        CatTab other = (CatTab) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.meverdicot.appc.ejb.entity.CatTab[ id=" + id + " ]";
    }
    
}
