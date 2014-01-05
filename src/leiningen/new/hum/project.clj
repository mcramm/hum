(defproject {{name}} "0.1.0-SNAPSHOT"
      :description "FIXME: write this!"
      :url "http://example.com/FIXME"

      :dependencies [[org.clojure/clojure "1.5.1"]
                     [org.clojure/clojurescript "0.0-2138"]
                     [om "0.1.4"]]

      :plugins [[lein-cljsbuild "1.0.1"]]

      :cljsbuild {
        :builds [{:id "dev"
                  :source-paths ["src"]
                  :compiler {
                    :output-to "{{sanitized}}.js"
                    :output-dir "out"
                    :optimizations :none
                    :source-map true
                    :externs ["om/externs/react.js"]}}]})
