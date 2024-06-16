package org.example.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Card {

    private String name;
    private int population;
    private int economy;
    private int military;
    private int resources;
    private int danger;

}