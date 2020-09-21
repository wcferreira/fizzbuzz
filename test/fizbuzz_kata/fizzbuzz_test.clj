(ns fizbuzz-kata.fizzbuzz-test
  (:require [clojure.test :refer :all]
            [fizbuzz-kata.fizzbuzz :as fb]))


(deftest test-returns-1-with-1-passed-in
  (let [ret-val (fb/fizzbuzz 1)]
    (is (= "1" ret-val))))

