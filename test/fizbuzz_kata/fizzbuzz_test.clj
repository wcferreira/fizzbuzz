(ns fizbuzz-kata.fizzbuzz-test
  (:require [clojure.test :refer :all]
            [fizbuzz-kata.fizzbuzz :as fb]))


(deftest test-returns-1-with-1-passed-in
  (let [ret-val (fb/fizzbuzz 1)]
    (is (= "1" ret-val) "It should return \"1\" when 1 passed in")))

(deftest test-returns-2-with-2-passed-in
  (let [ret-val (fb/fizzbuzz 2)]
    (is (= "2" ret-val) "It should return \"2\" when 2 passed in")))

(deftest test-returns-fizz-with-3-passed-in
  (let [ret-val (fb/fizzbuzz 3)]
    (is (= "Fizz" ret-val) "It should return \"Fizz\" when 3 passed in")))

(deftest test-returns-buzz-with-5-passed-in
  (let [ret-val (fb/fizzbuzz 5)]
    (is (= "Buzz" ret-val) "It should return \"Buzz\" when 5 passed in")))
