"UPSERT INTO HMS.prashant_meeting_details(timestamp,call_duration,total_joined,locus_type,meeting_location,organization_id,meeting_count,seq_num) ",
      "SELECT CEIL(timestamp, 'HOUR',8) as trunc_time, ",
      "cast(sum(call_duration) as Integer) as call_duration, total_joined,locus_type,meeting_location, organization_id, ",
      "cast(count(locus_type) as Integer) as meeting_count, NEXT VALUE FOR HMS.meeting_details_aggr_sequence as seq_num ",
      "FROM HMS.meeting_details ",
      "WHERE timestamp >= TO_TIMESTAMP('START_TIME') AND timestamp < TO_TIMESTAMP('END_TIME') ",
      "GROUP BY locus_type,meeting_location, organization_id, trunc_time,total_joined "



      —-aggregationConfig=aggregation_queries_10min.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpsj1flu003.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      —-aggregationConfig=aggregation_queries_10min.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpsj1flu003.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      —-aggregationConfig=aggregation_queries_10min.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpbt1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp


      —-aggregationConfig=aggregation_queries_10min.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpbt1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword="Em3F!-fY" --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      —-aggregationConfig=aggregation_queries_10min.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpbt1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword="Em3F!-fY" --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      —-aggregationConfig=aggregation_queries_10min.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpbt1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword="Em3F!-fY" --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      --aggregationConfig=aggregation_queries_10min.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpsj1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      --aggregationConfig=aggregation_config.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpsj1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      --aggregationConfig=aggregation_config.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpsj1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      --aggregationConfig=aggregation_config.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpsj1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics=bt1-kafka-s.webex.com:9092 --kafkaTopicForMetrics=bt1_logstash_wap_webex_clp

      --aggregationConfig=aggregation_config.json --appName=Test_Job_Batch_Aggregation --zookeeperHost=${zookeeperURL} --mySQLHost="rpbt1flu002.webex.com" --mySQLPort=3306 --mySQLUser=videomesh --mySQLPassword=${pass} --mySQLDbName="videomesh" --kafkaServerForMetrics="bt1-kafka-s.webex.com:9092" --kafkaTopicForMetrics="bt1_logstash_wap_webex_clp"