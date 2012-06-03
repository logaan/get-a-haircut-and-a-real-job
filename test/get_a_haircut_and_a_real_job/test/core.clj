(ns get-a-haircut-and-a-real-job.test.core
  (:use [clojure.reflect]
        [clojure.test]
        [clojure.pprint]
        [clojure.java.io])
  (:import jline.UnixTerminal))

(deftest stuff
  (let [term (new UnixTerminal)]
    (.initializeTerminal term)
    (pprint (.getTerminalWidth term))
    (pprint (.getTerminalHeight term))
    ;(pprint (.readCharacter term System/in))
  ))

; (deftest jlineing
;   (let [terminal (new UnixTerminal)]
;     ;(.initializeTerminal terminal)
;     (println "foo")
;     (println (type getTerminalHeight)))
;     ;(println (. terminal getTerminalHeight)))
;   (is (= true true)))

; (deftest centered-hello-world
;   (home)
;   (clear)
; 
;   (position 35 12)
;   (foreground-blue)
;   (background-yellow)
;   (print "Hello world")
;   (reset-all-attributes)
; 
;   (position 2 4)
;   ;(print *in*)
;   (print (get-char))
; 
;   (position 0 21))

