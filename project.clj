(defproject rsql "0.1.0"
  :description "Redis SQL interface"
  :url "http://rsql.org"
  :license {:name "Apache License Version 2"
            :url "http://www.apache.org/licenses/"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot org.rsql.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
