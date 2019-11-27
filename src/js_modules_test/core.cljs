(ns js-modules-test.core
  (:require [js-joda]))


(println (.now (.-LocalDate js-joda)))