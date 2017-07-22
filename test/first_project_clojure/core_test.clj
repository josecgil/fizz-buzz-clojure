(ns first-project-clojure.core-test
  (:require [clojure.test :refer :all]
            [first-project-clojure.core :refer :all]))

(defn- num-is [num value]
  (testing str num
    (is (= value (fizzbuzz num)))
    )
  )

(deftest values-1-to-15
  (num-is 1 1)
  (num-is 2 2)
  (num-is 3 "fizz")
  (num-is 4 4)
  (num-is 5 "buzz")
  (num-is 6 "fizz")
  (num-is 7 7)
  (num-is 8 8)
  (num-is 9 "fizz")
  (num-is 10 "buzz")
  (num-is 11 11)
  (num-is 12 "fizz")
  (num-is 13 13)
  (num-is 14 14)
  (num-is 15 "fizzbuzz")
)
