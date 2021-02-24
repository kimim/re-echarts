(ns re-echarts.core
  (:require
   [react :as react]
   [reagent.core :as r]
   [echarts :as echarts]))

(defn ECharts [options]
  (r/as-element
   (let [mychart (react/useRef nil)]
     (react/useEffect (fn []
                        (set! (.-chart js/document)
                              (echarts/init (.-current mychart) (.-theme options)))
                        (.setOption (.-chart js/document) (.-option options)))
                      (clj->js [options js/ResizeObserver]))
     [:div {:ref mychart
            :style (.-style options)}])))
