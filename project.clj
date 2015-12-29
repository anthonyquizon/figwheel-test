(defproject figwheel-test "0.1.0-SNAPSHOT"
  :description "Virtual DOM with signals"
  :url "https://github.com/anthoq88/figwheel-test"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [org.clojure/test.check "0.9.0"]]
  
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-1"]]

  :source-paths ["src"]

  :aliases {"up" ["figwheel" "examples"]}

  :cljsbuild {:builds
              [{:id "examples" 
                :source-paths ["src"]
                :figwheel true
                :compiler {:main figwheel-test.core
                           :asset-path "/js/compiled/out"
                           :output-to "resources/public/js/compiled/figwheel-test.js"
                           :output-dir "resources/public/js/compiled/out"
                           :optimizations :none
                           :source-map-timestamp true}}
               ]}
  
  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]
  
  :figwheel {:css-dirs ["resources/public/css"]
             :server-port 8000})
