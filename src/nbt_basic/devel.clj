(ns nbt-basic.devel
  (:use nbt-basic.nbt
        [gloss.io :only [to-byte-buffer decode]]
        [clojure.java.io :only [file input-stream]]
        [clojure.tools.namespace.repl :only [refresh]]))

;(ns nbt-basic.devel)
;(use '[clojure.tools.namespace.repl :only (refresh)])
;(refresh)

(def filename "test.nbt")


(def data (with-open [f (input-stream filename)]
            (let [size (.length (file filename))
                  ba (byte-array size)]
              (.read f ba)
              (to-byte-buffer ba))))
