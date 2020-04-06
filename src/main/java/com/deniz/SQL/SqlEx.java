package com.deniz.SQL;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SqlEx {
    public static void main(String[] args) {

        SparkSession sparkSession = SparkSession.builder().appName("FirstSql").master("local").getOrCreate();

        Dataset<Row> data = sparkSession.read().json("C:\\Users\\turkm\\IdeaProjects\\ApacheSparkSql\\person.json");

        //klasiksqliçin
        data.createOrReplaceTempView("person");
        Dataset<Row> sql = sparkSession.sql("select * from person where age<33");
        sql.show();


    }
}
