## Functions changed:

- Operator replacement
- NULL --> nullWarp10
- \+ for List --> Function specific (addCloneList)
- +! --> Specific function (addList...)
- ! --> not
- [] --> emptyList
- {} --> emptyMap
- BREAK --> breakWarp10
- CONTINUE --> continueWarp10
- RETURN --> returnWarp10
- <% ... %> --> Macro
- [ ... ] --> List
- { ... } --> Map
- <%, %> --> openMacro and closeMacro
- <%, %> --> openList and closeList
- <%, %> --> openMap and closeMacro
- <S, S> --> openSafeScript and closeSafeScript

## Multiple functions when a parameter is optional

## Macro functions to rework

- LFLATMAP
- LMAP
- FOREACH
- FOR
- FORSTEP
- IFT
- IFTE
- SWITCH
- UNTIL
- WHILE
- SORTBY

## Rework todo - Features idea list

- Frameworks operators refactoring --> Static, load from JSON, add a WS parameter
- Native operators
- List and maps framework
- Native time series framework
- Macro framework
- Type function exit
- Script validator? Spelling error/Verify at exec (Exeption)/Post ws generation check
- WarpScript in a function?
- Create a WsStack ?
- Manage String functions too
- Add "_NULL" to defaultValue (example for list/add function)
- Impl FIND & FINDSTATS methods
- Impl FETCH fw (BOOLEAN & co)

## Done: 

- Split JSON and WarpScript extension per function category
- Apply refactoring
- Reducer Framework
