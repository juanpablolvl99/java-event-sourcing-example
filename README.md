# Event Sourcing Example :coffee:

This is a simple in-memory java implementation of Martin Fowler Ship Tracking example, that was used in [this article](https://martinfowler.com/eaaDev/EventSourcing.html).

## How run this project

```
// clone this repository
git clone https://github.com/juanpablolvl99/java-event-sourcing-example <name_dir>
cd <name_dir>
mvn clean compile
java -cp target/classes/ es.example.Loader
// and the logs will be printed
```

You will need instal the [ActiveMQ](http://activemq.apache.org/) from Apache and create a topic named ```es.ship.Topic``` to make this example run correctly

## Future additions

1. Transfer all the project to a Docker containers environment
