(ns
  ^{:author junjie}
  org.rsql.redis-test
  (:require [clojure.test :refer :all]
            [org.rsql.redis :refer :all]))

(deftest demo-test
  (testing "demo-test: org.rsql.redis/demo"
    (is (= "abcd" (demo "as0" 6379 100)) "redis connection")))


