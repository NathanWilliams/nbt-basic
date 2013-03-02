(defproject nbt-basic "0.1.0-SNAPSHOT"
  :description "Example code for reading the simple hello_world.nbt file"
  :url "http://github.com/NathanWilliams/nbt-basic"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [gloss "0.2.2-beta5"] ;DSL for reading binary data
                 [org.clojure/tools.namespace "0.2.2"]]) ;Used to refresh the repl during development
