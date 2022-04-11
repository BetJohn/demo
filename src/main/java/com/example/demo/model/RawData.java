package com.example.demo.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class RawData {
    private ArrayList<Integer>numbers;
    private Operatie operatie;
}
