/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import exercises.Player;
import exercises.Player.PlayerBuilder;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
     PlayerBuilder pb=Player.builder();
     pb.setName("Ali");
     Player p=pb.build();
        System.out.println(p.getName()+p.getSurname()+p.getAge());
     }
}