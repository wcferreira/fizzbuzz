(ns fizbuzz-kata.fizzbuzz)

(defn fizzbuzz
  [value]
  (cond
    (= 0 (mod value 3)) "Fizz"
    (= 0 (mod value 5)) "Buzz"
    :else (str value)))






