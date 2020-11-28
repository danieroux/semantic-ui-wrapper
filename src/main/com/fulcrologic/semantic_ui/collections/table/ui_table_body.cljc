(ns com.fulcrologic.semantic-ui.collections.table.ui-table-body
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/collections/Table/TableBody" :default TableBody]))

  (def ui-table-body
  "

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes."
   #?(:cljs (h/factory-apply TableBody)))
