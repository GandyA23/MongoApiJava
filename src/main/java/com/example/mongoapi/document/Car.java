package com.example.mongoapi.document;

import com.mongodb.lang.NonNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "cars")
@Data
public class Car implements Serializable {
    @Id
    @NonNull
    private String _id ;
    private String model ;
    private String brand ;
    private Integer year ;
    private String color ;
}
