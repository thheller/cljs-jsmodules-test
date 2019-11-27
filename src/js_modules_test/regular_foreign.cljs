(ns js-modules-test.regular_foreign
  (:require [js-joda]))

(println (.now (.-LocalDate js-joda)))