(ns fizbuzz-kata.fizzbuzz)

(defn is-multiple?
  [value div]
  (= 0 (mod value div)))

(defn fizzbuzz
  [value]
  (println "Calling fizzbuzz with value of" value)
  (cond
    (and (is-multiple? value 3) (is-multiple? value 5)) "FizzBuzz"
    (is-multiple? value 3) "Fizz"
    (is-multiple? value 5) "Buzz"
    :else (str value)))






