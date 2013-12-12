package com.muni.fi.pa165.dto;

import com.muni.fi.pa165.enums.TerrainType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *Data transfer object for the {@link Area}.
 * 
 * @author irina
 */
@XmlRootElement
public class AreaDto implements Serializable {

    private Long id;
    private String name;
    private TerrainType terrain;
    private String description;
    private List<MonsterAreaDto> locations = new ArrayList<>();

    /**
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
    public TerrainType getTerrain() {
        return terrain;
    }

    /**
     *
     * @param terrain
     */
    public void setTerrain(TerrainType terrain) {
        this.terrain = terrain;
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
    public List<MonsterAreaDto> getLocations() {
        return locations;
    }

    /**
     *
     * @param locations
     */
    public void setLocations(List<MonsterAreaDto> locations) {
        this.locations = locations;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AreaDto other = (AreaDto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }
}
