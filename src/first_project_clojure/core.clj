(ns first-project-clojure.core)

(defn- is-fizz [number]
  (= 0 (mod number 3))
)

(defn- is-buzz [number]
  (= 0 (mod number 5))
)


(defn fizzbuzz [number]
    (def number-is-fizz (is-fizz number))
    (def number-is-buzz (is-buzz number))

    (cond
      (and number-is-fizz number-is-buzz)  "fizzbuzz"
      number-is-fizz "fizz"
      number-is-buzz "buzz"
      :else number)
)
