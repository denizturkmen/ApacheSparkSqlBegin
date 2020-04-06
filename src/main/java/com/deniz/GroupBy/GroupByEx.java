package com.deniz.GroupBy;

import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class GroupByEx {
    public static void main(String[] args) {
        //Sql aggregation metotları nı kullanarak grouplayabilirsin

        SparkSession sparkSession = SparkSession.builder().appName("FirstSql").master("local").getOrCreate();

        Dataset<Row> data = sparkSession.read().json("C:\\Users\\turkm\\IdeaProjects\\ApacheSparkSql\\person.json");
        data.show();

        Dataset<Row> city = data.groupBy("city").count();
        city.show();

        Dataset<Row> age = data.groupBy("city").avg("age");
        age.show();

        Dataset<Row> max = data.groupBy(new Column("city")).max("age");
        max.show();

        data.groupBy("city").min("age").show();

    }
}
