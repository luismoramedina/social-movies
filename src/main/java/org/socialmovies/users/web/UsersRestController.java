package org.socialmovies.users.web;

import org.socialmovies.users.data.User;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

/**
 * @author luismoramedina
 */
@RequestMapping("/user")
@RestController
public class UsersRestController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User register(@RequestBody User user) {
        Assert.isTrue(user.password.equals(user.repeat), "password and repeat must be the same");
        user.clearPasswords();
        return user;
    }

    @RequestMapping(value = "/{nickname}", method = RequestMethod.GET)
    @ResponseBody
    public User register(@PathVariable String nickname) {
        User user = new User();
        user.nickname = nickname;
        return user;
    }
}
