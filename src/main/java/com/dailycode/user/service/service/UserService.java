package com.dailycode.user.service.service;

import com.dailycode.user.service.entity.User;
import com.dailycode.user.service.repository.UserRepository;
import com.dailycode.user.service.responseobject.Department;
import com.dailycode.user.service.responseobject.RestTemplateOject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public User saveUser(User user) {
    return userRepository.save(user);

    }

    public RestTemplateOject getUserById(Long id) {
        RestTemplateOject restans = new RestTemplateOject();
        User user = userRepository.findByUserId(id);
        Department department = restTemplate.getForObject("http://Department-Service/department/"+user.getDepartmentId(),Department.class);
        restans.setUser(user);
        restans.setDepartment(department);
        return restans;
    }
}
