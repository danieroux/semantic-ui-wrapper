# Semantic UI Wrapper

A library to interface with Semantic UI React. The NPM support in Clojurescript
is not yet advanced enough to support using Semantic UI directly, and 
the cljsjs support leaves a few things to be desired:

1. You have to extract each component into a local symbol
2. You have to make a React factory for each element
3. There are no doc strings

This library is a simple set of cljs wrappers around the `cljsjs/semantic-ui-react`
package that makes it a bit easier to use:

- It includes symbols for all of the icon names (800+)
- It includes factory functions for all of the elements, modules, etc.
   - The factory functions have doc strings that summarize the props available
- It does not have a hard dependency on the semantic-ui-react
library (scope is provided), so you can upgrade that library without needing this
one to change.

# Usage

Add dependency

## Elements, Modules, etc.

The wrappers in the `factories` namespace create low-level React elements,
which use Javascript objects for their props. The docstrings on these
symbols are derived from the JSON docstrings extracted from the real
semantic-ui-react library.

## Icons

The `icons` namespace simply has symbol definitions for each legal string icon name. This
allows you to use your IDE's code completion to find icon names as long as
you can remember something about that name.

# Using with CLJSJS React

Make sure you have a consistent version of React by analyzing your dependencies. Libraries like
Om have direct dependencies on React, as does the cljsjs semantic ui package.

# Using with NPM React

1. Make sure to exclude react from all cljs deps
2. Add react and react-dom to your npm-deps
3. Add a foreign lib config to cause the npm version to appear like the cljsjs version

# LICENSE

Copyright 2017 by Fulcrologic

MIT Public License