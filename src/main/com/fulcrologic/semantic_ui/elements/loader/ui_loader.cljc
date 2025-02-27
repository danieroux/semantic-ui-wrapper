(ns com.fulcrologic.semantic-ui.elements.loader.ui-loader
  (:require
    [com.fulcrologic.semantic-ui.factory-helpers :as h]
    [semantic-ui-react$Loader :as Loader]))

  (def ui-loader
  "A loader alerts a user to wait for an activity to complete.

  Props:
    - active (bool): A loader can be active or visible.
    - as (elementType): An element type to render as (string or function).
    - children (node): Primary content.
    - className (string): Additional classes.
    - content (custom): Shorthand for primary content.
    - disabled (bool): A loader can be disabled or hidden.
    - indeterminate (bool): A loader can show it's unsure of how long a task will take.
    - inline (bool|enum): Loaders can appear inline with content. (centered)
    - inverted (bool): Loaders can have their colors inverted.
    - size (enum): Loaders can have different sizes. (mini, tiny, small, medium, large, big, huge, massive)"
   #?(:cljs (h/factory-apply Loader)))
