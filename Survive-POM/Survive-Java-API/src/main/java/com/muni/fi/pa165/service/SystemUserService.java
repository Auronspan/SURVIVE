package com.muni.fi.pa165.service;

import com.muni.fi.pa165.dto.SystemUserDto;
import java.util.List;

/**
 *
 * @author Auron
 */
public interface SystemUserService {

    boolean exists(Long id) throws IllegalArgumentException;

    public SystemUserDto save(SystemUserDto dto);

    /**
     * Updates WeaponDto
     *
     * @param weapon object of type WeaponDto
     */
    public SystemUserDto update(SystemUserDto dto);

    /**
     * Deletes WeaponDto
     *
     * @param weapon object of type WeaponDto
     */
    public void delete(SystemUserDto dto);

    /**
     * Finds WeaponDto by id
     *
     * @param id ID of the weapon
     * @return Weapon object of type WeaponDto
     */
    public SystemUserDto findById(Long id);

    public List<SystemUserDto> findAll();

    public void delete(Long id);
}
