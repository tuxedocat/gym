import Data.IORef

-- Define 'foreach'
foreach = flip mapM_

-- Define 'while'
while test action = do
    val <- test
    if val then do {action;while test action}
        else return ()

-- Some helpers for use with 'while':
incr ref = modifyIORef ref (+1)
test ref f = do { val <- readIORef ref; return (f val) }

-- Exercise them. Equivalent Python code:
-- for x in range(1,11): 
--     print x
--     i = 0
-- while i < 5:
--     print "Still running"
--     i += 1

main = do
    foreach [1..10] print
    ref <- newIORef 0
    while (test ref (< 5))
        (do 
            print "Still running!"
            incr ref)


