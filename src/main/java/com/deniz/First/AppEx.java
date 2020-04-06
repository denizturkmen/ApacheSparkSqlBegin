package com.deniz.First;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.RelationalGroupedDataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class AppEx {
    public static void main(String[] args) {
       // System.setProperty("hadoop.home.dir","C:\\Users\\turkm\\Downloads\\Compressed\\hadoop-common-2.2.0-bin-master\\bin");
        SparkSession sparkSession = SparkSession.builder().appName("FirstSql").master("local").getOrCreate();

        Dataset<Row> data = sparkSession.read().json("C:\\Users\\turkm\\IdeaProjects\\ApacheSparkSql\\person.json");
        //veriyi görmek için
        data.show();
        //verinin başlıklarını görmek için
        data.printSchema();

        Dataset<Row> data_select = data.select("name", "age");
        data_select.show();

        Dataset<Row> sum = data.groupBy("city").sum("age");
        sum.show();


    }
}
