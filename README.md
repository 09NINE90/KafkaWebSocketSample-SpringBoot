# KafkaWebSocketSample

### [UI websocket](https://github.com/09NINE90/KafkaWebSocketSampleFront)

### Start zookeeper
~~~
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties.
~~~
### Start kafka server
~~~
.\bin\windows\kafka-server-start.bat .\config\server.properties
~~~
### Create topic
~~~
.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1 --topic KafkaChat
~~~
### Check topic list
~~~
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
~~~
### Create a consumer to test
~~~
 .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic KafkaChat --fr
~~~
### Create producer to test
~~~
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic TestTopic
~~~

