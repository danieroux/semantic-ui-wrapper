(ns fulcrologic.semantic-ui.factories
  (:require
    cljsjs.semantic-ui-react
    goog.object))

(defn factory-apply
  [class]
  (fn [props & children]
    (apply js/React.createElement
      class
      props
      children)))

(def semantic-ui js/semanticUIReact)

(defn get-sui
  ([cls]
   (goog.object/get semantic-ui cls))
  ([cls member]
   (goog.object/getValueByKeys semantic-ui cls member)))

(defn sui-factory
  ([cls] (factory-apply (get-sui cls)))
  ([cls member] (factory-apply (get-sui cls member))))

(def ui-button
  "A button

  props (a javascript object)
  "
  (sui-factory "Button"))

(def ui-button-content (sui-factory "Button" "Content"))
(def ui-button-group (sui-factory "Button" "Group"))
(def ui-button-or (sui-factory "Button" "Or"))
(def ui-container (sui-factory "Container"))
(def ui-divider (sui-factory "Divider"))
(def ui-flag (sui-factory "Flag"))
(def ui-header (sui-factory "Header"))
(def ui-header-content (sui-factory "Header" "Content"))
(def ui-header-subheader (sui-factory "Header" "Subheader"))
(def ui-icon (sui-factory "Icon"))
(def ui-icon-group (sui-factory "Icon" "Group"))
(def ui-image (sui-factory "Image"))
(def ui-image-group (sui-factory "Image" "Group"))
(def ui-input (sui-factory "Input"))
(def ui-label (sui-factory "Label"))
(def ui-label-detail (sui-factory "Label" "Detail"))
(def ui-label-group (sui-factory "Label" "Group"))
(def ui-list (sui-factory "List"))
(def ui-list-content (sui-factory "List" "Content"))
(def ui-list-description (sui-factory "List" "Description"))
(def ui-list-header (sui-factory "List" "Header"))
(def ui-list-icon (sui-factory "List" "Icon"))
(def ui-list-item (sui-factory "List" "Item"))
(def ui-list-list (sui-factory "List" "List"))
(def ui-loader (sui-factory "Loader"))
(def ui-rail (sui-factory "Rail"))
(def ui-reveal (sui-factory "Reveal"))
(def ui-reveal-content (sui-factory "Reveal" "Content"))
(def ui-segment (sui-factory "Segment"))
(def ui-segment-group (sui-factory "Segment" "Group"))
(def ui-step (sui-factory "Step"))
(def ui-step-content (sui-factory "Step" "Content"))
(def ui-step-description (sui-factory "Step" "Description"))
(def ui-step-group (sui-factory "Step" "Group"))
(def ui-step-title (sui-factory "Step" "Title"))
(def ui-breadcrumb (sui-factory "Breadcrumb"))
(def ui-breadcrumb-divider (sui-factory "Breadcrumb" "Divider"))
(def ui-breadcrumb-section (sui-factory "Breadcrumb" "Section"))
(def ui-form (sui-factory "Form"))
(def ui-form-field (sui-factory "Form" "Field"))
(def ui-form-button (sui-factory "Form" "Button"))
(def ui-form-checkbox (sui-factory "Form" "Checkbox"))
(def ui-form-dropdown (sui-factory "Form" "Dropdown"))
(def ui-form-group (sui-factory "Form" "Group"))
(def ui-form-input (sui-factory "Form" "Input"))
(def ui-form-radio (sui-factory "Form" "Radio"))
(def ui-form-select (sui-factory "Form" "Select"))
(def ui-form-textarea (sui-factory "Form" "TextArea"))
(def ui-grid (sui-factory "Grid"))
(def ui-grid-row (sui-factory "Grid" "Row"))
(def ui-grid-column (sui-factory "Grid" "Column"))
(def ui-menu (sui-factory "Menu"))
(def ui-menu-header (sui-factory "Menu" "Header"))
(def ui-menu-item (sui-factory "Menu" "item"))
(def ui-menu-menu (sui-factory "Menu" "Menu"))
(def ui-message (sui-factory "Message"))
(def ui-message-content (sui-factory "Message" "Content"))
(def ui-message-header (sui-factory "Message" "Header"))
(def ui-message-list (sui-factory "Message" "List"))
(def ui-message-item (sui-factory "Message" "Item"))
(def ui-table (sui-factory "Table"))
(def ui-table-body (sui-factory "Table" "Body"))
(def ui-table-cell (sui-factory "Table" "Cell"))
(def ui-table-footer (sui-factory "Table" "Footer"))
(def ui-table-header (sui-factory "Table" "Header"))
(def ui-table-header-cell (sui-factory "Table" "HeaderCell"))
(def ui-table-row (sui-factory "Table" "Row"))
(def ui-advertisement (sui-factory "Advertisement"))
(def ui-card (sui-factory "Card"))
(def ui-card-content (sui-factory "Card" "Content"))
(def ui-card-description (sui-factory "Card" "Description"))
(def ui-card-group (sui-factory "Card" "Group"))
(def ui-card-header (sui-factory "Card" "Header"))
(def ui-card-meta (sui-factory "Card" "Meta"))
(def ui-comment (sui-factory "Comment"))
(def ui-comment-author (sui-factory "Comment" "Author"))
(def ui-comment-action (sui-factory "Comment" "Action"))
(def ui-comment-actions (sui-factory "Comment" "Actions"))
(def ui-comment-avatar (sui-factory "Comment" "Avatar"))
(def ui-comment-content (sui-factory "Comment" "Content"))
(def ui-comment-group (sui-factory "Comment" "Group"))
(def ui-comment-metadata (sui-factory "Comment" "Metadata"))
(def ui-comment-text (sui-factory "Comment" "Text"))
(def ui-feed (sui-factory "Feed"))
(def ui-feed-content (sui-factory "Feed" "Content"))
(def ui-feed-date (sui-factory "Feed" "Date"))
(def ui-feed-event (sui-factory "Feed" "Event"))
(def ui-feed-extra (sui-factory "Feed" "Extra"))
(def ui-feed-label (sui-factory "Feed" "Label"))
(def ui-feed-like (sui-factory "Feed" "Like"))
(def ui-feed-meta (sui-factory "Feed" "Meta"))
(def ui-feed-summary (sui-factory "Feed" "Summary"))
(def ui-feed-user (sui-factory "Feed" "User"))
(def ui-item (sui-factory "Item"))
(def ui-item-content (sui-factory "Item" "Content"))
(def ui-item-description (sui-factory "Item" "Description"))
(def ui-item-extra (sui-factory "Item" "Extra"))
(def ui-item-group (sui-factory "Item" "Group"))
(def ui-item-header (sui-factory "Item" "Header"))
(def ui-item-image (sui-factory "Item" "Image"))
(def ui-item-meta (sui-factory "Item" "Meta"))
(def ui-statistic (sui-factory "Statistic"))
(def ui-statistic-group (sui-factory "Statistic" "Group"))
(def ui-statistic-label (sui-factory "Statistic" "Label"))
(def ui-statistic-value (sui-factory "Statistic" "Value"))
(def ui-accordion (sui-factory "Accordion"))
(def ui-accordion-accordion (sui-factory "Accordion" "Accordion"))
(def ui-accordion-content (sui-factory "Accordion" "Content"))
(def ui-accordion-title (sui-factory "Accordion" "Title"))
(def ui-checkbox (sui-factory "Checkbox"))
(def ui-dimmer (sui-factory "Dimmer"))
(def ui-dimmer-dimmable (sui-factory "Dimmer" "Dimmable"))
(def ui-dropdown (sui-factory "Dropdown"))
(def ui-dropdown-divider (sui-factory "Dropdown" "Divider"))
(def ui-dropdown-header (sui-factory "Dropdown" "Header"))
(def ui-dropdown-item (sui-factory "Dropdown" "Item"))
(def ui-dropdown-menu (sui-factory "Dropdown" "Menu"))
(def ui-dropdown-search-input (sui-factory "Dropdown" "SearchInput"))
(def ui-embed (sui-factory "Embed"))
(def ui-modal (sui-factory "Modal"))
(def ui-modal-header (sui-factory "Modal" "Header"))
(def ui-modal-content (sui-factory "Modal" "Content"))
(def ui-modal-description (sui-factory "Modal" "Description"))
(def ui-modal-actions (sui-factory "Modal" "Actions"))
(def ui-popup (sui-factory "Popup"))
(def ui-popup-content (sui-factory "Popup" "Content"))
(def ui-popup-header (sui-factory "Popup" "Header"))
(def ui-progress (sui-factory "Progress"))
(def ui-rating (sui-factory "Rating"))
(def ui-rating-icon (sui-factory "Rating" "Icon"))
(def ui-search (sui-factory "Search"))
(def ui-search-category (sui-factory "Search" "Category"))
(def ui-search-result (sui-factory "Search" "Result"))
(def ui-search-results (sui-factory "Search" "Results"))
(def ui-sidebar (sui-factory "Sidebar"))
(def ui-sidebar-pushable (sui-factory "Sidebar" "Pushable"))
(def ui-sidebar-pusher (sui-factory "Sidebar" "Pusher"))
(def ui-sticky (sui-factory "Sticky"))
(def ui-tab (sui-factory "Tab"))
(def ui-tab-pane (sui-factory "Tab" "Pane"))
(def ui-transition (sui-factory "Transition"))
(def ui-transition-group (sui-factory "Transition" "Group"))
(def ui-visibility (sui-factory "Visibility"))
(def ui-confirm (sui-factory "Confirm"))
(def ui-portal (sui-factory "Portal"))
(def ui-responsive (sui-factory "Responsive"))
(def ui-radio (sui-factory "Radio"))
(def ui-select (sui-factory "Select"))
(def ui-textarea (sui-factory "TextArea"))