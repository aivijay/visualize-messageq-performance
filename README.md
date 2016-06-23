# visualize-messageq-performance 

A Clojure library to visualize the performance test of an AMQP message queue (eg., Apache QPID, RabbitMQ etc) running on port 5672 with AMQP protocol version 0.8 or higher. Produces a set of messages and consumes it collecting stats on the total messages/second consumed from the produced total messages for each block. Finally generates a plot for total messages vs messages/second for the AMQP broker.

## Usage

To run, at the root folder 

```
$ lein run 
```

To create a uberjar run

```
$ lein uberjar
```

To run the standalone uberjar

```
$ cd target

$ java -jar messageq-perf-test-0.1.0-SNAPSHOT-standalone.jar
```

The above will start running the performance tests for each set of messages 3 times from 1 to 5000 and finally generates a plot. You can distribute the uberjar and run as above on the host where you want to perform the performance test. 

To generate more messages to test, edit perf-test.clj for test-msg-count vector and add more higher counts like 10000 50000 100000 etc., This will give you more accurate performance characteristics of the message queue. Then do a uberjar and run.

Screenshot

![alt text][logo]

[logo]: https://github.com/aivijay/visualize-messageq-performance/blob/master/doc/screenshot1.png "Plot"

## Credits:

This code base has code from 

<https://github.com/kyleburton/sandbox/tree/master>

The above code base has this mixed with a whole bunch of other stuff. Stripped down only the visualizing part and migrated it to a leiningen project with some fixes as needed for the project to work independently doing the performance test. As the code was developed in 2009, some things have changed and those were fixed to function properly. 

The following blog post provides the rationale behind this tool.

<http://asymmetrical-view.com/2009/06/02/incanter-amqp-benchmark.html>

## License

Copyright © 2016 aivijay

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
