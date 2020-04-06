package com.deniz.Filter;

import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class FilterEx {
    public static void main(String[] args) {
        SparkSession sparkSession = SparkSession.builder().appName("FirstSql").master("local").getOrCreate();

        Dataset<Row> data = sparkSession.read().json("C:\\Users\\turkm\\IdeaProjects\\ApacheSparkSql\\person.json");
        data.show();

        Dataset<Row> age = data.filter(new Column("age").equalTo("33"));
        age.show();

        Dataset<Row> filter = data.filter(new Column("name").contains("e"));
        filter.show();
    }
}
