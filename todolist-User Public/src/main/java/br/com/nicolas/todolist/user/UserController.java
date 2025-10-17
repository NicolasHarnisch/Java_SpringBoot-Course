package br.com.nicolas.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    /**
     * Modificador
     * public
     * private
     * protected
     */

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Integer (int) numeros inteiro
     * Double (double) numeros 0.0000
     * Char (A C )
     * Date (data)
     * Void
     */

     /**
      * Body
      */

    @PostMapping("/")
    public void creat(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);

    }
    
}
