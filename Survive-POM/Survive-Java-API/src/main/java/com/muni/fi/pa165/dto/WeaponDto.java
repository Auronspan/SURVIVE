package com.muni.fi.pa165.dto;

import com.muni.fi.pa165.enums.WeaponClass;
import com.muni.fi.pa165.enums.WeaponType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Data transfer object for the {@link Weapon}.
 *
 * @author Michal Vinkler
 */
@XmlRootElement
public class WeaponDto {

    private Long id;
    private String name;
    private WeaponType weaponType;
    private WeaponClass weaponClass;
    private Integer range;
    private Double caliber;
    private Integer rounds;
    private String description;
    private List<MonsterWeaponDto> efficiencies = new ArrayList<>();

    /**
     *
     * @return
     */
    public Double getCaliber() {
        return caliber;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param weaponId
     */
    public void setId(Long weaponId) {
        this.id = weaponId;
    }

    /**
     *
     * @return
     */
    public WeaponType getWeaponType() {
        return weaponType;
    }

    /**
     *
     * @param weaponType
     */
    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    /**
     *
     * @return
     */
    public WeaponClass getWeaponClass() {
        return weaponClass;
    }

    /**
     *
     * @param weaponClass
     */
    public void setWeaponClass(WeaponClass weaponClass) {
        this.weaponClass = weaponClass;
    }

    /**
     *
     * @return
     */
    public Integer getRange() {
        return range;
    }

    /**
     *
     * @param range
     */
    public void setRange(Integer range) {
        this.range = range;
    }

    /**
     *
     * @param caliber
     */
    public void setCaliber(Double caliber) {
        this.caliber = caliber;
    }

    /**
     *
     * @return
     */
    public Integer getRounds() {
        return rounds;
    }

    /**
     *
     * @param rounds
     */
    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public List<MonsterWeaponDto> getEfficiencies() {
        return efficiencies;
    }

    /**
     *
     * @param efficiencies
     */
    public void setEfficiencies(List<MonsterWeaponDto> efficiencies) {
        this.efficiencies = efficiencies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.weaponType);
        hash = 89 * hash + Objects.hashCode(this.weaponClass);
        hash = 89 * hash + Objects.hashCode(this.range);
        hash = 89 * hash + Objects.hashCode(this.caliber);
        hash = 89 * hash + Objects.hashCode(this.rounds);
        hash = 89 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WeaponDto other = (WeaponDto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.weaponType != other.weaponType) {
            return false;
        }
        if (this.weaponClass != other.weaponClass) {
            return false;
        }
        if (!Objects.equals(this.range, other.range)) {
            return false;
        }
        if (!Objects.equals(this.caliber, other.caliber)) {
            return false;
        }
        if (!Objects.equals(this.rounds, other.rounds)) {
            return false;
        }
        return true;
    }
}
