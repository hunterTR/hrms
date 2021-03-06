package com.hrms.services;

import java.util.List;

import com.hrms.domain.Role;
import com.hrms.domain.User;

public interface RoleService {
	public List<User> getUsersByRoleName(String rolename);
	public List<Role> getAll();
	public Role getByName(String name);
	public Role save(Role role);
	public void delete(Long id);
}
