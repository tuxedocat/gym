-- | problem 4A, body
checkWatermelon :: Int -> String
checkWatermelon w
    | w == 2                  = "NO"
    | (even w)&&even(w - 2)   = "YES"
    | otherwise               = "NO"

-- | main with IO
main = do
    wl <- getLine
    let w = read ((words wl) !! 0) :: Int
    putStrLn $ show (checkWatermelon w)