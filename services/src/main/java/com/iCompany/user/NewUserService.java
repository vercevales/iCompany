package com.iCompany.user;

import com.iCompany.entities.user.User;
import com.iCompany.entities.user.UserType;
import com.iCompany.repositories.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lukasz Franczuk on 17.02.16.
 */
@Service
public class NewUserService {

    @Autowired
    UserRepository userRepository;

//    @PostConstruct
//    public void init(){
//        saveTestUser();
//    }

    public void saveTestUser() {
        User user = new User();
        user.setName("Lukasz");
        user.setSurname("Franczuk");
        user.setEmail("luk.franczuk@gmail.com");
        user.setPassword("blablabla");
        user.setUserType(UserType.ADMINISTRATOR);
        userRepository.saveAndFlush(user);
    }
}
