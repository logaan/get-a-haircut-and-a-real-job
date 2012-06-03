(ns readchar
  (:use [clojure.reflect]
        [clojure.pprint]
        [clojure.java.io])
  (:import jline.UnixTerminal))

(defn -main []
  (let [term (new UnixTerminal)]
    (.initializeTerminal term)
    (println (.getTerminalWidth term))
    (println (.getTerminalHeight term))

    (println "Press a key")
    (println (char (.readCharacter term System/in)))))
