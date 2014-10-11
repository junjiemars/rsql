(defproject rsql "0.1.0"
  :description "Redis SQL interface"
  :url "http://rsql.org"
  :license {:name "Apache License Version 2"
            :url "http://www.apache.org/licenses/"}
  :main ^:skip-aot org.rsql.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [redis.clients/jedis "2.6.0"]
                 [gnu.getopt/java-getopt "1.0.13"]]
  :jvm-opts ["-Dline.separator=\n"]
  )
