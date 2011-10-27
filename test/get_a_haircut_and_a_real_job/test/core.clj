(ns get-a-haircut-and-a-real-job.test.core
  (:use [get-a-haircut-and-a-real-job.core])
  (:use [clojure.test]))

(deftest centered-hello-world
  (home)
  (clear)

  (position 35 12)
  (foreground-blue)
  (background-yellow)
  (print "Hello world")
  (reset-all-attributes)

  (position 2 4)
  (print *in*)
  ;(print (get-char))

  (position 0 21))

