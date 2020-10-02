package lk.spark.sample.service;

import lk.spark.sample.dao.User;
import lk.spark.sample.repository.UserRepo;

public class UserServiceImpl implements UserService{
    @Override
    public String registerUser(User user) {
        UserRepo userRepo = new UserRepo();
        String result = userRepo.userRegister(user);
        if(result.equals("success"){
            return "User register succesful";
        }else{
            return "User register unsucceful";
        }
    }

    @Override
    public String loginUser(String userName, String password) {
        UserRepo userRepo = new UserRepo();
        String name = userRepo.userLogin(userName, password);
        if(result.equals("success"){
            return name;
        }else{
            return "User login unsucceful";
        }
        
    }
}
