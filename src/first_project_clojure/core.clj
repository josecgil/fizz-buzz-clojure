(ns first-project-clojure.core)

(defn- is-fizz [n]
  (if (= 0 (mod n 3)) true false)
)

(defn- is-buzz [n]
  (if (= 0 (mod n 5)) true false)
  )

(defn fizzbuzz [n]
  (cond
    (and (is-fizz n) (is-buzz n) )  "fizzbuzz"
    (is-fizz n)  "fizz"
    (is-buzz n) "buzz"
    :else n)
)
