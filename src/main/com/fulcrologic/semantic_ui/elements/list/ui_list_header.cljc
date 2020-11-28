(ns com.fulcrologic.semantic-ui.elements.list.ui-list-header
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    ["semantic-ui-react/dist/commonjs/elements/List/ListHeader" :default ListHeader]))

  (def ui-list-header
  "A list item can contain a header.

  Props:
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content."
   #?(:cljs (h/factory-apply ListHeader)))
