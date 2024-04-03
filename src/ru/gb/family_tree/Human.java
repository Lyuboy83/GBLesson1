package ru.gb.family_tree;

import java.time.LocalDate;
import java.util.List;

public class Human {
    String name;
    LocalDate dob, dot;
    Gender gender;
    List<Human> children;
    Human mother, father;

}
