(ns fizbuzz-kata.fizzbuzz)

(defn is-multiple?
  [value div]
  (= 0 (mod value div)))

(defn fizzbuzz
  [value]
  (cond
    (is-multiple? value 3) "Fizz"
    (is-multiple? value 5) "Buzz"
    :else (str value)))






