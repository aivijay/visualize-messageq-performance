(defproject messageq-perf-test "0.1.0-SNAPSHOT"
  :description "FIXME: Runs performance tests on an AMQP message queue broker/server, collects stats and generates a plot showing total messages vs messages/sec consumed"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main messageq-perf-test.perf-test
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [incanter "1.9.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/tools.logging "0.2.6"]
                 [org.apache.geronimo.specs/geronimo-jms_1.1_spec "1.1.1"]
                 [org.apache.qpid/qpid-client "0.22"]
                 [org.apache.qpid/qpid-broker "0.22"]
                 [clj-http "0.7.6"]
                 [rabbitmq-client "1.7.0"]])
