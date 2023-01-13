package MicroServices.UserService.Service;


import MicroServices.UserService.Entity.User;
import MicroServices.UserService.Repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Slf4j
@Service
public class UserService {

    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User getUser(Long userId) {
      return  userRepository.findById(userId).get();
    }

    public ResponseEntity<?> saveUser(User user) {
        log.info("Inside Save User of Service ");
        return ResponseEntity.of(Optional.of((User)this.userRepository.save(user)));
    }
}
