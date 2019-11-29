(ns js-modules-test.core
  (:require ["js-joda" :as js-joda]))

(println (.-subtractFrom (.-TemporalAmount js-joda)))