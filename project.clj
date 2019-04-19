(defproject travelboss/logging "0.3.1"
  :description "Clojure logging with Logback and SLF4J plus request correlation across servers."
  :url "https://github.com/travelboss/logging"
  :license {:name "Apache Sofware License 2.0"
            :url  "http://www.apache.org/licenses/LICENSE-2.0.html"}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.slf4j/slf4j-api "1.7.25"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [org.clojure/tools.logging "0.4.1"]
                 [io.aviso/pretty "0.1.36"]
                 [org.slf4j/jcl-over-slf4j "1.7.25"]]

  :profiles
  {:dev
   {:dependencies
    [[speclj "3.3.2" :exclusions [org.clojure/clojure]]]}}

  :java-source-paths ["java-src"]

  :plugins [[speclj "3.3.2"]
            [lein-codox "0.10.3"]]

  :test-paths ["spec"]

  :aliases {"release" ["do"
                       "clean,"
                       "javac,"
                       "deploy" "clojars"]}

  :codox {:metadata   {:doc/format :markdown}
          :source-uri "https://github.com/AvisoNovate/logging/blob/master/{filepath}#L{line}"})
