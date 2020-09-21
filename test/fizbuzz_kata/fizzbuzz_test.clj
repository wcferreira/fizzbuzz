(ns fizbuzz-kata.fizzbuzz-test
  (:require [clojure.test :refer :all]
            [fizbuzz-kata.fizzbuzz :as fb]))


(deftest test-can-call-fizzbuzz
  (is (= 1 (fb/fizzbuzz 1))))
