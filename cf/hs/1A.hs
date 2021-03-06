-- | problem 1A, body
fillSquare :: Int -> Int-> Int -> Integer
fillSquare n m a = widthnum * heightnum
    where widthnum = ceiling((fromIntegral (n :: Int))/(fromIntegral (a :: Int )))
          heightnum = ceiling((fromIntegral (m :: Int))/(fromIntegral (a :: Int)))


-- | main 
main = do
    sn <- getLine
    let sl = words sn
    let n = read (sl !! 0) :: Int
    let m = read (sl !! 1) :: Int
    let a = read (sl !! 2) :: Int
    putStrLn $ show (fillSquare n m a)
