/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 *
 * @author HP
 */
public class Player {

    private String name;
    private String surname;
    private int age;

    public Player(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public static PlayerBuilder builder() {
        return new PlayerBuilder();
    }

    public static class PlayerBuilder {

        private Player p = null;

        public Player build() {
            return new Player(p.name, p.surname, p.age);

        }

        public PlayerBuilder() {
            p= new Player();
        }
        public PlayerBuilder setName(String name){
            p.name=name;
            return this;
        }
        public PlayerBuilder setSurame(String name){
            p.surname=name;
            return this;
        }
        public PlayerBuilder setAge(int name){
            p.age=name;
            return this;
        }

    }

}
