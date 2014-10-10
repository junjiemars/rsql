(ns
  ^{:author junjie}
  org.rsql.core
  (:gen-class)
  (:require org.rsql.redis))

(defn parse-opts
  [& args]
  (let []
    (println (str "in parse opts" (first args) "!"))
    (first args)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let []
    (parse-opts args)))

