(ns org.rsql.core-test
  (:require [clojure.test :refer :all]
            [org.rsql.core :refer :all]))

(deftest core-test
  (testing "core-test: org.rsql.core/parse-opts"
    (is (= ["xxx"] (parse-opts ["xxx"])))))

