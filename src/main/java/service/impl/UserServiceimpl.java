package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import entity.User;
import service.UserService;
@Transactional
@Service
public class UserServiceimpl implements UserService{
    @Autowired
    private UserDao userdao;

    public List<User> findAll() {
        // TODO Auto-generated method stub
        return userdao.findAll();
    }

    public int insert(User t) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int update(User t, int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    public int delete(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    public User findById(int id) {
        System.out.println("hello");
        return null;
    }


}