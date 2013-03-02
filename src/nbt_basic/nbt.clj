(ns nbt-basic.nbt

  (:use clojure.java.io
        gloss.core
        [gloss.data.bytes.core :exclude (byte-count)]
        [gloss.core.protocols :exclude (sizeof)]
        gloss.io))

(defcodec tag-type (enum :byte {:TAG_String     8
                                :TAG_Compound   10}))

(defcodec sized-string (finite-frame :uint16-be 
                                     (string :utf-8)))

(defcodec tag-string 
  (ordered-map :tag-type    :TAG_String 
               :tag-name    sized-string
               :payload     sized-string))

(defcodec tag-compound-ugly
  (ordered-map  :tag-type tag-type
                :tag-name sized-string
                :child    tag-type
                :payload  tag-string
                :end      :byte))
