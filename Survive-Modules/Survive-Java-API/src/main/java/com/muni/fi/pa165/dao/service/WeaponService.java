/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muni.fi.pa165.dao.service;


import com.muni.fi.pa165.dto.WeaponDto;

/**
 *
 * @author Michal Vinkler
 */
public interface WeaponService {

    /**
     * Saves WeaponDto
     *
     * @param weapon object of type WeaponDto
     */
    public WeaponDto save(WeaponDto dto);

    /**
     * Updates WeaponDto
     *
     * @param weapon object of type WeaponDto
     */
    public WeaponDto update(WeaponDto dto);

    /**
     * Deletes WeaponDto
     *
     * @param weapon object of type WeaponDto
     */
    public void delete(WeaponDto dto);

    /**
     * Finds WeaponDto by id
     *
     * @param id ID of the weapon
     * @return Weapon object of type WeaponDto
     */
    public WeaponDto findById(Long id);

    public boolean checkAvailable(String name);
}
