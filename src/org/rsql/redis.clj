(ns
  ^{:author junjie}
  org.rsql.redis
  (:import
    [redis.clients.jedis Jedis]))

(defn demo
  [host port timeout]
  (let []
    (def j (new Jedis host port timeout))
    (.connect j)
    (println (.set j "k" "abcd"))
    (println (.get j "k"))
    (.get j "k")
    ))

(demo "as0" 6379 100)

