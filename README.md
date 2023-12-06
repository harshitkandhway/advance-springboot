[![CircleCI](https://dl.circleci.com/status-badge/img/gh/harshitkandhway/advance-springboot/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/harshitkandhway/advance-springboot/tree/master)

# advance-springboot
## Implementation of advance Springboot concepts
- [ ] Basic endpoint implementation using controller, service, repository.
- [ ] Adding circleci for continuous Integration
- [ ] Adding Spotbugs and Checkstyle
- [ ] Introducing and implementation of Kafka
      

## Configuring kafka to a spring-boot application
1) Run Zookeeper on your local cmd 
~~~ 
> bin\windows\zookeeper-server-start.bat etc\kafka\zookeeper.properties
~~~
2) Start the Kafka server 
~~~
bin\windows\kafka-server-start.bat etc\kafka\server.properties
~~~
3) Create a topic 
~~~
>bin\windows\kafka-topics.bat --create --topic mytopic --partitions 1 --bootstrap-server localhost:9092
~~~
4) Start your spring-boot application and hit the /send endpoint using postman.
5) The message will automatically be consumed by the controller method where @KafkaListener is used at method level
