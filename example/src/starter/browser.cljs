(ns starter.browser
  (:require
   [reagent.dom :as rdom]
   [re-echarts.core :refer [ECharts]]))

(defn myechart []
  [:> ECharts
      {:style {:width "800px" :height "600px"}
       :theme "dark"
       :option
       {:title {:text "Echarts is here"}
        :dataset {:dimention [:Week :Value]
                  :source [{:Week "Mon" :Value 820} {:Week "Tue" :Value 932} {:Week "Wed" :Value 901}
                           {:Week "Thu" :Value 934} {:Week "Fri" :Value 1220} {:Week "Sat" :Value 820}
                           {:Week "Sun" :Value 990}]}
        :xAxis {:type "category"}
        :yAxis {:type "value"}
        :series [{:type "line"
                  :smooth true}]}}])

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (js/console.log "start")
  (rdom/render [#'myechart] (.getElementById js/document "app")))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
