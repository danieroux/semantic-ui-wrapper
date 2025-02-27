(ns com.fulcrologic.semantic-ui.elements.list.ui-list-item
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    [semantic-ui-react$ListItem :as ListItem]))

  (def ui-list-item
  "A list item can contain a set of items.

  Props:
    - active (bool): A list item can active.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - description (custom): Shorthand for ListDescription.
    - disabled (bool): A list item can disabled.
    - header (custom): Shorthand for ListHeader.
    - icon (custom): Shorthand for ListIcon. ()
    - image (custom): Shorthand for Image. ()
    - onClick (func): A ListItem can be clicked
    - value (string): A value for an ordered list."
   #?(:cljs (h/factory-apply ListItem)))
