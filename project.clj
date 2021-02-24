(defproject re-echarts/re-echarts "5.0.2"
  :description "React ECharts wrapper in ClojureScript"
  :url "https://github.com/kimim/re-echarts"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  ;; always use "provided" for Clojure(Script)
  [[org.clojure/clojurescript "1.10.520" :scope "provided"]
   [reagent "1.0.0"]]

  :repositories
  {"clojars" {:url "https://clojars.org/repo"
              :sign-releases false}}

  :source-paths
  ["src"])
