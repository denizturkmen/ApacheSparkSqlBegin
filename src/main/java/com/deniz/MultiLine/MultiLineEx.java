package com.deniz.MultiLine;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class MultiLineEx {
    public static void main(String[] args) {

        SparkSession sparkSession = SparkSession.builder().appName("FirstSql").master("local").getOrCreate();
        Dataset<Row> data = sparkSession.read().option("multiline",true).json("C:\\Users\\turkm\\IdeaProjects\\ApacheSparkSql\\person1.json");
        data.show();
    }
}
