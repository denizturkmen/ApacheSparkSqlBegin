package com.deniz.Encoder;

import com.deniz.Model.Person;
import org.apache.spark.sql.*;

public class EncoderEx {
    public static void main(String[] args) {


        SparkSession sparkSession = SparkSession.builder().appName("FirstSql").master("local").getOrCreate();

        Encoder<Person> personEncoder = Encoders.bean(Person.class);
        Dataset<Person> data = sparkSession.read()
                .json("C:\\Users\\turkm\\IdeaProjects\\ApacheSparkSql\\person.json")
                .as(personEncoder);

        data.foreach(k->{
            System.out.println(k.getAge());
        });

    }
}
